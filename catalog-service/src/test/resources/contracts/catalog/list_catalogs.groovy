package contracts.catalog

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Should list all catalogs"

    request {
        url "/catalogs/"
        method "GET"
        headers {
            contentType(applicationJson())
        }
    }

    response {
        status OK()
        headers {
            contentType(applicationJson())
        }
        body([[
                      id      : "1",
                      products:
                              [[
                                       id         : "1",
                                       name       : "Product Name",
                                       description: "Product Description"
                               ]]
              ]])
    }
}