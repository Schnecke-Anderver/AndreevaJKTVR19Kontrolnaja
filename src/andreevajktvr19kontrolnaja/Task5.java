/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andreevajktvr19kontrolnaja;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author User
 */
public class Task5 {

   public void run() {
        System.out.println("------------ Задача №5 ------------");          
        
        Random rand = new Random();
        
        System.out.println("Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \n"
                + "заполняем его случайными числами и выводим \n"
                + "его значения в цикле");
        int moiArray[][] = new int[10][5];//создаем массив из 10 строк и 5 столбцов
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                moiArray[i][j] = rand.nextInt(100); //заполняем его случайными числами от 0 до 100
                       
                System.out.printf("%5d", moiArray[i][j]); 
                
            }                                   //выводим на экран с аккуратным отступом
            System.out.println("\n");
        }
        System.out.println("----- Задача решена! ------");
    }
    
}
