
package andreevajktvr19kontrolnaja;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Task7 {

    public void run() {
        System.out.println("------------ Задача №7 ------------");
        System.out.println("Посчитайте сколько раз в строке встречается введенная вами буква.");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);             
        System.out.print("Введите строку: ");        
        String stroka = scanner.nextLine(); //считывает введенyю строку
        System.out.println("Введите букву: ");
        String bukva = scanner.nextLine();    //считывает введенную букву        
        int n = stroka.length()-stroka.replaceAll(bukva, "").length();    //replaceAll() находит и перезаписывает 
        
        System.out.println("Буква \""+ bukva + " встречается в тексте "+ n + " раз"); 
        
        System.out.println("----- Задача решена! ------");
       
    }
    
}