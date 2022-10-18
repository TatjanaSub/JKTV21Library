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
        System.out.print("Vvedite imja chitatelja: ");
        reader.setFirstname(scanner.nextLine());
        System.out.print("Vvedite familiju chitatelja: ");
        reader.setLastname(scanner.nextLine());
        System.out.print("Vvedite telefon chitatelja: ");
        reader.setPhone(scanner.nextLine());
        return reader;
    }
    public void printListReaders(Reader[] readers ){
        for (int i = 0; i < readers.length; i++) {
            System.out.printf("%d. %s %s. Telefon: %s%n",i+1,
                    readers[i].getFirstname(),
                    readers[i].getLastname(),
                    readers[i].getPhone());
        }
    }
    
}
