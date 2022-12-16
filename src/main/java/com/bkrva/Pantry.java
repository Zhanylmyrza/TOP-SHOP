package com.bkrva;

import java.util.UUID;
import javax.validation.constraints.NotBlank;


public class Pantry {
  @NotBlank(message = "Gender cannot be blank")
  private String gender;
  @NotBlank(message = "Category cannot be blank")
  private String category;
  @NotBlank(message = "Name cannot be blank")
  private String name;
  private String size;
  private String price;
  private String id;
  
  
  public Pantry() {
    this.id = UUID.randomUUID().toString();
  }
  

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
  
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }
  
  
}
