package com.company;

public class CategoryOfRevenue {
    private String category;
    public CategoryOfRevenue(String category)
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
