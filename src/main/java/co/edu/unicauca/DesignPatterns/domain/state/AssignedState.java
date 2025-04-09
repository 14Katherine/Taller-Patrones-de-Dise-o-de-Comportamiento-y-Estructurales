/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.DesignPatterns.domain.state;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

/**
 *
 * @author Katherine
 */
public class AssignedState implements ProjectState{
     @Override
    public void approve(Project project) {
        System.out.println("El proyecto ya fue aprobado y asignado.");
    }

    @Override
    public void reject(Project project) {
        System.out.println("No se puede rechazar un proyecto asignado.");
    }

    @Override
    public void assign(Project project) {
        System.out.println("El proyecto ya está asignado.");
    }

    @Override
    public void complete(Project project) {
        project.setState(new CompletedState());
        System.out.println("Proyecto completado.");
    }
}
