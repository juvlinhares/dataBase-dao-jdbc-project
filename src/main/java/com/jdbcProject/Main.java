package com.jdbcProject;

import com.jdbcProject.modelDao.DaoFactory;
import com.jdbcProject.modelDao.SellerDao;
import com.jdbcProject.modelDaoJDBC.SellerDaoJDBC;
import entities.Department;
import entities.Seller;

import java.sql.Date;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerdao();

      Seller seller = sellerDao.findSellerById(3);
        System.out.println(seller);
        }
    }
