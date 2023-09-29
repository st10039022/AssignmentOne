/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.crazychickenchloe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author shali
 */
public class DishTest {
    
     @Test
    public void testGetName() {
        Dish dish = new Dish("Test Dish", 24);
        String actualName = dish.getName();
        assertEquals("Test Dish", actualName);
    }

    @Test
    public void testGetPrice() {
        Dish dish = new Dish("Test Dish", 24);
        double actualPrice = dish.getPrice();
        assertEquals(24, actualPrice, 0.01); 
    }

    @Test
    public void testToString() {
        Dish dish = new Dish("Test Dish", 24);
        String actualString = dish.toString();
        assertEquals("Test Dish", actualString);
    }
}
