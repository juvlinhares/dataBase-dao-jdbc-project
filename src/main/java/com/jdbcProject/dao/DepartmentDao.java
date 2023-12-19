package com.jdbcProject.dao;

import entities.Department;

import java.util.List;

public interface DepartmentDao {

    //insert, delete, update, findById, findAll

    void insertDepartment(Department obj);
    void deleteDepartment(Department obj);
    void updateDepartment(Department obj);

    Department findById(int id);
    List<Department> findAll();
}
