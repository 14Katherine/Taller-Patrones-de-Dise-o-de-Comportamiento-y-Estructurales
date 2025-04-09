/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.DesignPatterns.domain.entities;

import co.edu.unicauca.DesignPatterns.domain.state.PendingState;
import co.edu.unicauca.DesignPatterns.domain.state.ProjectState;

/**
 *
 * @author Katherine
 */
public class Project {

    private String name;
    private ProjectState state;

    public Project(String name) {
        this.name = name;
        this.state = new PendingState(); // Estado inicial
    }

    public void setState(ProjectState state) {
        this.state = state;
    }

    public ProjectState getState() {
        return state;
    }

    public void approve() {
        state.approve(this);
    }

    public void reject() {
        state.reject(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void assign() {
        state.assign(this);
    }

    public void complete() {
        state.complete(this);
    }

    public String getDescription() {
        return "Project: " + name;
    }

}
