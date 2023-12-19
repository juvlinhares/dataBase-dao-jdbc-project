package com.jdbcProject.dao;

import com.jdbcProject.modelDaoImplementation.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
