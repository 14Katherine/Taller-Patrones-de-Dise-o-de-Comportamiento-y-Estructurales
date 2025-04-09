/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.DesignPatterns.domain.TemplateMethod;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

/**
 *
 * @author Katherine
 */
public abstract class ProjectEvaluator {

    public final void evaluate(Project project) {
        reviewDocumentation(project);
        validateRequirements(project);
        makeDecision(project);
    }

    protected abstract void reviewDocumentation(Project project);

    protected abstract void validateRequirements(Project project);

    protected abstract void makeDecision(Project project);

}
