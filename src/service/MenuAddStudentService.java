/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import util.FileUtility;

/**
 *
 * @author Elvin Aliyev
 */
public class MenuAddStudentService extends MenuService{

    @Override
    public void process() {
        System.out.println("Enter name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        
        sc=new Scanner(System.in);
        System.out.println("Enter surname");
        String surname=sc.nextLine();
        
        sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        
        System.out.println("Enter school name");
        sc=new Scanner(System.in);
        String schoolName=sc.nextLine();
        
        System.out.println("Enter scholarship");
        sc=new Scanner(System.in);
        double scholarship=sc.nextDouble();
        
        Student s=new Student();
        s.setName(name);
        s.setSurname(surname);
        s.setAge(age);
        s.setScholarship(scholarship);
        s.setSchoolname(schoolName);
        
        Config.instance().appendStudent(s);
        System.out.println("Student added");
        
        Config.save();
    }
    
}
