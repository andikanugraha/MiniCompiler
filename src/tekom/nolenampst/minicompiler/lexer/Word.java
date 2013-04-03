/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tekom.nolenampst.minicompiler.lexer;

/**
 *
 * @author andik_000
 */
public class Word extends Token {
    public final String lexeme;
    public Word(int t, String s) {
        super(t);
        lexeme = new String(s);
    }
}
