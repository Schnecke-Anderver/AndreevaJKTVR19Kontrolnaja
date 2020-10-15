/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andreevajktvr19kontrolnaja;

import java.util.Scanner;
/**
 *
 * @author User
 */
 public class Task1 {

   public void run() {
        System.out.println("------------ Задача №1 ------------");            
        String enteredString;
        double celsyT, fariT;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");        
        enteredString = scanner.nextLine();
        celsyT = Integer.parseInt(enteredString);
        
        fariT = celsyT * 1.8 + 32;
        System.out.println("Это "+fariT+" градусов по Фаренгейту");        
        System.out.println("----- Задача решена! ------");
    }
    
}
