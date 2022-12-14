package com.example.mybatispractice.service;

import com.example.mybatispractice.repository.ProductDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductDao productDao;

    public List<HashMap<String, Object>> getProductsWithDao() {
        return productDao.getProducts();
    }
}
