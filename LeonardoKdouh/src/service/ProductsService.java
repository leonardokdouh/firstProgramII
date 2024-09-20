package service;

import model.Products;

import java.util.ArrayList;
import java.util.List;

public class ProductsService {

    private List<Products> productsLists = new ArrayList<>();


    public void addProduct(Products product){
        productsLists.add(product);
    }







}
