/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquincollege.library;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Simple Library System
 * Library manager class to display books , borrow a book and return a book 
 * @author Jefperry Achu Chi
 */
public class LibraryManager {
    private final ArrayList<Book> books;
    private final Scanner scanner;

    /**
     * Constructor for Library manager and initializes book list and scanner
     */
    public LibraryManager() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
        loadSampleBooks();
    }
/**
 * load books the the list and true to indicate it is available and
 * false to indicate it is not available.
 */
    private void loadSampleBooks() {
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", true));
        books.add(new Book("1984", "George Orwell", false));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", true));
        books.add(new Book("Things Fall Apart", "Chinua Achebe", true));
        books.add(new Book("Across The Mongolo", "John Nkengasong", true));
    }
/**
 * While loop to display the menu and loops until user exists 
 * contains a switch statemnet to display the option the user chooses 
 * if a invalid input is entered a invalid option is printed
 */
    public void run() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String input = scanner.nextLine();

            switch (input) {   //rule switch
                case "1" -> displayBooks();
                case "2" -> borrowBook();
                case "3" -> returnBook();
                case "4" -> {
                    System.out.println("Goodbye!");
                    System.out.println("Programmed by : Jefperry Achu Chi");
                    System.out.println("Junior Developer");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }
/**
 * A  for loop is used to display the amount of books in the library
 * and loops until the user exits.
 */
    
    private void displayBooks() {
        System.out.println("\nBooks in the Library:");
        for (int i = 0; i < books.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, books.get(i));
        }
    }

    /**
     * First displays the books in the library using @displayBooks method 
     * reads entire line as string and it to an integer starting from 0 then
     *checks whether the book index is valid(not negative) and within range
     * and if the book is available to be borrowed it sets it to false(not available )
     * 
     */
    private void borrowBook() {
        displayBooks();
        System.out.print("Enter the book number to borrow: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1; //reads entire line as string and it to an integer startinf from 0

        if (index >= 0 && index < books.size()) {
            Book book = books.get(index);
            if (book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("You borrowed: " + book.getTitle());
            } else {
                System.out.println("Sorry, this book is already borrowed.");
            }
        } else {
            System.out.println("Invalid book number.");
        }
    }
    
    /**
     * Prompts the user to return a book by selecting from a list
     * book is not available, returns the book to available
     */

    private void returnBook() {
        displayBooks();    //list to view books
        System.out.print("Enter the book number to return: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < books.size()) {
            Book book = books.get(index);
            if (!book.isAvailable()) {  // book is not available 
                book.setAvailable(true);  //returns the book to available
                System.out.println("You returned: " + book.getTitle());
            } else {
                System.out.println("This book was not borrowed.");
            }
        } else {
            System.out.println("Invalid book number.");
        }
    }
}
