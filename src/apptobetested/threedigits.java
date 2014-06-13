/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apptobetested;

import java.io.IOException;
import  java.util.Arrays;

/**
 *
 * @author dev
 */
public class threedigits {

    
    public static boolean checkdigs(int a, int b ,int c) {
    
        if (a == b && b == c){
        return true;}
        else return false;
    }
    
    
    public static void sorting(int[]  ishod ){
       long timer = -System.currentTimeMillis(); 
        
                   // 0  1 2  3 4   5 6   7
   // int[]  ishod =  {3,2,-91,-77725,5,777,35032,200,0,0}; //=7
    int[]  kon = new int [ishod.length];
    int[]  buff = new int [ishod.length];
    int min =0;
    int max =0;
    int next =0;// почему джаве пофиг на инициализацию этой переменной.
      
      //    for (int i3=0; i3<kon.length;i3++)
      //   System.out.print(" "+ishod[i3]+" ");   
    //System.out.println();
    
    //Get Min and Max
    
    for (int i=0; i<ishod.length;i++){
      min =ishod[i]; max =ishod[i];
        for (int i2=0; i2<ishod.length;i2++){
                if (ishod[i2]<min) min = ishod[i2];
                if (ishod[i2]>max) max = ishod[i2];
        }
    }
      //   System.out.println("Min="+ min +" Max="+ max);
      
     // write a sequince into a massive;
         
        int m=0; 
         
     
          for (int i2=min; i2<=max;i2++){
            next =i2; 
                 for (int i=0; i<ishod.length;i++)
                        if (ishod[i]==next) {
                               buff[m]=i;
                               m++;
                               // System.out.print(" "+i+" ");
                               
                        }
                }
      
       //  for (int i3=0; i3<buff.length;i3++)
       //  System.out.print(" "+buff[i3]+" ");
       //  System.out.println();
         
        //  for(int mn: buff) 
        // System.out.print(" "+buff[mn]+" ");
         
         // sopostavit' massive
            for (int i=0; i<kon.length;i++)
                                  
                   kon[i]=ishod[buff[i]];
                   
          
             
       //   for (int i3=0; i3<kon.length;i3++)
       //  System.out.print(" "+kon[i3]+" ");   
          
          
      //    System.out.println("ishod2");
          
       //   int[]  ishod2 =  {3,2,-91,-77725,5,777,35032,200,0,0};
         // Arrays.sort(ishod2,0,0);
          
        //  for (int i3=0; i3<ishod2.length;i3++)
        // System.out.print(" "+ishod2[i3]+" ");
          
          timer += System.currentTimeMillis();
          System.out.println("моя сортировка " + timer);
          
          
         }
    
    public static void bubbleSort(int[] arr){
        
        long timer = -System.currentTimeMillis();
        
    /*Внешний цикл каждый раз сокращает фрагмент массива, 
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/   
    for(int i = arr.length-1 ; i > 0 ; i--){
        for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно, 
              если они имеют неправильный порядок, 
              то меняем местами */
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
    
    timer += System.currentTimeMillis();
          System.out.println("пузырьком " + timer);
    
}
    
    
    public static void selectionSort(int[] arr){
        
        long timer = -System.currentTimeMillis();
        
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний, 
      2-последний,...)*/
    for (int i = 0; i < arr.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
        int min = arr[i];
        int min_i = i; 
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
        for (int j = i+1; j < arr.length; j++) {
            //Если находим, запоминаем его индекс
            if (arr[j] < min) {
                min = arr[j];
                min_i = j;
            }
        }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
        if (i != min_i) {
            int tmp = arr[i];
            arr[i] = arr[min_i];
            arr[min_i] = tmp;
        }
     }

    timer += System.currentTimeMillis();
System.out.println("сортировка выборкой " + timer);
    
    }
    
    
    public static int getmin(int[] m, int ind ){
        int min =-1;
        int[] values = new int [m.length];
        
        for (int f=0; f < m.length; f++ ) {
             if (m[f]>-1) min = m[f];
            for (int f2=0; f2 < m.length; f2++){
                    if ((m[f2]<=min)&&(m[f2]>ind) ){ 
                        min = m[f2];
                        values[f] = m[f2];
                        break;
                        //System.out.println(m[f2]);
                        
                     }
            }
        
        }
        
       
        return min;
 
    }
    
    public static void main(String[] args) throws IOException {
        
        int ishod[] = new int[10000];
        int ishod2[] = new int[10000];
        int ishod3[] = new int[10000];
        
        
        for(int i = 0; i <  ishod.length; i++) {
	ishod[i] =  (int)(Math.random() * 1000);
        ishod2[i] =  (int)(Math.random() * 1000);
        ishod3[i] =  (int)(Math.random() * 1000);
	//System.out.print(ishod[i] + "  ");
        }
      
        
        sorting (ishod);
        selectionSort(ishod2);
        bubbleSort(ishod3);
         
        
        
        /*
        for (int f : m) {
         System.out.print(" "+ f);    }
         System.out.println(" vivod= " );
        for (int f : vivod) {
         System.out.print(" "+ f);   }
        */
        
        //System.out.println((int) 15 / 2);
        //checkdigs(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
         
       // one = (char) System.in.read();
        //two = (char) System.in.read();
       // three = (char) System.in.read();
     //   System.out.println();
       // System.out.println("Вы ввели 1="+one+"  2="+two+"  3="+three);
        //System.out.println(" Они ранвы? ="+ checkdigs(one,two,three));
    }
    
}
