/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignmentone;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author shali
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private String email;
    private String course;

    public Student(String id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "STUDENT ID: " + id + "\n" +
               "STUDENT NAME: " + name + "\n" +
               "STUDENT AGE: " + age + "\n" +
               "STUDENT EMAIL: " + email + "\n" +
               "STUDENT COURSE: " + course + "\n";
    }

    private static ArrayList<Student> students = new ArrayList<>();
   

    public static void captureStudent() {
        String id = JOptionPane.showInputDialog("Enter the student id:");
        String name = JOptionPane.showInputDialog("Enter the student name:");
        int age = 0;
        
        while (true) {
            try {
                String ageStr = JOptionPane.showInputDialog("Enter the student age:");
                age = Integer.parseInt(ageStr);
                if (age >= 16) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Student age must be 16 or older.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid numeric age.");
            }
        }

        String email = JOptionPane.showInputDialog("Enter the student email:");
        while (!isValidEmail(email)) {
            email = JOptionPane.showInputDialog("Enter a valid student email:");
        }

        String course = JOptionPane.showInputDialog("Enter the student course:");

        Student student = new Student(id, name, age, email, course);
        students.add(student);

        JOptionPane.showMessageDialog(null, "Student details have been successfully saved.");
    }

    public static Student searchStudent(String searchId) {
        for (Student student : students) {
            if (student.getId().equals(searchId)) {
                return student;
            }
        }
        return null; // Student not found
    }

    public static boolean deleteStudent(String deleteId) {
        Student studentToDelete = null;
        for (Student student : students) {
            if (student.getId().equals(deleteId)) {
                studentToDelete = student;
                break;
            }
        }

        if (studentToDelete != null) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete student " + deleteId + " from the system?");
            if (confirm == JOptionPane.YES_OPTION) {
                students.remove(studentToDelete);
                return true; // Student deleted successfully
            }
        }
        
        return false; // Student not found or deletion canceled
    }

    public static String generateStudentReport() {
        if (students.isEmpty()) {
            return "No students found.";
        }

        StringBuilder report = new StringBuilder("STUDENT REPORT\n\n");
        int studentCount = 1;

        for (Student student : students) {
            report.append("Student ").append(studentCount).append("\n");
            report.append(student.toString()).append("\n");
            studentCount++;
        }

        return report.toString();
    }

    private static boolean isValidEmail(String email) {
        // Basic email validation 
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}
