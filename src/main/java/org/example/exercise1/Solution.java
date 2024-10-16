package org.example.exercise1;

public class Solution {

    public String compresser(String str){
        String[] splittedString=str.trim().split("\\s+");
        str="";
        for(String s:splittedString)
            str+=s;
        return str.toLowerCase();
    }

    public String inversion1(String str){
        String result=new String();
        for(int i=str.length()-1;i>+0;i--){
            result+=str.charAt(i);
        }
        return result;
    }

    public String inversion2(String str){
        int lengthOfString=str.length();
        if(lengthOfString==1) return str;
        char[] chars=str.toCharArray();
        for(int i=0,j=lengthOfString-1;i<j;i++,j--){
            char character=chars[j];
            chars[j]=chars[i];
            chars[i]=character;
        }

        return new String(chars);
    }
}
