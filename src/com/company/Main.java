package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
      Balance balance = new Balance();
        Writer writerFileData = null;
        Reader readerFileData = null;
        try{
            String fileData =  "Data.txt";
            writerFileData = new FileWriter(fileData);
            CategoryOfRevenue categRev =  new CategoryOfRevenue("Scholarship");
            CategoryOfCosts categRev1 =  new CategoryOfCosts("Transport");
            Revenue revenue = new Revenue(4000, categRev);
            balance.addRevenue(revenue);
            Cost cost = new Cost(35, categRev1);
            Cost cost1 = new Cost(100, categRev1);
            balance.addCost(cost);
            balance.addCost(cost1);
            System.out.println(balance.getBalance());
            Controller.writeData(balance, writerFileData);
            readerFileData = new FileReader(fileData);
            Balance newBalance = Controller.readerData(readerFileData);
            ArrayList<Cost> ar = newBalance.getCosts();
            for(int i = 0; i < ar.size(); i++)
                System.out.println(ar.get(i));
            ArrayList<Revenue> arr = newBalance.getRevenues();
            for(int i = 0; i < arr.size(); i++)
                System.out.println(arr.get(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            writerFileData.close();
            readerFileData.close();
        }

    }
}
