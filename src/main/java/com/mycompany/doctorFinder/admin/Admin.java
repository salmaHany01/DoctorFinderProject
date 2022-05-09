/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.doctorFinder.admin;

/**
 *
 * @author DELL
 */
public class Admin {
    private static Admin instance = new Admin();
    private Admin(){}
    private String name = "admin";
    private String password = "admin";
    public static Admin getInstance(){
        return instance;
    }
}
