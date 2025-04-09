/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.DesignPatterns.domain.facade;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

/**
 *
 * @author Katherine
 */
public class PlatformFacade {

    private EvaluationSystem evaluation;
    private AssignmentSystem assignment;

    public PlatformFacade() {
        this.evaluation = new EvaluationSystem();
        this.assignment = new AssignmentSystem();
    }

    public void manageProject(Project project) {
        if (evaluation.evaluate(project)) {
            if (assignment.assign(project)) {
                System.out.println("Project successfully managed and assigned.");
            } else {
                System.out.println("Project approved but no student available.");
            }
        } else {
            System.out.println("Project evaluation failed.");
        }
    }

}
