package com.jdbcProject.modelDaoJDBC;

import db.DB;
import db.DbException;
import entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DepartmentDaoJDBC {

    private Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    //findById, findAll, insert, delete, update
    public void insertDepartment(Department obj) {

    }

    public void updateDepartment(Department obj) {

    }

    public void deleteDepartment(int id) {

    }

    public Department findDepartmentById(int id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT departement.* "
                    + "FROM department "
                    + "WHERE departement.Id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Department dep = new Department();
                dep.setId(rs.getInt("Id"));
                dep.setName(rs.getString("Name"));
                return dep;
            }
            return null;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatment(st);
            DB.closeResultSet(rs);
        }
    }

    public static List<Department> findAll() {
        return null;
    }

}
