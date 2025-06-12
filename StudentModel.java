/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student.StudentModel;

import Student.Student;

/**
 *
 * @author WARDA YOUSAF
 */
public class StudentModel {
    private Student student;
    
    public StudentModel() {
        this.student = new Student();
    }
    
    public void setStudentData(String name, double cgpa) {
        student.setName(name);
        student.setCgpa(cgpa);
    }
    
    public Student getStudent() {
        return student;
    }
    
    public String getStudentCategory() {
        return student.getCategory();
    }
}
