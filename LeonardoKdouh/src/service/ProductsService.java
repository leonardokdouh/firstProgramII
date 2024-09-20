package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class ProductsService {

    private List<Products> productsLists;

    public ProductsService() {
        this.productsLists = new ArrayList<>();
    }

    public void addProduct(Products product) {
        productsLists.add(product);
    }


    public void showList() {
        productsLists.stream().forEach(prod -> System.out.println(prod));
    }


    public void showInstance() {
        for (Products prods : productsLists) {
            System.out.println("The product is from : " + prods.getClass());
        }
    }

    public List<Products> updateListOfProducts() {
        List<Products> aux = new ArrayList<>();
        for (Products product : productsLists) {
            float percentage = 0;
            if (product instanceof Notebook)
                percentage = 1.20f;
            if (product instanceof Printer)
                percentage = 1.15f;
            if (product instanceof Desk)
                percentage = 1.10f;
            if (product instanceof Chair)
                percentage = 1.05f;
            product.setPrice(product.getPrice()*percentage);
            aux.add(product);
        }
        return aux;
    }

    public void printUpdatedProducts(){
        List<Products> newList = updateListOfProducts();
        for(Products product: newList){
            System.out.println(product);
        }
    }




}



