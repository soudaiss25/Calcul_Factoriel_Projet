package com.groupeisi;

public class CalculFactoriel {
    /**
     * Calcule le factoriel d'un nombre entier positif
     *
     * @param n le nombre dont on veut calculer le factoriel
     * @return le factriel de n
     * @throws IllegalArgumentException si n < 0
     */
    public  int CalculFactorielMethod(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Le nombre doit être positif ou nul");
        }
        int f = 1;


        for(int i=n;i>=1;i--){
            f=f*i;

        }
        return f;
    }
}
