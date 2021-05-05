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
public class MenuLoginService extends MenuService {

    @Override
    public void process() {
        System.out.println("Enter username: ");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();

        System.out.println("Enter password: ");
        sc = new Scanner(System.in);
        String password = sc.nextLine();

        if (Config.instance().username == null || Config.instance().password == null) {
            System.out.println("Sorry, you are not registered");
            showMenu();
        } else if (!(username.equals(Config.instance().username) && password.equals(Config.instance().password))) {
            System.out.println("Oops. Username or password is invalid. Please try again");
            process();
        } else {
            System.out.println("You logged in successfully");
        }
        Config.setLoggedIn(true);
        
    }

}
