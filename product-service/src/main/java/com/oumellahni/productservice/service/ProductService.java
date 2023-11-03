package com.oumellahni.productservice.service;

import com.oumellahni.productservice.model.ProductRequest;
import com.oumellahni.productservice.model.ProductResponse;

public interface ProductService {

    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
