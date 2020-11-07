package dao;

import entity.EmplProj;

import java.util.List;

public interface EmplProjDAO {
    //create
    void add(EmplProj emplProj);

    //read
    List<EmplProj> readAll();

    EmplProj readByEmployeeIdAndProjectId(long employeeId, long projectId);

    //update
    void update(EmplProj emplProj);

    //delete
    void remove(EmplProj emplProj);
}
