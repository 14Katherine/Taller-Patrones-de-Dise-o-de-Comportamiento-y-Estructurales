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
public class PendingState implements ProjectState{
    @Override
    public void approve(Project project) {
        project.setState(new ApprovedState());
        System.out.println("Proyecto aprobado.");
    }

    @Override
    public void reject(Project project) {
        project.setState(new RejectState());
        System.out.println("Proyecto rechazado.");
    }

    @Override
    public void assign(Project project) {
        System.out.println("No se puede asignar un proyecto pendiente.");
    }

    @Override
    public void complete(Project project) {
        System.out.println("No se puede completar un proyecto pendiente.");
    }
}
