/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crazychickenchloe;

import javax.swing.JOptionPane;

/**
 *
 * @author shali
 */

/*
Problem: Crazy chicken chloe did not have a take away feature in their restaurant
This program adds in a takeaway feature to the restaurant 
It allows customers to order either starters or entrees
Users may choose the quantity of each item they want
when the user finishes the order it will display what they ordered, the cost of each of the items and their quantity
and the total bill
*/
public class CrazyChickenChloe {

    public static void main(String[] args) {
        Dish[][] menu = {
            {new Starters("Chicken wings (4)", 35), new Starters("Chicken nuggets (4)", 24)},
            {new Entree("Chicken bucket (6)", 76), new Entree("Chicken burger", 50)}
        };

        double totalBill = 0.0;
        StringBuilder orderSummary = new StringBuilder("Order Summary:\n");

        while (true) {
            int categoryChoice = JOptionPane.showOptionDialog(
                    null,
                    "Select a category:",
                    "Crazy Chicken Chloe Takeaway",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"Starters", "Entrees", "Finish Order"},
                    2
            );

            if (categoryChoice == 2) {
                break; // Finish ordering
            }

            int dishChoice = JOptionPane.showOptionDialog(
                    null,
                    "Select a dish:",
                    "Crazy Chicken Chloe Takeaway",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    menu[categoryChoice],
                    menu[categoryChoice][0]
            );

            if (dishChoice == -1) {
                continue; // User canceled
            }

            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));

            Dish selectedDish = menu[categoryChoice][dishChoice];
            double subtotal = selectedDish.getPrice() * quantity;
            totalBill += subtotal;

            orderSummary.append(quantity)
                    .append(" x ")
                    .append(selectedDish.getName())
                    .append(" = R")
                    .append(subtotal)
                    .append("\n");
        }

        JOptionPane.showMessageDialog(
                null,
                "Order Summary:\n" + orderSummary.toString() +
                        "Total Bill: R" + totalBill,
                "Crazy Chicken Chloe Takeaway",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
    

