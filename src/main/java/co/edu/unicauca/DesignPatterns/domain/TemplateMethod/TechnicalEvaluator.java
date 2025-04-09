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
public class TechnicalEvaluator extends ProjectEvaluator{
     @Override
    protected void reviewDocumentation(Project project) {
        System.out.println("TechnicalEvaluator: Revisando especificaciones tecnicas del proyecto " + project.getName());
    }

    @Override
    protected void validateRequirements(Project project) {
        System.out.println("TechnicalEvaluator: Verificando requisitos tecnicos del proyecto " + project.getName());
    }

    @Override
    protected void makeDecision(Project project) {
        System.out.println("TechnicalEvaluator: Proyecto aprobado desde la perspectiva tecnica.");
    }
}
