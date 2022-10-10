/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21library;

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
            System.out.println("0. Zakrqt' prilizenie");
            System.out.print("Vqberite nomer funktsii:");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task){
                case 0:
                    repeat = false;
                    break;
                default:
                    System.out.println("Vqberite nomer funktsii iz spiska!");
            }
        }while(repeat);
        System.out.println("Poka!");
    }
}
