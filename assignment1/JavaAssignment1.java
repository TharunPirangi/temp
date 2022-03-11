package javaassignments.assignment1;
import java.io.File;
import java.util.*;
import java.util.regex.Pattern;

public class JavaAssignment1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter exit to terminate the program");
        while(true){
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();
            if(fileName.equalsIgnoreCase("exit")){
                break;
            }
            File CurrentDirectory = new File(".");
            File files[] = CurrentDirectory.listFiles();
            String pattern = fileName;
            String result = findFileLocation(files,pattern);
            System.out.println("File location: "+result);
        }
    }
    public static String findFileLocation(File files[],String pattern){
        for(File file: files){
            if(Pattern.matches(pattern,file.getName())){
                return file.getAbsolutePath();
            }
        }
        return "File Not found!!";
    }
}
