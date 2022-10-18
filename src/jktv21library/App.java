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
import managers.BookManager;
import managers.HistoryManager;
import managers.ReaderManager;

/**
 *
 * @author pupil
 */
public class App {
    private final Scanner scanner;
    private final BookManager bookManager;
    private final ReaderManager readerManager;
    private final HistoryManager historyManager;
    private Book[] books;
    private Reader[] readers;
    private History[] histories;

    public App() {
        scanner = new Scanner(System.in);
        bookManager = new BookManager();
        readerManager = new ReaderManager();
        historyManager = new HistoryManager();
        books = new Book[0];
        readers = new Reader[0];
        histories = new History[0];
        testAddBook();
        testAddReader();
    }
    
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
            System.out.println("6. Spisok chitateley");
            System.out.print("Vqberite nomer funktsii:");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task){
                case 0:
                    System.out.println("0. Zakrqt' prilozenie");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Vybrana zadacha: 1. Dobavit' knigu");
                    addBook(bookManager.createBook());
                    break;
                case 2:
                    System.out.println("2. Dobavit' chitatelja");
                    addReader(readerManager.createReader());
                    break;
                case 3:
                    System.out.println("3. Vqdat' knigu");
                    //addHistory(historyManager.createHistory());
                    break;
                case 4:
                    System.out.println("4. Vernut' knigu");
                    break;
                case 5:
                    System.out.println("5. Spisok knig");
                    bookManager.printListBooks(books);
                    break;
                case 6:
                    System.out.println("6. Spisok chitateley");
                    readerManager.printListReaders(readers);
                    break;
                default:
                    System.out.println("Vqberite nomer funktsii iz spiska!");
            }
        }while(repeat);
        System.out.println("Poka!");
    }

    private void addBook(Book book){
        books = Arrays.copyOf(books, books.length+1);
        books[books.length-1] = book;
    }
    
    private void addReader(Reader reader){
        readers = Arrays.copyOf(readers, readers.length+1);
        readers[readers.length-1] = reader;
    }
    
    private void addHistory(History history){
        histories = Arrays.copyOf(histories, histories.length+1);
        histories[histories.length-1] = history;
    }
    
    private void testAddBook(){
        Book book = new Book();
        book .setTitle("Voina i mir");
        Author author = new Author("Lev", "Tolstoi");
        book.addAuthor(author);
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        this.books[this.books.length - 1] = book;
    }
    private void testAddReader(){
        Reader reader = new Reader("Ivan", "Ivanov", "53912933");
        readers = Arrays.copyOf(readers, readers.length + 1);
        readers[readers.length - 1] = reader;
    }
}
