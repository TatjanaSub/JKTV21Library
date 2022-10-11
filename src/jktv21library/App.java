/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21library;

import entity.Author;
import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private Scanner scanner = new Scanner(System.in);
    private Book[] books = new Book[0];
    
    public void run(){
        boolean repeat = true;
        do{
            System.out.println("Funktsii prilizenija:");
            System.out.println("0. Zakrqt' prilozenie");
            System.out.println("1. Dobavit' knigu" );
            System.out.println("2. Dobavit' chitatelja");
            System.out.println("3. Vqdat' knigu");
            System.out.println("4. Vernut' knigu");
            System.out.println("5. Spisok knig");
            System.out.println("6. Spisok avtorov");
            System.out.print("Vqberite nomer funktsii:");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task){
                case 0:
                    System.out.println("0. Zakrqt' prilozenie");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Dobavit' knigu");
                    Book book = new Book();
                    System.out.println("Vvedite nazvanie knigi: ");
                    book.setTitle(scanner.nextLine());
                    System.out.print("Ukazite kollichestvo avtorov: ");
                    int countAuthorsInBook = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < countAuthorsInBook; i++) {
                        book.addAuthor(createAuthor());
                    }
                    Book[] newBook = Arrays.copyOf(books, books.length+1);
                    newBook[newBook.length-1] = book;
                    books = newBook;
                    break;
                case 2:
                    System.out.println("2. Dobavit' chitatelja");
                    Reader reader = new Reader();
                    break;
                case 3:
                    System.out.println("3. Vqdat' knigu");
                    History history = new History();
                    break;
                case 4:
                    System.out.println("4. Vernut' knigu");
                    break;
                case 5:
                    System.out.println("5. Spisok knig");
                    for (int i = 0; i < books.length; i++) {
                        Book book1 = books[i];
                        System.out.printf(i+1+". %s. ",book1.getTitle());
                        for (int j = 0; j < book1.getAuthors().length; j++) {
                            System.out.printf("%s %s.%n",
                                    book1.getAuthors()[j].getFirstname(),
                                    book1.getAuthors()[j].getLastname());
                            
                        }
                    }
                    break;
                case 6:
                    System.out.println("6. Spisok avtorov");
                    break;
                default:
                    System.out.println("Vqberite nomer funktsii iz spiska!");
            }
        }while(repeat);
        System.out.println("Poka!");
    }

    private Author createAuthor() {
        Author author = new Author();
        System.out.println("Vvedite imja: ");
        author.setFirstname(scanner.nextLine());
        System.out.println("Vvedite familiju: ");
        author.setLastname(scanner.nextLine());
        return author;
    }
}
