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
import java.util.List;
import java.util.Scanner;
import managers.BaseManager;
import managers.BookManager;
import managers.DataManager;
import managers.HistoryManager;
import managers.ReaderManager;
import managers.interfaces.SaveManagerInterface;

/**
 *
 * @author pupil
 */
public class App {
    public static boolean saveToBase;
    private final Scanner scanner;
    private final BookManager bookManager;
    private final ReaderManager readerManager;
    private final HistoryManager historyManager;
    private final SaveManagerInterface saveManager;
    private List<Book> books;
//    private Book[] books;
    private List<Reader> readers;
    //private Reader[] readers;
    private List<History> histories;
//    private History[] histories;

    public App() {
        scanner = new Scanner(System.in);
        bookManager = new BookManager();
        readerManager = new ReaderManager();
        historyManager = new HistoryManager();
        if(App.saveToBase){
            saveManager = new BaseManager();
        }else{
            saveManager = new DataManager();
        }
        books = saveManager.loadBooks();
        readers = saveManager.loadReaders();
        histories = saveManager.loadHistories();
    }
    
    public void run(){
        boolean repeat = true;
        do{
            System.out.println("Функции приложения:");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Добавить читателя");
            System.out.println("3. Выдать книгу");
            System.out.println("4. Вернуть книгу");
            System.out.println("5. Список книг");
            System.out.println("6. Список читателей");
            System.out.println("7. Список выданных книг");
            System.out.println("8. Изменить данные читателя");
            System.out.println("9. Редактирование книги");
            System.out.print("Выберите номер функции: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("0. Закрыть приложение");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Выбрана задача: 1. Добавить книгу");
                    books.add(bookManager.createBook());
                    saveManager.saveBooks(books);
                    break;
                case 2:
                    System.out.println("2. Добавить читателя");
                    readers.add(readerManager.createReader());
                    saveManager.saveReaders(readers);
                    break;
                case 3:
                    System.out.println("3. Выдать книгу");
                    histories.add(historyManager.takeOnBook(readers, books));
                    saveManager.saveHistories(histories);
                    break;
                case 4:
                    System.out.println("4. Вернуть книгу");
                    histories = historyManager.returnBook(histories);
                    saveManager.saveHistories(histories);
                    break;
                case 5:
                    System.out.println("5. Список книг");
                    bookManager.printListBooks(books);
                    break;
                case 6:
                    System.out.println("6. Список читателей");
                    readerManager.printListReaders(readers);
                    break;
                case 7:
                    System.out.println("7. Список выданных книг");
                    historyManager.printListReadingBooks(histories);
                    break;
                case 8:
                    System.out.println("8. Изменить данные читателя");
                    readers = readerManager.changeReader(readers);
                    saveManager.saveReaders(readers);
                    break;
                case 9:
                    System.out.println("9. Редактирование книги");
                    books = bookManager.changeBook(books);
                    saveManager.saveBooks(books);
                    break;
                default:
                    System.out.println("Выберите номер функции из списка!");
            }
        }while(repeat);
        System.out.println("Пока!");
    }

//    private void addBook(Book book){
//        books = Arrays.copyOf(books, books.length + 1);
//        books[books.length - 1] = book;
//    }
    
//    private void addReader(Reader reader){
//        readers = Arrays.copyOf(readers, readers.length + 1);
//        readers[readers.length - 1] = reader;
//    }
//    private void addHistory(History history){
//        histories = Arrays.copyOf(histories, histories.length + 1);
//        histories[histories.length - 1] = history;
//    }
    
//    private void testAddBook(){
//        Book book = new Book();
//        book .setTitle("Voina i mir");
//        Author author = new Author("Lev", "Tolstoi");
//        book.addAuthor(author);
//        this.books = Arrays.copyOf(this.books, this.books.length + 1);
//        this.books[this.books.length - 1] = book;
//    }
//    private void testAddReader(){
//        Reader reader = new Reader("Ivan", "Ivanov", "53912933");
//        readers = Arrays.copyOf(readers, readers.length + 1);
//        readers[readers.length - 1] = reader;
//    }

    
}