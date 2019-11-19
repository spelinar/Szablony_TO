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
public class Project implements Copyable {
    private int id;
    private String projectName;
    private String sourceCode;
    
    
    public Project(int id, String projektName, String sourceCode){
       this.id = id;
       this.projectName = projectName;
       this.sourceCode = sourceCode;
       
    }
    
    public int getId(){
        return id;
    }
    public void getId(int id){
        this.id = id;
    }
    public String getProjectName(){
        return projectName;
    }
    public void setProjectName(String projektName){
        this.projectName = projectName;
    }
    public String getSourceCode(){
        return sourceCode;
    }
    public void setSourceCode(String sourceCode){
        this.sourceCode = sourceCode;
        
    }
    @Override
    public Object copy(){
        Project copy = new Project(id, projectName, sourceCode);
        return copy;
    }
    @Override
    public String toString(){
        return "Project{" +
                "id=" + id + 
                        ", projectName='" + projectName + '\'' +
                        ", sourceCode='" + sourceCode + '\'' +
                        '}';
    }
}
