package javaassignments.assignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaAssignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        Pattern pattern = Pattern.compile("[A-Z].*[.]");
        Matcher matcher = pattern.matcher(sentence);
        if(matcher.matches()){
            System.out.println("Sentences matches input pattern");
        }else{
            System.out.println("Sentence doesn't match with given pattern");
        }
    }
}
