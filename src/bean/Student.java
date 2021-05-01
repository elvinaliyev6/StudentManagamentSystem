/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Elvin Aliyev
 */
public class Student extends Person{
    private String schoolName;
    private double scholarship;

    public String getSchoolname() {
        return schoolName;
    }

    public void setSchoolname(String schoolname) {
        this.schoolName = schoolname;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

   

    
    
    
}
