package dao;

import entity.Project;

import java.util.List;

public interface ProjectDAO {

    //create
    void add(Project project);

    //read
    List<Project> readAll();

    Project readById(long id);

    //update
    void update(Project project);

    //delete
    void remove(Project project);
}
