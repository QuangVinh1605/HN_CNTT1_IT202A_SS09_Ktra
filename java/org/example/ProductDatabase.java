package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductDatabase {
    private static ProductDatabase instance;
    private List<Product> products;
    private ProductDatabase(){
        products=new ArrayList<>();
    }
    public static ProductDatabase getInstance(){
        if (instance==null){
            instance=new ProductDatabase();
        }
        return instance;
    }
    public void addProduct(Product p){
        products.add(p);
    }
    public void getAllProduct(){
        for (Product p:products){
            System.out.println(p);
        }
    }
    void removeProduct(String id){
        products.removeIf(p->p.getId().equals(id));
    }
    public Optional<Product> findProductById(String id){
        return products.stream().filter(p->p.getId().equals(id)).findFirst();
    }

    void updateProduct(String id,String name,double price){
        Optional<Product> opt = findProductById(id);
        if (opt.isPresent()){
            Product p=opt.get();
            p.setName(name);
            p.setPrice(price);
        }

    }
}
