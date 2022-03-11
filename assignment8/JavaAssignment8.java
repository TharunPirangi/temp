package javaassignments.assignment8;

import java.util.Scanner;

public class JavaAssignment8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=2/0;
            int arr[]= new int[3];
            arr[4]=20;
            int res= sc.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("always executed");
        }
    }
}
