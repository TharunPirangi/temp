package javaassignments.assignment2;

import java.util.*;

/**
 * Time complexity: O(n)
 * Space Complexity: O(1)
 * n -> length of string
 */

public class JavaAssignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        boolean[] characters = new boolean[26];
        for(char c: s.toCharArray()){
            if(c>='a' && c<='z' || c>='A' && c<='Z'){
                int ind = Character.toLowerCase(c)-'a';
                characters[ind] = true;
            }
        }
        for(int i=0;i<26;i++){
            if(characters[i] == false){
                System.out.println("String doesn't contain all alphabets");
                return;
            }
        }
        System.out.println("String contains all alphabets");
    }
}
