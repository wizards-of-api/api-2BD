package com.tg.manager;


import com.tg.manager.model.TeamModel;
import com.tg.manager.view.HomeScreen;

import javafx.application.Application;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Application.launch(HomeScreen.class, args);

    }
}