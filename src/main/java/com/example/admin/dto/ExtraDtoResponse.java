package com.example.admin.dto;

import lombok.Data;

import java.util.List;

@Data
public class ExtraDtoResponse {
    List<ProductCategoryRequest> productCategoryRequestList;

    public List<ProductCategoryRequest> getProductCategoryRequestList () {
        return productCategoryRequestList;
    }

    public void setProductCategoryRequestList (List<ProductCategoryRequest> productCategoryRequestList) {
        this.productCategoryRequestList = productCategoryRequestList;
    }
}
