package org.example.exercice3;

public class Solution {

    public void IncTab(int[] tableau){
        for(int i=0;i<tableau.length;i++)
            tableau[i]+=1;
    }


    public int[] IncNewTab(int[] tableau){
        int taille=tableau.length;
        int[] nouveauTableau=new int[taille];
        for(int i=0;i<taille;i++){
            nouveauTableau[i]=tableau[i]+1;
        }
        return nouveauTableau;
    }

    public void incNewTabOut(int[] tableau1, int[] tableau2){
        if(tableau1.length!=tableau2.length){
            System.out.println("le tableau1 et le tableau2 doivent avoir la même taille");
            return;
        }
        int taille=tableau1.length;
        for(int i=0;i<taille;i++)
            tableau2[i]=tableau1[i]+1;
    }


}
