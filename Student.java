/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author WARDA YOUSAF
 */
public class Student {
    private String name;
    private double cgpa;
    
    public Student() {}
    
    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getCgpa() {
        return cgpa;
    }
    
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    
    public String getCategory() {
        if (cgpa >= 3.0) {
            return "Good Student";
        } else {
            return "Bad Student";
        }
    }
}

