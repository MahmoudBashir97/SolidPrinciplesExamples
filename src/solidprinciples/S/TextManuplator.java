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
public class TextManuplator {
    public String text;
    
    public TextManuplator(String text){
    this.text = text;
    }
    
    public String getText(){
   
       return text;
    }
    
    public void appendText(String newText){
      text = text.concat(newText);
    }
    
    
    public String findWordAndReplace(String word,String replacementWord){
     
        if(text.contains(word)){
        text = text.replace(word, replacementWord);
        }else{
        text = "doesn't match";}
        return text;
    }
    
    public String findWordAndDelete(String word){
        
        if(text.contains(word)){
        text = text.replace(word,"");
        }else{
        text = "doesn't match";
        }
        
        return text;
    }
    
     /*
  * Bad practice when implementing SRP principle, not in the scope of this class
    public void printText() {
        System.out.println(textManipulator.getText());
    }*/
    
}
