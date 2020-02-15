package com.company;

public class CategoryOfCosts {
  private String category;
  public CategoryOfCosts(String category)
  {
      this.category = category;
  }

  public String getCategory(){
      return category;
  }

  @Override
  public String toString(){
      StringBuffer buffer = new StringBuffer();
      buffer.append(this.category);
      return buffer.toString();
  }
}
