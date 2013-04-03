/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tekom.nolenampst.minicompiler;

import java.util.Hashtable;

/**
 *
 * @author andik_000
 */
public class ConstantVariable {
    
    /**
     * C++ reserved word
     */
    final static public String[] RESERVED_WORD = {
        "auto",         "const",        "double",   "float",  "int",       "short",   "struct",   "unsigned",
        "break",        "continue",     "else",     "for",    "long",      "signed",  "switch",   "void",
        "case",         "default",      "enum",     "goto",   "register",  "sizeof",  "typedef",  "volatile",
        "char",         "do",           "extern",   "if",     "return",    "static",  "union",    "while",
        "asm",          "dynamic_cast", "namespace",  "reinterpret_cast",  "try",
        "bool",         "explicit",     "new",        "static_cast",       "typeid",
        "catch",        "false",        "operator",   "template",          "typename",
        "const_cast",   "inline",       "public",     "throw",             "virtual",
        "delete",       "mutable",      "protected",  "true",              "wchar_t",
    };
    
    static public Hashtable<String, String> RESERVED = new Hashtable<>();
}
