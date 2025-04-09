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
public class ApprovedState implements ProjectState{
     @Override
    public void approve(Project project) {
        System.out.println("El proyecto ya está aprobado.");
    }

    @Override
    public void reject(Project project) {
        System.out.println("No se puede rechazar un proyecto aprobado.");
    }

    @Override
    public void assign(Project project) {
        project.setState(new AssignedState());
        System.out.println("Proyecto asignado.");
    }

    @Override
    public void complete(Project project) {
        System.out.println("No se puede completar un proyecto que aún no ha sido asignado.");
    }
}
