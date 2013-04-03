/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tekom.nolenampst.minicompiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import tekom.nolenampst.minicompiler.lexer.Lexer;

/**
 *
 * @author andik_000
 */
public class InputStream {
    
    
    
    public static boolean startScanning(String text){
        Scanner scanner = new Scanner(text);
        String bufferText = "";
        while(scanner.hasNext()){
            try {
                bufferText = scanner.nextLine();
                Lexer lexer = new Lexer();
                lexer.scan();
            } catch (IOException ex) {
                Logger.getLogger(InputStream.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return true;
    }
    
    public static String writeToEditor(File file){
        String editor = "";
        if(file.canRead()){
            try {
                Scanner scanner = new Scanner(file);
                while(scanner.hasNext()){
                    editor += scanner.nextLine() + "\n";
                }
                //System.out.println(editor);
                return editor;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(InputStream.class.getName()).log(Level.SEVERE, null, ex);
                return "File not found!";
            }
        } else {
            return "File cannot be read!";
        }
    }
}
