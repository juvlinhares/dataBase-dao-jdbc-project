package com.jdbcProject;

import entities.Department;
import entities.Seller;

import java.sql.Date;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LocalDate localDate = new Date(1983, 10, 11).toLocalDate();
        Date sqlDate = Date.valueOf(localDate);
        Department dep = new Department(1, "book");

        Seller sel = new Seller(1, "bob", "bob@gmail", sqlDate, 3000.0,  dep);

        System.out.println(dep);

        }
    }
