package com.jad;

import com.jad.controller.Controller;

import java.sql.*;

/**
 * The class Main.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.go();
    }
}
