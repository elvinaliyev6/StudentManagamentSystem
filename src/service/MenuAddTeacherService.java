/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Config;
import bean.Student;
import bean.Teacher;
import java.util.Scanner;

/**
 *
 * @author Elvin Aliyev
 */
public class MenuAddTeacherService extends MenuService{

    @Override
    public void process() {
        System.out.println("Enter name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        
        System.out.println("Enter surname");
        sc=new Scanner(System.in);
        String surname=sc.nextLine();
        
        System.out.println("Enter age");
        sc=new Scanner(System.in);
        int age=sc.nextInt();
        
        System.out.println("Enter schoolname");
        sc=new Scanner(System.in);
        String schoolName=sc.nextLine();
        
        System.out.println("Enter salary");
        sc=new Scanner(System.in);
        double salary=sc.nextDouble();
        Student[] students=Config.instance().students;
        
        Teacher t=new Teacher();
        t.setName(name);
        t.setSurname(surname);
        t.setAge(age);
        t.setSalary(salary);
        t.setSchoolName(schoolName);
        t.setStudents(students);
        
        Config.instance().appendTeacher(t);
        System.out.println("Teacher added");
        
        Config.save();
    }
    
}
