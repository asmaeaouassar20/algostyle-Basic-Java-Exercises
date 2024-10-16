package org.example.exercise1;

public class Solution {

    /**
     * Comprsse une chaîne en supprimant les espaces
     * superflus et en convertissant tous les caractères en miniscules
     *
     * @param str
     * @return nouvelle string
     */
    public String compresser(String str){
        String[] splittedString=str.trim().split("\\s+");
                        // Le "\\" est nécessaire en Java pour échaper le caractère "\"
                        // "\" est un caractère d'échappement
                        // "\s" représente un caractère d'espace blanc (espace, tabulation saut de ligne)
                        // le symbole "+" indique "un ou plusieur" de l'élément qui le précède
                        // "\\s+" signifie "un ou plusieurs espaces blancs"
        str="";
        for(String s:splittedString)
            str+=s;
        return str.toLowerCase();
    }

    public String inversion1(String str){
        String result= "";
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
