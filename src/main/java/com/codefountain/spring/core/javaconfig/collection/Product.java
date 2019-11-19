package com.codefountain.spring.core.javaconfig.collection;

public class Product {

    private String productId;
    private String prodctDesc;

    public Product(String productId, String prodctDesc) {
        this.productId = productId;
        this.prodctDesc = prodctDesc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", prodctDesc='" + prodctDesc + '\'' +
                '}';
    }
}
