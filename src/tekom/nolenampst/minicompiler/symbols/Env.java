/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tekom.nolenampst.minicompiler.symbols;

import java.util.Hashtable;

/**
 *
 * @author andik_000
 */
public class Env {
    private Hashtable table;
    protected Env prev;

    public Env(Env p) {
        this.table = new Hashtable();
        this.prev = p;
    }
    
    public void put(String s, Symbol sym) {
        table.put(s, sym);
    }
    
    public Symbol get(String s) {
        for(Env e = this; e != null; e = e.prev) {
            Symbol found = (Symbol)(e.table.get(s));
            if(found != null) return found;
        }
        return null;
    }
    
}
