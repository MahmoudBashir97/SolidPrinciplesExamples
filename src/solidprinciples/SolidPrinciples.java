/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidprinciples;

import O.Addition;
import O.Calculator;
import O.CalculatorOperation;
import O.Subtraction;
import java.util.Scanner;
import solidprinciples.S.TextManuplator;
import solidprinciples.S.TextPrintable;

/**
 *
 * @author Mahmoud
 */
public class SolidPrinciples {
    
    
    public static void main(String[] args) {
        
        /*
        ///// this is Single Responsibility Principle /////
        
        Scanner sc = new Scanner(System.in);
        
        TextManuplator texm = new TextManuplator(sc.next());
        
        TextPrintable print_it = new TextPrintable(texm);
        
        print_it.printingText();
        
       // print_it.printDeletedWord("Mahmoud");
       print_it.printReplacedWord("Bashir", "B4eer");*/
        
        /*
        ///// this is Open-Closed Principle /////
        
        
        CalculatorOperation operation = new Addition(50,70);
        operation = new Subtraction(70,50);
        Calculator.Calculate(operation);*/
        
    }
    
   
    
}