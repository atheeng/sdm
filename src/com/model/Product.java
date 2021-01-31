
package com.model;
public class Product {
    private int id;
    private String productName;
    private String productType;
    private Double price;
    private int totalQty;
    private int availableQty;
    private String description;
    
   public Product(){
        
    }

    public Product(String productName, String productType, Double price, int totalQty, int availableQty, String description) {
        this.productName = productName;
        this.productType = productType;
        this.price = price;
        this.totalQty = totalQty;
        this.availableQty = availableQty;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
