/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Config;
import java.util.Scanner;
import static util.MenuUtil.showMenu;

/**
 *
 * @author Elvin Aliyev
 */
public class MenuRegisterService extends MenuService{

    @Override
    public void process() {
        System.out.println("Enter username");
        Scanner sc=new Scanner(System.in);
         Config.instance().username=sc.nextLine();
       
        System.out.println("Enter password");
        sc=new Scanner(System.in);
        Config.instance().password=sc.nextLine();
        System.out.println("You registered successfully");
        
        Config.setLoggedIn(true);
        
        Config.save();
        
    }
    
    
}
