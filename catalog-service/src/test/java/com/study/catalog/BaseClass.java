package com.study.catalog;

import com.study.catalog.controller.CatalogController;
import com.study.catalog.service.CatalogService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CatalogServiceApplication.class)
public abstract class BaseClass {

    @Autowired
    CatalogController catalogController;

    @SpyBean
    CatalogService catalogService;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(catalogController);
    }
}