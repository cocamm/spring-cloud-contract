package com.study.catalog.service;

import com.study.catalog.model.Catalog;
import com.study.catalog.model.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SimpleCatalogService implements CatalogService {

    private Map<String, Catalog> catalogs;

    public SimpleCatalogService() {
        catalogs = new HashMap<>();
        catalogs.put("1", Catalog.builder()
                .id("1")
                .products(List.of(Product.builder()
                        .id("1")
                        .name("Product Name")
                        .description("Product Description")
                        .value(BigDecimal.TEN)
                        .build()))
                .build());
    }

    @Override
    public List<Catalog> getAll() {
        return new ArrayList<>(catalogs.values());
    }
}
