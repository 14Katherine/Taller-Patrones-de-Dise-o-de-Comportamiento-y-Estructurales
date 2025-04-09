package co.edu.unicauca.DesignPatterns.Main;

import co.edu.unicauca.DesignPatterns.domain.TemplateMethod.BusinessEvaluator;
import co.edu.unicauca.DesignPatterns.domain.TemplateMethod.ProjectEvaluator;
import co.edu.unicauca.DesignPatterns.domain.TemplateMethod.TechnicalEvaluator;
import co.edu.unicauca.DesignPatterns.domain.adapter.ExternalProjectService;
import co.edu.unicauca.DesignPatterns.domain.adapter.ProjectAdapter;
import co.edu.unicauca.DesignPatterns.domain.adapter.ProjectDataProvider;
import co.edu.unicauca.DesignPatterns.domain.decorator.PriorityProject;
import co.edu.unicauca.DesignPatterns.domain.entities.Project;
import co.edu.unicauca.DesignPatterns.domain.facade.PlatformFacade;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Katherine
 */
public class Main {

    public static void main(String[] args) {
        // Crear proyecto
        Project project = new Project("Academic Management System");

        // Patrón State en acción
        System.out.println("STATE PATTERN");
        System.out.println("Initial state: " + project.getState().getClass().getSimpleName());
        // Transiciones de estado
        project.approve();
        System.out.println("Current state: " + project.getState().getClass().getSimpleName());
        project.assign();
        System.out.println("Current state: " + project.getState().getClass().getSimpleName());
        project.complete();
        System.out.println("Current state: " + project.getState().getClass().getSimpleName());
        // Intentar completar otra vez (no debería cambiar nada)
        project.complete();
        System.out.println("Final state: " + project.getState().getClass().getSimpleName());

        //Patrón Template Method System
        System.out.println("TEMPLAE METHOD PATTERN");
        System.out.println("Evaluacion tecnica:");
        ProjectEvaluator technical = new TechnicalEvaluator();
        technical.evaluate(project);

        System.out.println("\nEvaluacion de negocio:");
        ProjectEvaluator business = new BusinessEvaluator();
        business.evaluate(project);

        //Patron decorator
        System.out.println("DECORATOR PATTERN");
        PriorityProject priorityProject = new PriorityProject(project);
        System.out.println("Project description: " + priorityProject.getDescription());

        // Patrón Adapter
        System.out.println("ADAPTER PATTERN");
        ExternalProjectService externalService = new ExternalProjectService();
        ProjectDataProvider adapter = new ProjectAdapter(externalService);
        Project adaptedProject = adapter.getProject();
        System.out.println("Project created from external service: " + adaptedProject.getName());

        //Patron Facade
        System.out.println("FACADE PATTERN");
        PlatformFacade platform = new PlatformFacade();
        platform.manageProject(project);

    }

}


