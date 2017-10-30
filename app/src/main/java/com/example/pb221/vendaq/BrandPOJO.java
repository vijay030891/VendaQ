package com.example.pb221.vendaq;

/**
 * Created by pb221 on 27-10-2017.
 */

public class BrandPOJO {

    private String brandName;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandDescription() {
        return brandDescription;
    }

    public void setBrandDescription(String brandDescription) {
        this.brandDescription = brandDescription;
    }

    public String getBrandNoOfProduct() {
        return brandNoOfProduct;
    }

    public void setBrandNoOfProduct(String brandNoOfProduct) {
        this.brandNoOfProduct = brandNoOfProduct;
    }

    private String brandDescription;

    public BrandPOJO(String brandName, String brandDescription, String brandNoOfProduct) {
        this.brandName = brandName;
        this.brandDescription = brandDescription;
        this.brandNoOfProduct = brandNoOfProduct;
    }

    private String brandNoOfProduct;
}
