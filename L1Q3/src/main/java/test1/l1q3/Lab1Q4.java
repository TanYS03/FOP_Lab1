/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1.l1q3;

/**
 *
 * @author User
 */
public class Lab1Q4 {
    public static void main(String [] args){
        String[] month ={"January 2016","February 2016","March 2016","April 2016","May 2016","Jun 2016"};
        int[] Amount = {2500,1600,2000,2700,3200,800};
        int[] num = new int[6];
        for (int i=0; i<6; i++){
            num[i]=Amount[i]/200;
        }
        for (int i=0; i<6; i++ ){
            System.out.print(month[i]+"\t|");
          for(int j=0; j<num[i];j++) {
              System.out.print("*");
          }  
          System.out.print("\n");
        }
    }
}
