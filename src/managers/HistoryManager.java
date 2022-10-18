/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.History;
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
        //iz spiska chitatelei vybrat nomer chitatelja
        // iz spiska knig vybrat nomer knigi
        // initsiirovat polja History
        // dobavit daty vydachi knigi
        System.out.println("Spisok chitatelei:");
        readerManager.printListReaders(readers);
        System.out.println("Vyberite nomer chitatelja iz spiska:");
        int numberReader = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Spisok knig:");
        bookManager.printListReaders(readers);
        System.out.println("Vyberite nomer knigi iz spiska:");
        int numberBook = scanner.nextInt();
        scanner.nextLine();
        History history = new History();
        history.setBook(books[numberBook - 1]);
        history.setReader(readers[numberReader - 1]);
    }
    
    public History createHistory(){
        History history = new History();
        return history;
    }
    
}
