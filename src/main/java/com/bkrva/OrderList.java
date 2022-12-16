package com.bkrva;

import java.util.UUID;
  

public class OrderList {
  String gender;
  String category;
  String name;
  String size;
  String price;
  String id;
  
  public OrderList(String gender,String category,String name,String size,String price) {
    this.gender = gender;
    this.category = category;
    this.name = name;
    this.size = size;
  }
  // public OrderList() {
  //   this.id = UUID.randomUUID().toString();
  // }
  public OrderList(OrderList source) {
    this.gender = source.gender;
    this.category = source.category;
    this.name = source.name;
    this.size = source.size;
    this.price = source.price;
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
