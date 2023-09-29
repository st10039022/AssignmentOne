/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.assignmentone;

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

/*
**************************************************************************
**************************************************************************
FOR TESTS TO RUN ENTER VALUES THAT ARE INCLUDED IN EACH TEST
**************************************************************************
**************************************************************************
*/
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student("10111", "John Doe", 20, "johndoe@ymail.com", "disd");
        String expResult = "10111";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student("10111", "John Doe", 20, "johndoe@ymail.com", "disd");
        String expResult = "John Doe";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
       Student instance = new Student("10111", "John Doe", 20, "johndoe@ymail.com", "disd");
        int expResult = 20;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Student.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
         Student instance = new Student("10111", "John Doe", 20, "johndoe@ymail.com", "disd");
        String expResult = "johndoe@ymail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCourse method, of class Student.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Student instance = new Student("10111", "John Doe", 20, "johndoe@ymail.com", "disd");
        String expResult = "disd";
        String result = instance.getCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student("10111", "John Doe", 20, "johndoe@ymail.com", "disd");
        String expResult = "STUDENT ID: 10111\n" +
                      "STUDENT NAME: John Doe\n" +
                      "STUDENT AGE: 20\n" +
                      "STUDENT EMAIL: johndoe@ymail.com\n" +
                      "STUDENT COURSE: Computer Science\n";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of captureStudent method, of class Student.
     */
    @Test
    public void testCaptureStudent() {
        System.out.println("captureStudent");
        Student.captureStudent();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchStudent method, of class Student.
     */
    @Test
    public void testSearchStudent() {
        System.out.println("searchStudent");
        String searchId = "";
        Student expResult = null;
        Student result = Student.searchStudent(searchId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
public void testSearchStudent_StudentNotFound() {
    // Call the searchStudent method with an invalid student ID
    String invalidId = "99999";
    Student foundStudent = Student.searchStudent(invalidId);

    // Verify that no student is found (foundStudent should be null)
    assertNull(foundStudent);
}

    /**
     * Test of deleteStudent method, of class Student.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        String deleteId = "";
        boolean expResult = false;
        boolean result = Student.deleteStudent(deleteId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of generateStudentReport method, of class Student.
     */
    @Test
    public void testGenerateStudentReport() {
        System.out.println("generateStudentReport");
        String expResult = "";
        String result = Student.generateStudentReport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
