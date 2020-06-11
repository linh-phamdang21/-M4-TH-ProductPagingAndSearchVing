package com.codegym.model;

public class Cart {
    private Long productId;
    private int quantity;

    public Cart(){

    }

    public Cart(Long productId, int quantity){
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int productIncrement(){
        return quantity++;
    }
}