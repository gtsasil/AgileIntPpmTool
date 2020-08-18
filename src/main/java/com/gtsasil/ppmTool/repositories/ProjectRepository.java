package com.gtsasil.ppmTool.repositories;

import com.gtsasil.ppmTool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    Project findByProjectIdentifier(String prejectId);

    @Override
    Iterable<Project> findAll();
}
