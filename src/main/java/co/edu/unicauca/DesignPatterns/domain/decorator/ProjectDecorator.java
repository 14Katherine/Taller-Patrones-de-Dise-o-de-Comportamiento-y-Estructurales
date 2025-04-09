/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.DesignPatterns.domain.decorator;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

/**
 *
 * @author Katherine
 */
public abstract class ProjectDecorator extends Project {
    protected Project project;

    public ProjectDecorator(Project project) {
        super(project.getName());
        this.project = project;
    }

    @Override
    public String getDescription() {
        return project.getDescription();
    }
}
