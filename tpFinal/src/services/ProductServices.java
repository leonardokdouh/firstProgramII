package services;

import model.products.GamingProducts;
import model.products.Products;
import model.products.VideoProducts;

import java.util.ArrayList;
import java.util.List;

public class ProductServices {

    private List<Products> productsLists;

    public void ProductsService() {
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
            if (product instanceof GamingProducts)
                percentage = 1.20f;
            if (product instanceof VideoProducts)
                percentage = 1.15f;
            product.setPrice((int) (product.getPrice()*percentage));
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
