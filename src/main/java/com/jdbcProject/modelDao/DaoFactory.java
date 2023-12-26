package com.jdbcProject.modelDao;

import com.jdbcProject.modelDaoJDBC.SellerDaoJDBC;
import db.DB;

public class DaoFactory {

    public static SellerDao createSellerdao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

}
