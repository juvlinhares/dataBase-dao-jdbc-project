package com.jdbcProject.modelDao;

import entities.Department;

import java.util.List;

public interface DepartmentDao {
    void insertDepartment(Department obj);
    void updateDepartment(Department obj);
    void deleteDepartment(int id);
    Department findDepartmentById(int id);
    List<Department> findAllDepartments();
}
