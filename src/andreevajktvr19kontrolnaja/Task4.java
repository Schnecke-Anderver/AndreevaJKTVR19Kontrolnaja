/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andreevajktvr19kontrolnaja;


import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class Task4 {

   public void run() {
        System.out.println("------------ Задача №4 ------------");
         
        Random rand = new Random();
        int randNumber;
        
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \n"
                + "заполняем его случайными ЧЕТНЫМИ числами и выводим \n"
                + "его значения в цикле");
        int moiArray[] = new int[10];
        for (int i = 0; i < moiArray.length; i++) { 
            do {
                randNumber = rand.nextInt(100 - 1) + 1; // задаем диапазон случайных чисел (макс-мин)+1, исключая появление ноля в массиве.
            } while (randNumber % 2 == 1);
            moiArray[i] = randNumber;            
        }
        
        for (int i = 0; i < moiArray.length; i++) {
            System.out.println(i + ". " + moiArray[i]);}
            System.out.println("----- Задача решена! ------");
    }
    
}
