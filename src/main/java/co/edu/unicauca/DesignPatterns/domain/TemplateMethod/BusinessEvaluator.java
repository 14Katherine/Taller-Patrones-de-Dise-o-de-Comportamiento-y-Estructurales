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
public class BusinessEvaluator extends ProjectEvaluator{
   @Override
    protected void reviewDocumentation(Project project) {
        System.out.println("BusinessEvaluator: Revisando la documentacion financiera del proyecto " + project.getName());
    }

    @Override
    protected void validateRequirements(Project project) {
        System.out.println("BusinessEvaluator: Validando viabilidad de negocio del proyecto " + project.getName());
    }

    @Override
    protected void makeDecision(Project project) {
        System.out.println("BusinessEvaluator: Proyecto aprobado desde la perspectiva de negocio.");
    } 
}
