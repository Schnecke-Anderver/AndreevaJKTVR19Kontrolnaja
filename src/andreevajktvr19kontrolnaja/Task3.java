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
public class Task3 {

    public void run() {
        System.out.println("------------ Задача №3 ------------");        
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \n"
                + "заполняем его случайными числами и выводим \n"
                + "его значения в цикле");
        
        Random rando = new Random(); //создание рандомной переменной        
        int[] moiArray;//объявление массива
        moiArray = new int[10]; //  и создание
        // System.out.println(moiArray.length);
        int summa = 0;
        int min = 101;
        int max = 0;
        for (int i = 0; i < moiArray.length; i++) {
            moiArray[i] = rando.nextInt(min-1); 
            System.out.printf("%5d", moiArray[i]); // "%5d\n" - заявляем, что здесь будет число, 5 - это отступ от края документа при печати \n перенос на следующую страницу.
        }        
        System.out.print("\n Сумма всех чисел массива: ");        
        for (int i = 0; i<moiArray.length; i++) {
            summa = summa + moiArray[i]; // находим сумму всех чисел массива
            if (moiArray[i] < min) {// сравниваем каждое число с мин,если оно меньше, то мин принимает его значение и сравнение идет дальше по массиву
                min = moiArray[i];
            }
            if (moiArray[i] > max) {
                max = moiArray[i]; // аналогично мин, но наоборот.
            }            
        }
        System.out.println(summa);        
        
        System.out.println("min = " + min);
        System.out.println("max = " + max);        
        System.out.println("----- Задача решена! ------");
    }
    
}
