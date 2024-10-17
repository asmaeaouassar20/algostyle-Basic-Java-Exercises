package org.example.exercice2;

import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean dateEstValide(String date){
        if(date.length()>8 || date.length()<5) return false;
        String[] splittedDate=date.split("[/:.-]");
                    // - La méthode String.split() en Java admet en paramètre
                    // une Expression Régulière (regex) pour définir les délimiteurs

                    // [/:.-]  :  -> Cette notation crée une classe de caractères
                    //            -> tout caractère à l'intérieur des [] sera considérér
                    //               comme délimiteur

        if(splittedDate.length<3) return false;
        for(String s:splittedDate){
            if(!isInteger(s)) return false;
            if(s.length()>2) return false;
        }
        return true;
    }

    public String convertDate(String date){
        if(dateEstValide(date)){
            String[] splittedDate=date.split("[/.:-]");

            Map<Integer,String> joursDeSemaine=new HashMap<>();
            joursDeSemaine.put(1,"lundi");
            joursDeSemaine.put(2,"mardi");
            joursDeSemaine.put(3,"mercredi");
            joursDeSemaine.put(4,"jeudi");
            joursDeSemaine.put(5,"vendredi");
            joursDeSemaine.put(6,"samedi");
            joursDeSemaine.put(7,"dimanche");


            String jourDeSemaine=joursDeSemaine.get(Integer.parseInt(splittedDate[0]));

            if(jourDeSemaine==null){
                return "le jour de la semaine doit etre compris entre 1 et 7";
            }
            if(Integer.parseInt(splittedDate[1])>31 || Integer.parseInt(splittedDate[1])<1){
                return "le jour du mois doit etre compris entre 1 et 31";
            }

            String jourDuMois=String.valueOf(Integer.parseInt(splittedDate[1]));

            int moisInt=Integer.parseInt(splittedDate[2]);
            if(moisInt>12 || moisInt<1) return "le mois doit etre compris entre 1 et 12";
            Map<Integer,String> moisAnnee=new HashMap<>();
            moisAnnee.put(1,"janvier");
            moisAnnee.put(2,"février");
            moisAnnee.put(3,"mars");
            moisAnnee.put(4,"avril");
            moisAnnee.put(5,"mai");
            moisAnnee.put(6,"juin");
            moisAnnee.put(7,"juillet");
            moisAnnee.put(8,"août");
            moisAnnee.put(9,"septembre");
            moisAnnee.put(10,"octobre");
            moisAnnee.put(11,"novembre");
            moisAnnee.put(12,"décembre");

            String mois=moisAnnee.get(moisInt);
            return jourDeSemaine+" "+jourDuMois+" "+mois;
        }else{
            return "le format de la date que saisie n'est pas valide";
        }
    }




    public static boolean isInteger(String str){

        // Essayez de convertir la chaîne en entier
        try {
            Integer.parseInt(str); // Convertir la chaîne en entier
            return true; // Si la conversion réussit, retourne true
        }

        // Si une exception NumberFormatException est lancée,
        // cela signifie que la chaîne n'est pas un entier valide
        catch (NumberFormatException e){
            return false; // Retourne false si la conversion échoue
        }
    }




}
