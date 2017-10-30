package com.example.pb221.vendaq;

/**
 * Created by pb221 on 29-10-2017.
 */

public class SupplierPOJO {

    private String supplierName;

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierDescription() {
        return supplierDescription;
    }

    public void setSupplierDescription(String supplierDescription) {
        this.supplierDescription = supplierDescription;
    }

    public String getSupplierDefaultMarkup() {
        return supplierDefaultMarkup;
    }

    public void setSupplierDefaultMarkup(String supplierDefaultMarkup) {
        this.supplierDefaultMarkup = supplierDefaultMarkup;
    }

    public String getSupplierNoOfProduct() {
        return supplierNoOfProduct;
    }

    public void setSupplierNoOfProduct(String supplierNoOfProduct) {
        this.supplierNoOfProduct = supplierNoOfProduct;
    }

    private String supplierDescription;

    public SupplierPOJO(String supplierName, String supplierDescription, String supplierDefaultMarkup, String supplierNoOfProduct) {
        this.supplierName = supplierName;
        this.supplierDescription = supplierDescription;
        this.supplierDefaultMarkup = supplierDefaultMarkup;
        this.supplierNoOfProduct = supplierNoOfProduct;
    }

    private String supplierDefaultMarkup;
    private String supplierNoOfProduct;
}
