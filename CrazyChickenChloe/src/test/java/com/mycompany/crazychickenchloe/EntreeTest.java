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
public class EntreeTest {
    
    @Test
    public void testConstructor() {
        Entree entree = new Entree("Test Entree", 76);
        assertEquals("Test Entree", entree.getName());
        assertEquals(76, entree.getPrice(), 0.01);
    }

    @Test
    public void testInheritedMethods() {
        Entree entree = new Entree("Test Entree", 76);
        assertEquals("Test Entree", entree.getName());
        assertEquals(76, entree.getPrice(), 0.01);
        assertEquals("Test Entree", entree.toString());
    }
}
