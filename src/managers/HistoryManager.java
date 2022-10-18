/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HistoryManager {
    private final Scanner scanner;
    private ReaderManager readerManager;
    private BookManager bookManager;
    
    public HistoryManager() {
        scanner = new Scanner(System.in);
        readerManager = new ReaderManager();
        bookManager = new BookManager();
    }
    
    public History takeOnBook(Reader[] readers, Book[] books){
        //из списка читателей выбрать номер читателя
        //из списка книг выбрать номер книги
        //инициировать поля History
        //добавить дату выдачи книги
        System.out.println("Список читателей:");
        readerManager.printListReaders(readers);
        System.out.print("Выберите номер читателя из списка:");
        int numberReader = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Список книг:");
        bookManager.printListBooks(books);
        System.out.println("Выберите номер книги из списка:");
        int numberBook = scanner.nextInt();
        scanner.nextLine();
        History history = new History();
        history.setBook(books[numberBook - 1]);
        history.setReader(readers[numberReader - 1]);
        history.setTakeOnBook(new GregorianCalendar().getTime());
        return history;
    }
}