/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21library;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        Scanner scanner =new Scanner(System.in);
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
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Dobavit' knigu");
                    Book book = new Book();
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
}
