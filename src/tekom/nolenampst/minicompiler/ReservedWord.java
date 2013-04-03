/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tekom.nolenampst.minicompiler;

/**
 * C++ reserved word
 * @author andik_000
 */
public enum ReservedWord {
    AUTO("auto"),
    CONST("const"),
    DOUBLE("double"),
    FLOAT("float"),
    INT("int"),
    SHORT("short"),
    STRUCT("struct"),
    UNSIGNED("unsigned"),
    BREAK("break"),
    CONTINUE("continue"),
    ELSE("else"),
    FOR("for"),    
    LONG("long"),      
    SIGNED("signed"),
    SWITCH("switch"),   
    VOID("void"),
    CASE("case"),
    DEFAULT("default"),
    ENUM("enum"),    
    GOTO("goto"),
    REGISTER("register"),  
    SIZEOF("sizeof"),  
    TYPEDEF("typedef"),  
    VOLATILE("volatile"),
    CHAR("char"),
    DO("do"),
    EXTERN("extern"),  
    IF("if"),     
    RETURN("return"),
    STATIC("static"),
    UNION("union"),
    WHILE("while"),
    ASM("asm"),         
    DYNAMIC_CAST("dynamic_cast"),
    NAMESPACE("namespace"),
    REINTERPRET_CAST("reinterpret_cast"),
    TRY("try"),
    BOOL("bool"),
    EXPLICIT("explicit"),
    NEW("new"),
    STATIC_CAST("static_cast"),
    TYPEID("typeid"),
    CATCH("catch"),       
    FALSE("false"),         
    OPERATOR("operator"),
    TEMPLATE("template"),
    TYPENAME("typename"),
    CLASS("class"),
    FRIEND("friend"),
    PRIVATE("private"),
    THIS("this"),
    USING("using"),
    CONST_CAST("const_cast"),
    INLINE("inline"),        
    PUBLIC("public"),
    THROW("throw"),             
    VIRTUAL("virtual"),
    DELETE("delete"),      
    MUTABLE("mutable"),
    PROTECTED("protected"),
    TRUE("true"),              
    WCHAR_T("wchar_t"),
    ;
     
    private String value;
    
    ReservedWord(String value){
        this.value = value;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }
    
}
