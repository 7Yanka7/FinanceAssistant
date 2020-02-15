package com.company;


public class Cost {
    private int sumRub;
    private CategoryOfCosts category;
    public Cost(int sumRub, CategoryOfCosts category) {
        this.sumRub = sumRub;
        this.category = category;
    }
    public int getSumRub() {
        return sumRub;
    }

    public CategoryOfCosts getCategory(){
        return category;
    }
}
