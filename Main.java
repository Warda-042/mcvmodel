/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student.Main;

import Student.StudentController.StudentController;
import Student.StudentModel.StudentModel;
import Student.StudentView.StudentView;

/**
 *
 * @author WARDA YOUSAF
 */
public class Main {
    public static void main(String[] args) {
        // Create MVC components
        StudentModel model = new StudentModel();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        
        System.out.println("=== Student CGPA Evaluation System ===\n");
        
        // Test Case 1: Good Student
        System.out.println("Test Case 1: Good Student");
        controller.setStudentData("Ahmed Ali", 3.5);
        controller.displayStudentInfo();
        controller.evaluateStudent();
        System.out.println();
        
        // Test Case 2: Bad Student
        System.out.println("Test Case 2: Bad Student");
        controller.setStudentData("Sara Khan", 2.3);
        controller.displayStudentInfo();
        controller.evaluateStudent();
        System.out.println();
        
        // Test Case 3: Boundary Case (exactly 3.0)
        System.out.println("Test Case 3: Boundary Case");
        controller.setStudentData("Hassan Malik", 3.0);
        controller.displayStudentInfo();
        controller.evaluateStudent();
        System.out.println();
        
        // Test Case 4: Error handling
        System.out.println("Test Case 4: Error Handling");
        controller.setStudentData("", 3.5); // Empty name
        controller.setStudentData("Invalid Student", 5.0); // Invalid CGPA
        System.out.println();
        
        // Test Case 5: Multiple students
        System.out.println("Test Case 5: Multiple Students");
        String[] names = {"Fatima Sheikh", "Usman Tariq", "Ayesha Nawaz"};
        double[] cgpas = {3.8, 2.1, 3.2};
        
        for (int i = 0; i < names.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            controller.setStudentData(names[i], cgpas[i]);
            controller.displayStudentInfo();
            controller.evaluateStudent();
            System.out.println();
        }
    }
}