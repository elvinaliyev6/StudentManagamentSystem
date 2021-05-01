/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import util.FileUtility;

/**
 *
 * @author Elvin Aliyev
 */
public class Config implements Serializable{

    public static boolean loggedIn;

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }
    public  Teacher[] teachers=new Teacher[0];
    public Student[] students=new Student[0];
    
    private static Config config=null;
    
    public String username;
    public String password;
    private static final String fileName="app.obj";
    
    public static void initalize() {
        Object obj=FileUtility.readFileDeeserialize("app.obj");
        if(obj==null){
            return;
        }
        
        if(obj instanceof Config){
            config=(Config) obj;
        }
    }
    
    public void appendTeacher(Teacher t){
        Teacher[] newTeachers=new Teacher[teachers.length+1];
        
        for (int i = 0; i < teachers.length; i++) {
         newTeachers[i]=teachers[i];   
        }
        newTeachers[newTeachers.length-1]=t;
        teachers=newTeachers;
    }
    
    public void appendStudent(Student s){
        Student[] newStudents=new Student[students.length+1];
        
        for (int i = 0; i < students.length; i++) {
            newStudents[i]=students[i];
        }
        
        newStudents[newStudents.length-1]=s;
        students=newStudents;
    }
    
    public static Config instance(){
        if(config==null){
            config=new Config();
        }
        return config;
    }
    
    public static void save(){
        FileUtility.writeObjectToFile(Config.instance(),"app.obj");
    }
    
}
