/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tekom.nolenampst.minicompiler;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author andik_000
 */
public class OutputStream {
    
    private List<String> listCodes;
    private String javaText;
    private File javaFile;
    private String fileName;
    
    public OutputStream() {
        this.listCodes = new ArrayList<String>();
        this.javaText = "";
        this.javaFile = new File("");
        this.fileName = "";
    }

    public OutputStream(List<String> listCodes, String javaText, File javaFile, String fileName) {
        this.listCodes = listCodes;
        this.javaText = javaText;
        this.javaFile = javaFile;
        this.fileName = fileName;
    }
    
    public String getJavaClass(String fileName){
        if(fileName.contains(".java")){
            fileName.substring(0, fileName.indexOf(".java"));
        }
        return fileName;
    }
    
    
    public String writeToJava(){
        //for(int i = 0; i < listCodes.size(); i++){
            
//            if(listCodes.get(0).contains("#include")){
//                javaText += "import  \n\n";
//            }
            javaText += "import java.io.*;" + "\n\n";
            
            javaText += "public class " + getJavaClass(getFileName()) + " {\n";
            
            javaText += "public static void main(String[] args) {\n";
            javaText += "} \n";
            javaText += "}";
            
            
        //}
        return javaText;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
}
