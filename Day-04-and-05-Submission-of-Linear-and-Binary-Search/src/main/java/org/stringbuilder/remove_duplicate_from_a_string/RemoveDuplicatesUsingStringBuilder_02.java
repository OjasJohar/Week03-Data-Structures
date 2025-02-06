package org.stringbuilder.remove_duplicate_from_a_string;

import java.util.HashSet;

public class RemoveDuplicatesUsingStringBuilder_02 {

    public static String removeDuplicates(String str){
        StringBuilder rev = new StringBuilder();
        HashSet<Character> hashSet=new HashSet<>();

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!hashSet.contains(c)){
                hashSet.add(c);
                rev.append(c);
            }
        }

        return rev.toString();
    }

    public static void main(String[] args) {
        String str="Hello, My name is OjasJohar";
        String rev=removeDuplicates(str);
        System.out.println("String with duplicates  : " + str);
        System.out.println("String without duplicate: " + rev);
    }
}


