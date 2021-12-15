/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidprinciples.S;

/**
 *
 * @author Mahmoud
 */
public class TextPrintable {
    
    public TextManuplator textManuplator;

    public TextPrintable(TextManuplator textManuplator) {
        this.textManuplator = textManuplator;
    }

    
    public void printingText(){
        System.out.println("text : "+textManuplator.getText());
    }
    
    public void printReplacedWord(String word,String replacementWord){
        System.out.println("replaced Text : "+textManuplator.findWordAndReplace(word, replacementWord));
    }
    
    public void printDeletedWord(String word){
        System.out.println("replaced Text : "+textManuplator.findWordAndDelete(word));
    }
    
    
}
