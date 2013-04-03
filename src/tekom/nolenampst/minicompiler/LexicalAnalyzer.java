/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tekom.nolenampst.minicompiler;

/**
 *
 * @author andik_000
 */
public class LexicalAnalyzer {
    
    private String analyzeText;
    
    public void doAnalyze(String text){
        analyzeText = text;
        handleDirective();
//        handlerWhiteSpace();
//        handlerNumber();
//        handleReservedWord();
    }
    
//    public String handlerWhiteSpace(){
//        
//    }
//    
//    public String handlerNumber(){
//        
//    }
//    
//    public String handleReservedWord(){
//        
//    }
    
    public String handleDirective(){
        for(int i = 0; i < analyzeText.length(); i++){
            if(i == '#'){
                
            }
        }
        
        return "";
    }
    
}
