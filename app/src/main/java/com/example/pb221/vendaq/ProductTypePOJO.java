package com.example.pb221.vendaq;

/**
 * Created by pb221 on 29-10-2017.
 */

public class ProductTypePOJO {

   public ProductTypePOJO(String productName, String productNoOfProduct) {
      this.productName = productName;
      this.productNoOfProduct = productNoOfProduct;
   }

   public String getProductName() {
      return productName;
   }

   public void setProductName(String productName) {
      this.productName = productName;
   }

   public String getProductNoOfProduct() {
      return productNoOfProduct;
   }

   public void setProductNoOfProduct(String productNoOfProduct) {
      this.productNoOfProduct = productNoOfProduct;
   }

   private String productName;
   private String productNoOfProduct;
}
