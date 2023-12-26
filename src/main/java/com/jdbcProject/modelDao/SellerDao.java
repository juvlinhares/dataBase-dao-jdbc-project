package com.jdbcProject.modelDao;

import entities.Seller;

import java.util.List;

public interface SellerDao {
    void insertSeller(Seller obj);
    void updateSeller(Seller obj);
    void deleteSeller(int id);
    Seller findSellerById(int id);
    List<Seller> findAllSellers();
}
