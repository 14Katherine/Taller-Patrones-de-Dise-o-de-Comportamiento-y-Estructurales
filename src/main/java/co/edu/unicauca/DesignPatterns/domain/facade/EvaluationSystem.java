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
public class EvaluationSystem {
    public boolean evaluate(Project project) {
        System.out.println("Evaluating project: " + project.getName());
        return Math.random() > 0.3; // 70% probability of approval
    }
}

