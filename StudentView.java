/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student.StudentView;

import Student.Student;

/**
 *
 * @author WARDA YOUSAF
 */
public class StudentView {
    
    public void displayStudentInfo(Student student) {
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + student.getName());
        System.out.println("CGPA: " + student.getCgpa());
        System.out.println("Category: " + student.getCategory());
        System.out.println("=============================");
    }
    
    public void displayMessage(String message) {
        System.out.println(message);
    }
    
    public void displayError(String error) {
        System.out.println("Error: " + error);
    }
}
