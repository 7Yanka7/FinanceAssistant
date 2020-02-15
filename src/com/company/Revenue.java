package com.company;

public class Revenue {
    private int sumRub;
    private CategoryOfRevenue category;

    public Revenue(int sumRub, CategoryOfRevenue category) {
        this.sumRub = sumRub;
        this.category = category;
    }
    public int getSumRub() {
        return sumRub;
    }

    public CategoryOfRevenue getCategory(){
        return category;
    }
}

