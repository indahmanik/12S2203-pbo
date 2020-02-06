/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *@author 28-12s18008 Indah Manik
 * @author 28-12s18021 Lastri Marbun
 */

import java.util.ArrayList;
import java.util.Scanner;
//kode 1 dan 2
public class Main {
    public static void main(String[] _args) {
        System.out.println("Hello, world!");

        //kode 3
        int gear = 1;
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        
        System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
        
        int hexVal = 0x1a;
        int binVal = 0b11010;
        
        System.out.println(hexVal + ", " + binVal);
        
        //kode 4
        String name = "Wiro Sableng";
        Short gearObject = 1;
        Boolean resultObj = true;
        
        System.out.println(name + ", " + gearObject + ", " + resultObj);
        
        name = name.toUpperCase();
        gearObject++;
        resultObj = (result == false) || !resultObj;
        
        System.out.println(name + ", " + gearObject + ", " + resultObj);
        
        //kode 5
        int[][] numbers = new int[10][10];
        
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 0; j < numbers[i].length; ++j) {
                numbers[i][j] = i + j;
            }
        }
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 0; j < numbers[i].length; ++j) {
                System.out.print(numbers[i][j] +" " );
            }
            System.out.println();
        }
        //Challenge
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
        System.out.print("Input Jumlah Data :");
        int jlh_data = new Scanner(System.in).nextInt();
        for (int i = 0; i < jlh_data; ++i) {
            numbers.add(new ArrayList<Integer>());
            for (int j = 0; j < jlh_data; ++j){
                numbers.get(i).add(i+j);
            }
        }
        for (int i = 0; i < jlh_data; ++i) {
            for (int j = 0; j < jlh_data; ++j) {
                System.out.print(numbers.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
