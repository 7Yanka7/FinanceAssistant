package com.company;
import javax.swing.*;
import java.awt.event.ActionListener;
public class AssistentView extends JFrame {
    private JLabel cost = new JLabel("Enter the category of cost");
    private JTextField categoryCost = new JTextField(15);
    private JLabel costPrice = new JLabel("Enter the price of cost");
    private JTextField integerCost = new JTextField(10);
    private JButton addCost = new JButton("add");
    private JLabel revenue = new JLabel("Enter the category of revenue");
    private JTextField categoryRevenue = new JTextField(15);
    private JLabel revenuePrice = new JLabel("Enter the price of revenue");
    private JTextField integerRevenue = new JTextField(10);
    private JButton addRevenue = new JButton("add");
    private JButton returnBalance = new JButton("Balance");
    private JTextField BalanceResult = new JTextField(10);
    AssistentView()
    {
        JPanel panel = new JPanel();

        setSize(750, 400);
        setLocation(750,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(cost);
        panel.add(categoryCost);
        panel.add(costPrice);
        panel.add(integerCost);
        panel.add(addCost);
        panel.add(revenue);
        panel.add(categoryRevenue);
        panel.add(revenuePrice);
        panel.add(integerRevenue);
        panel.add(addRevenue);
        panel.add(returnBalance);
        panel.add(BalanceResult);
        this.add(panel);
}
    public int getReturnIntegerCost()
    {
        return Integer.parseInt(integerCost.getText());
    }
    public String getCategoryCost()
    {
        return categoryCost.getText();
    }
    public int getReturnIntegerRevenue()
    {
        return Integer.parseInt(integerRevenue.getText());
    }
    public String getCategoryRevenue()
    {
        return categoryRevenue.getText();
    }
    public int getReturnBalanceResult()
    {
        return Integer.parseInt(BalanceResult.getText());
    }
    public void setBalanceResult(int balance)
    {
        BalanceResult.setText(Integer.toString(balance));
    }
    public void addCostListener(ActionListener listenerForAddCost)
    {
        addCost.addActionListener(listenerForAddCost);
    }
    public void addRevenueListener(ActionListener listenerForAddRevenue)
    {
        addRevenue.addActionListener(listenerForAddRevenue);
    }
    public void addBalanceListener(ActionListener listenerForBalance)
    {
        returnBalance.addActionListener(listenerForBalance);
    }
    public void displayErrorMessage(String errorMessage)
    {
        JOptionPane.showMessageDialog(this,errorMessage);
    }
}
