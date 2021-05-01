/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Config;
import bean.Student;

/**
 *
 * @author Elvin Aliyev
 */
public class MenuShowStudentService extends MenuService{

    @Override
    public void process() {
        Student[] students=Config.instance().students;
        if(students.length==0){
            System.out.println("There is no students. Please add students");
            return;
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        Config.instance().students=students;
    }
    
}
