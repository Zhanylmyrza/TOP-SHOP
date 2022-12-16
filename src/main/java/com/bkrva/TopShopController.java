package com.bkrva;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TopShopController {
    List<Pantry> garmentsInf = new ArrayList<>();
    @GetMapping("/")
    public String getHome() {
        return "page";
    }
    @GetMapping("/form")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        int index = getGarmentsIndex(id);
        model.addAttribute("pantry", index == Constant.NOT_FOUND ? new Pantry() : garmentsInf.get(index));
        return "form";
    }
    @PostMapping("/handleSubmit")
    public String submitForm(@Valid Pantry pantry, BindingResult result) {
        if(result.hasErrors())return "form";
        
        int index = getGarmentsIndex(pantry.getId());
        if (index == Constant.NOT_FOUND) {
            garmentsInf.add(pantry);
        } else {
            garmentsInf.set(index, pantry);
        }
        return "redirect:/garments";
    }
    @GetMapping("/garments")
    public String getGarments(Model model) {
        model.addAttribute("garments", garmentsInf);
        return "garments";
    }
    public int getGarmentsIndex(String id) {
        for (int i = 0; i < garmentsInf.size(); i++) {
            if (garmentsInf.get(i).getId().equals(id)) return i;
        }
        return Constant.NOT_FOUND;
    }
    @GetMapping("/sign-up")
    public String getRegister(Model model) {
        model.addAttribute("user", new User());
        return "sign-up";
    }
    @PostMapping("/submitItem")
    public String handleSubmit(@Valid User user, BindingResult result) {
        if (result.hasErrors()) return "sign-up";
        return "redirect:/result";
    }
    
    @GetMapping("/result")
    public String getResult() {
        return "about";
    }
    
    @GetMapping("/lookbook")
    public String getResults() {
        return "lookbook";
    }
    @GetMapping("/sign-in")
    public String getRegisterr(Model model) {
        model.addAttribute("user", new User());
        return "sign-in";
    }
    
    
}