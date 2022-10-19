/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ReaderManager {
    private final Scanner scanner;
    
    public ReaderManager() {
        scanner = new Scanner(System.in);
    }
    
    public Reader createReader(){
        Reader reader = new Reader();
        System.out.print("Имя читателя: ");
        reader.setFirstname(scanner.nextLine());
        System.out.print("Фамилия читателя: ");
        reader.setLastname(scanner.nextLine());
        System.out.print("Телефон читателя: ");
        reader.setPhone(scanner.nextLine());
        return reader;
    }
    public void printListReaders(Reader[] readers ){
        for (int i = 0; i < readers.length; i++) {
            System.out.printf("%d. %s %s. Телефон: %s%n",i+1,
                    readers[i].getFirstname(),
                    readers[i].getLastname(),
                    readers[i].getPhone());
        }
    }

    public Reader[] changeReader(Reader[] readers) {
        System.out.println("Spisok chitatelei: ");
        this.printListReaders(readers);
        System.out.println("Vyberite nomer chitatelja iz spiska: ");
        int numberReader = scanner.nextInt(); scanner.nextLine();
        System.out.println("Imja: " + readers[numberReader - 1].getFirstname());
        System.out.println("Zamenit? (y/n): ");
        String task = scanner.nextLine();
        if("y".equals(task)){
            System.out.println("Vvedite novoe imja: ");
            readers[numberReader - 1].setFirstname(scanner.nextLine());
        }
        System.out.println("Familija: " + readers[numberReader - 1].getLastname());
        System.out.println("Zamenit? (y/n): ");
        task = scanner.nextLine();
        if("y".equals(task)){
            System.out.println("Vvedite novuju familiju: ");
            readers[numberReader - 1].setLastname(scanner.nextLine());
        }
        System.out.println("Telefon: " + readers[numberReader - 1].getPhone());
        System.out.println("Zamenit? (y/n): ");
        task = scanner.nextLine();
        if("y".equals(task)){
            System.out.println("Vvedite novui telefon: ");
            readers[numberReader - 1].setPhone(scanner.nextLine());
        }
        System.out.println("Izmenennyi chitatel: "+readers[numberReader - 1].toString());
        return readers;
    }
    
}
