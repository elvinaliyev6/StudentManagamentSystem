/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bean.Config;
import java.util.Scanner;

public class MenuUtil {

    public static Menu find(int n) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == n) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if(menus[i]!=Menu.UNKNOWN){
                if(!(Config.isLoggedIn())){
                    if(menus[i]==Menu.LOGIN || menus[i]==Menu.REGISTER){
                        System.out.println(menus[i]);
                    }
                }
               else if(Config.isLoggedIn() && 
                        (menus[i]!=Menu.LOGIN && menus[i]!=Menu.REGISTER)){
                    System.out.println(menus[i]);
                }
            }
        }
    }

    public static void showMenu() {
        showAllMenu();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Menu menu = find(n);
        menu.process();

    }
}
