/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Author;
import entity.Book;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class BookManager {
    private final Scanner scanner;

    public BookManager() {
        scanner = new Scanner(System.in);
    }
    
    
    public Book createBook(){
        Book book = new Book();
        System.out.print("Введите название книги: ");
        book.setTitle(scanner.nextLine());
        System.out.print("Укажите количество авторов: ");
        int countAuthorsInBook = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < countAuthorsInBook; i++) {
            book.addAuthor(createAuthor());
        }
        return book;           
    }
    
    private Author createAuthor() {
        Author author = new Author();
        System.out.println("Введите имя: ");
        author.setFirstname(scanner.nextLine());
        System.out.println("Введите фамилию: ");
        author.setLastname(scanner.nextLine());
        return author;
    }
    public void printListBooks(Book[] books){
        for (int i = 0; i < books.length; i++) {
            Book book1 = books[i];
            System.out.printf(i+1+". %s. ",book1.getTitle());
            for (int j = 0; j < book1.getAuthors().length; j++) {
                System.out.printf("%s %s.%n",
                        book1.getAuthors()[j].getFirstname(),
                        book1.getAuthors()[j].getLastname());

            }
        }
    }
}
