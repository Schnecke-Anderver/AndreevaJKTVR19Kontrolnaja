/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andreevajktvr19kontrolnaja;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author User
 */
public class Task2 {

    public void run() {
       System.out.println("------------ Задача №2 ------------"); 
       String sisseString;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int ranNum, sisseNum;

        System.out.println("Загадано число от 5 до 10");
        ranNum = rand.nextInt(10 - 5 + 1) + 5;
        System.out.print("Угадай это число: ");        
        sisseString = scanner.nextLine();
        sisseNum = Integer.parseInt(sisseString);
        
        if (sisseNum == ranNum) {
            System.out.println("Победа!");
        } else {
            System.out.println("Неверно! Было загадано "+ranNum+".");
        }              
        System.out.println("----- Задача решена! ------");
    }    
}
