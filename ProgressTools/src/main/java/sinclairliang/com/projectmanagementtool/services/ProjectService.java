package sinclairliang.com.projectmanagementtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sinclairliang.com.projectmanagementtool.domain.Project;
import sinclairliang.com.projectmanagementtool.exceptions.ProjectIdException;
import sinclairliang.com.projectmanagementtool.repositories.ProjectRepository;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {

        // many more logic
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            // set the Project Identifier to upper case;
            return projectRepository.save(project);
        } catch (Exception e) {
            throw new ProjectIdException("Project ID '" + project.getProjectIdentifier().toUpperCase() + "' already existed");
        }
    }
}
