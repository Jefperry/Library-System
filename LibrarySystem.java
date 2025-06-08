/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquincollege.library;

/**
 * Welcome message to the Library 
 * The library manager class is initialized and the system starts.
 * @author Jefperry Achu
 */ 
public class LibrarySystem {
    /**
     * Main method that launches the library management system
     * @param args 
     */
     public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System!");
        LibraryManager manager = new LibraryManager();
        manager.run(); //start library management loop
    }
}
