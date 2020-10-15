/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andreevajktvr19kontrolnaja;

import java.util.Random;
/**
 *
 * @author User
 */
public class Task6 {

    public void run() {
        System.out.println("------------ Задача №6 ------------");         
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9...14) ячеек типа int, \n заполняем его случайными числами и выводим \n его значения в цикле");
        
        Random rand = new Random();        
        int moiArray[][] = new int[10][]; // не указываем второе измерение, т.к. оно будет меняться
        int k = 5;                     // количество столбцов в 1 массиве
        for (int i=0; i < moiArray.length; i++){
            moiArray[i] = new int[k];
            if (k > 14){ //чтобы не прописывать количество столбцов в каждом следующем массиве, сделаем это через иф
                break;
            }
            k++;
        }        
        for (int[] moiArray1 : moiArray) { // = foreach 
            for (int j = 0; j < moiArray1.length; j++) {
                moiArray1[j] = rand.nextInt(10)+1; // и заполняем случайными числами
                System.out.print("  " + moiArray1[j]);
            }
            System.out.println();
        }       
        System.out.println("----- Задача решена! ------");
    }
    
}
