package com.company;
import java.util.ArrayList;

public class Balance {
   private ArrayList<Cost> costs;
   private ArrayList<Revenue> revenues;

    public Balance(ArrayList<Cost> costs, ArrayList<Revenue> revenues) {
        this.costs = costs;
        this.revenues = revenues;
    }
    public Balance()
    {
        this.costs = new ArrayList<>(0);
        this.revenues = new ArrayList<>(0);
    }

    public int getBalance()
    {
        int temp = 0;
        for (int i=0 ; i < revenues.size(); i++)
        {
            temp += revenues.get(i).getSumRub();
        }
        for (int i=0 ; i < costs.size(); i++)
        {
            temp -= costs.get(i).getSumRub();
        }
        return temp;

    }

    public ArrayList<Cost> getCosts() {
        return costs;
    }

    public ArrayList<Revenue> getRevenues() {
        return revenues;
    }

    public void setCosts(Cost cost, Cost newCost){
        int index = costs.indexOf(cost);
        costs.set(index, newCost);
    }

    public void setRevenues(Revenue revenue, Revenue newRevenue){
        int index = revenues.indexOf(revenue);
        revenues.set(index, newRevenue);
    }
    
    public void addCost(Cost cost)
    {
        this.costs.add(cost);
    }
    public void addRevenue(Revenue revenue)
    {
        this.revenues.add(revenue);
    }

    public void deleteCost(Cost cost){
        costs.remove(cost);
    }
    public void deleteCost(Revenue revenue){
        revenues.remove(revenue);
    }

    public void clearCosts(){
        costs.clear();
    }

    public void clearRevenues(){
        revenues.clear();
    }

    public void clearAll(){
        costs.clear();
        revenues.clear();
    }
    public int sumCostByCategory(String category){
        int sum = 0;
        for(int i = 0; i < costs.size(); i++){
            if(costs.get(i).equals(category)){
                sum += costs.get(i).getSumRub();
            }
        }
        return sum;
    }

    public int sumRevenueByCategory(String category){
        int sum = 0;
        for(int i = 0; i < revenues.size(); i++){
            if(revenues.get(i).equals(category)){
                sum += revenues.get(i).getSumRub();
            }
        }
        return sum;
    }


}
