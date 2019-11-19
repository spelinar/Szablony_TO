 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.builder;

/**
 *
 * @author 4
 */
public interface VersionControlRuner {
    public static void main(String[] args){
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();\n");
        
        System.out.println(master);
        
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        
        System.out.println("\n========================\n");
        System.out.println(masterClone);
        
        
    }
}
