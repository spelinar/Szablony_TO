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
public class ProjectFactory {
    Project project;
    
    public ProjectFactory(Project project){
        this.project = project;
    }
    public void setProject(Project project){
        this.project = project;
    }
    Project cloneProject(){
        return (Project) project.copy();
    }
    
}
