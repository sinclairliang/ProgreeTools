package sinclairliang.com.projectmanagementtool.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sinclairliang.com.projectmanagementtool.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);

    @Override
    <S extends Project> S save(S s);
}