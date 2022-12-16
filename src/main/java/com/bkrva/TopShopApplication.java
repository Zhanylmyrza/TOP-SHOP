package com.bkrva;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TopShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopShopApplication.class, args);
		
		OrderList[] lists = new OrderList[] {
			new OrderList("Female",	"Accessories","Hat","XL","940"),
			new OrderList("Male","	Outerwear",	"Jacket","XXL	","560")};
	}
}

// Female	Accessories	Hat		480
// Male	Outerwear	Jacket	XL	1,560
// Female	Top	Sweater	M	1,660
// Male	Bottom	Cargo	XXL	1,765
// Female	Accessories	Cap		380
// Male	Outerwear	Trench	L	870
// Female	Top	Sweatshirt	M	1,480
// Male	Bottom	Pants	XL	798
// Female	Accessories	Apron	XXL	869
// Male	Outerwear	Vest	XL	579
// Female	Top	Cardigan	M	1,578
// Male	Bottom	Shorts	XL	708
// Female	Accessories	shawl		1,780
// Male	Outerwear	Blazer	L	698
// Female	Top	Tanktop	M	4,799
// Male	Bottom	Sweatpants	XL	555
// Female	Accessories	headcloth		468
// Male	Outerwear	Vest	XXL	876
// Female	Top	Shirt	XL	9,876
// Female	Bottom	Skirt	M	8,765
