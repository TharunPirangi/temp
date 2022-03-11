package javaassignments.assignment5.main;

import javaassignments.assignment5.data.Data;
import javaassignments.assignment5.singleton.Singleton;

public class Main {
    public static void main(String args[]){
        Data data = new Data();
        data.printInstanceVariables();
        data.printLocalVariables();


        Singleton singleton = Singleton.getInstance("tharun");
        singleton.printName();
    }
}
