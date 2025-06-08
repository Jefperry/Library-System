/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquincollege.library;

/**
 * Book class which represents a book in a library
 * Each book has a title , author and indication if the book is available or not .
 * @author HP
 */
public class Book {
    private final String title;
    private final String author;
    private boolean available;

 /**
  * Constructor with the given parameters
  * @param title title of the book
  * @param author  author of the boom
  * @param available availability of the book
  */
    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    /**
     * 
     * @return title of the book
     */
    public String getTitle() {
        return title;
    }
    /**
     * 
     * @return available
     */
    public boolean isAvailable() {
        return available;
    }
    /**
     * 
     * @param available set available
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }
       /**
        * 
        * @return a string format to display books
        */
    @Override
    public String toString() {
        return String.format("%s by %s [%s]", title, author, available ? "Available" : "Borrowed");
    }
}


