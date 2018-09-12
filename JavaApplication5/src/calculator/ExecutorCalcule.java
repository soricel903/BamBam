/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Syka
 */
public class ExecutorCalcule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculator unCalculator = new Calculator();
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        int i = sc1.nextInt();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        int j = sc2.nextInt();
        
        int iesireAdunare = unCalculator.aduna(i ,j);
        System.out.println("Rezultat adunare:" + iesireAdunare);
        
        int iesireScadere = unCalculator.scade(i ,j);
        System.out.println("Rezultat scadere:" + iesireScadere);
        
        int iesireInmulteste = unCalculator.inmulteste(i ,j);
        System.out.println("Rezultat inmulteste:" + iesireInmulteste);
        
        int iesireImparte = unCalculator.imparte(i ,j);
        System.out.println("Rezultat imparte:" + iesireImparte);
    }
    
}
