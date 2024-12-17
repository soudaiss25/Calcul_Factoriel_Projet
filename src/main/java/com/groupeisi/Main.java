package com.groupeisi;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("calcul factoriel");
        System.out.println("Saisissez un nombre");
        int nombre  = scanner.nextInt();

    CalculFactoriel calcul = new CalculFactoriel();

       int result = calcul.CalculFactorielMethod(nombre);

        System.out.println(result);



    }



}