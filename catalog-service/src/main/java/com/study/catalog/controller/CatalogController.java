package com.study.catalog.controller;

import com.study.catalog.model.Catalog;
import com.study.catalog.service.CatalogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalogs")
public class CatalogController {

    private CatalogService catalogService;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<List<Catalog>> getAll() {
        return ResponseEntity.ok(catalogService.getAll());
    }
}
