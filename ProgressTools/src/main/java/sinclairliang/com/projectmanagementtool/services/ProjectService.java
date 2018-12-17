package sinclairliang.com.projectmanagementtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sinclairliang.com.projectmanagementtool.domain.Project;
import sinclairliang.com.projectmanagementtool.repositories.ProjectRepository;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {

        // many more logic

        return projectRepository.save(project);
    }
}
