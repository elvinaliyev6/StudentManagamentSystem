/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import service.MenuAddStudentService;
import service.MenuAddTeacherService;
import service.MenuExitService;
import service.MenuLoginService;
import service.MenuRegisterService;
import service.MenuService;
import service.MenuShowStudentService;
import service.MenuShowTeacherService;
import static util.MenuUtil.showMenu;

/**
 *
 * @author Elvin Aliyev
 */
public enum Menu {
    REGISTER(1, "REGISTER", new MenuRegisterService()),
    LOGIN(2, "Login", new MenuLoginService()),
    ADD_TEACHER(3, "Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5, "Show all teachers", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6, "Show all students",new MenuShowStudentService()),
    EXIT(7, "Exit",new MenuExitService()),
    UNKNOWN;

    private int number;
    private String label;
    private MenuService service;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    Menu(int number, String label, MenuService service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public MenuService getMenu() {
        return service;
    }

    public void setMenu(MenuService menu) {
        this.service = menu;
    }

    Menu() {

    }

    @Override
    public String toString() {
        return number + ". " + label;
    }

    public void process() {
        service.process();
        showMenu();
    }

}
