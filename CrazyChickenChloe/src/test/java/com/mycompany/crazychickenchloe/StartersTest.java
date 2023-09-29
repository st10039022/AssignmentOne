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
public class StartersTest {
    
    @Test
    public void testConstructor() {
        Starters starters = new Starters("Test Starter", 35);
        assertEquals("Test Starter", starters.getName());
        assertEquals(35, starters.getPrice(), 0.01);
    }

    @Test
    public void testInheritedMethods() {
        Starters starters = new Starters("Test Starter", 35);
        assertEquals("Test Starter", starters.getName());
        assertEquals(35, starters.getPrice(), 0.01);
        assertEquals("Test Starter", starters.toString());
    }
}
