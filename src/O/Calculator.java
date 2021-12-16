/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package O;

import java.security.InvalidParameterException;

/**
 *
 * @author Mahmoud
 */
public class Calculator {
    
    public static void Calculate(CalculatorOperation operation){
        if (operation == null) {
             throw new InvalidParameterException("Cannot perform operation"); 
        }
        operation.perform();
        operation.print();
    }
    
}
