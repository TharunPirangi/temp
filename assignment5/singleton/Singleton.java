package javaassignments.assignment5.singleton;

public class Singleton {
    String name;
    public static Singleton getInstance(String name){
        // non-static variables cannot be accessed from static context
        // this.name = name;
        Singleton singleton = new Singleton();
        return singleton;
    }
    public void printName(){
        System.out.println("Name :"+name);
    }
}
