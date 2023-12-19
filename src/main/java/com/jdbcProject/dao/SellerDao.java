package com.jdbcProject.dao;

import entities.Seller;

import java.util.List;

public interface SellerDao {

    //insert, update,delete, findById, findAll
    void insertSeller (Seller obj);
    void updateSeller(Seller obj);
    void deleteSeller(Seller obj);
    Seller findById(int id);
    List<Seller> findAll();
}
