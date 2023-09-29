/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignmentone;

import javax.swing.JOptionPane;

/**
 *
 * @author shali
 */
public class AssignmentOne {

    public static void main(String[] args) {
while (true) {
            String choice = JOptionPane.showInputDialog("STUDENT MANAGEMENT APPLICATION\n" +
                    "***********************************\n" +
                    "Enter (1) to launch menu or any other key to exit");

            if (choice == null || !choice.equals("1")) {
                break; // Exit the application
            }

            String menuChoice = showMenu();

            switch (menuChoice) {
                case "1":
                    Student.captureStudent();
                    break;
                case "2":
                    String searchId = JOptionPane.showInputDialog("Enter the student id to search:");
                    Student student = Student.searchStudent(searchId);
                    if (student != null) {
                        JOptionPane.showMessageDialog(null, student.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Student with Student id: " + searchId + " was not found");
                    }
                    break;
                case "3":
                    String deleteId = JOptionPane.showInputDialog("Enter the student id to delete:");
                    boolean deleted = Student.deleteStudent(deleteId);
                    if (deleted) {
                        JOptionPane.showMessageDialog(null, "Student with Student id: " + deleteId + " was deleted!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Student with Student id: " + deleteId + " was not found");
                    }
                    break;
                case "4":
                    String report = Student.generateStudentReport();
                    JOptionPane.showMessageDialog(null, report);
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Exiting the application.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static String showMenu() {
        return JOptionPane.showInputDialog("Please select one of the following menu items:\n" +
                "(1) Capture a new student.\n" +
                "(2) Search for a student.\n" +
                "(3) Delete a student.\n" +
                "(4) Print student report.\n" +
                "(5) Exit Application.");
    }
}


