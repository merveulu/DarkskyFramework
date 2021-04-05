package com.darksky.base;

import com.darksky.pages.LoginPage;

public class PageManager {

    public static LoginPage loginPage;

    public static void initialize() {
        //initialize pages
        loginPage = new LoginPage();
    }
}
