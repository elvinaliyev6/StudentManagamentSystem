/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Config;
import bean.Teacher;

/**
 *
 * @author Elvin Aliyev
 */
public class MenuShowTeacherService extends MenuService{

    @Override
    public void process() {
        Teacher[] teachers=Config.instance().teachers;
        
        if(teachers.length==0){
            System.out.println("There is no teacher. Please add teacher");
            return;
        }
        
        for (int i = 0; i < teachers.length; i++) {
            System.out.println(teachers[i]);
        }
        Config.instance().teachers=teachers;
    }
    
    
}
