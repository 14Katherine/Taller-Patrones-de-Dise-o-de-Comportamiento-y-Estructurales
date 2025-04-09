/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.DesignPatterns.domain.adapter;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;
import co.edu.unicauca.DesignPatterns.domain.adapter.ProjectDataProvider;
import org.json.JSONObject;

/**
 *
 * @author Katherine
 */
public class ProjectAdapter implements ProjectDataProvider {

    private ExternalProjectService externalService;

    public ProjectAdapter(ExternalProjectService externalService) {
        this.externalService = externalService;
    }

    @Override
    public Project getProject() {
        String jsonData = externalService.getProjectData();
        JSONObject jsonObject = new JSONObject(jsonData);
        String name = jsonObject.getString("Name");
        return new Project(name);
    }
}
