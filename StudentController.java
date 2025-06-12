/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student.StudentController;

import Student.Student;
import Student.StudentModel.StudentModel;
import Student.StudentView.StudentView;

/**
 *
 * @author WARDA YOUSAF
 */
public class StudentController {
    private StudentModel model;
    private StudentView view;
    
    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setStudentData(String name, double cgpa) {
        try {
            if (name == null || name.trim().isEmpty()) {
                view.displayError("Student name cannot be empty!");
                return;
            }
            
            if (cgpa < 0.0 || cgpa > 4.0) {
                view.displayError("CGPA should be between 0.0 and 4.0!");
                return;
            }
            
            model.setStudentData(name, cgpa);
            view.displayMessage("Student data updated successfully!");
            
        } catch (Exception e) {
            view.displayError("Invalid input provided!");
        }
    }
    
    public void displayStudentInfo() {
        Student student = model.getStudent();
        if (student.getName() != null && !student.getName().isEmpty()) {
            view.displayStudentInfo(student);
        } else {
            view.displayError("No student data available!");
        }
    }
    
    public void evaluateStudent() {
        Student student = model.getStudent();
        if (student.getName() != null && !student.getName().isEmpty()) {
            String category = model.getStudentCategory();
            view.displayMessage("Student Category: " + category);
            
            if (student.getCgpa() >= 3.0) {
                view.displayMessage("✓ This student is performing well!");
            } else {
                view.displayMessage("⚠ This student needs improvement!");
            }
        } else {
            view.displayError("No student data available for evaluation!");
        }
    }
}
