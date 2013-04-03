/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tekom.nolenampst.minicompiler.lexer;

import java.io.IOException;
import java.util.Hashtable;

/**
 * Bagian Lexical Analyzer
 * @author andik_000
 */
public class Lexer {
    public int line = 1; //posisi barisnya
    private char peek = ' '; //buat liat satu karakter berikutnya
    private Hashtable words = new Hashtable(); //nyimpen kumpulan reserved word
    
    /**
     * ini buat nyimpen reserved word
     * @param t 
     */
    void reserve(Word t) {
        words.put(t.lexeme, t);
    }

    public Lexer() {
        reserve( new Word(Tag.TRUE, "true") );
        reserve( new Word(Tag.FALSE, "false") );
    }
    
    /**
     * ini buat ngescan karakter per karakter
     * dicocokin apakah ini huruf atau angka dsb...
     * @return
     * @throws IOException 
     */
    public Token scan() throws IOException {
        //ini untuk ngelewatin spasi & tab & baris baru
        for(;; peek = (char) System.in.read() ){
            if( peek == ' ' || peek == '\t') continue;
            else if( peek == '\n' ) line = line + 1;
            else break;
        }
        
        //cek angka bukan
        if( Character.isDigit(peek)){
            int v = 0;
            do {
                v = 10 * v + Character.digit(peek, 10);
                peek = (char) System.in.read();
            } while(Character.isDigit(peek));
        }
        
        //ini untuk analisa reserved words & identifiers
        if( Character.isLetter(peek)) {
            StringBuffer b = new StringBuffer();
            do {
                b.append(peek);
                peek = (char) System.in.read();
            } while(Character.isLetterOrDigit(peek));
            String s = b.toString();
            Word w = (Word) words.get(s);
            if( w != null ) return w;
            w = new Word(Tag.ID, s);
            words.put(s, w);
            return w;
        }
        
        //buat ngelewatin comment // atau /**/
        if( peek == '/' ){
            StringBuffer b = new StringBuffer();
            b.append(peek);
            peek = (char) System.in.read();
            if( peek == '/' ){
                for(;; peek = (char) System.in.read() ){
                    if( peek != '\n' ) continue;
                    else {
                        line = line + 1;
                        break;
                    } 
                }
            } else if( peek == '*'){
                for(;; peek = (char) System.in.read() ){
                    b.append(peek);
                    if(b.toString().matches("\\/\\*.\\*\\/")){
                        break;
                    }
                }
            }
        }
        
        Token t = new Token(peek);
        peek = ' ';
        return t;
    }
    
    
}
