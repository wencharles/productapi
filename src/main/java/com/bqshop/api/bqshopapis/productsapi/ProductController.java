package com.bqshop.api.bqshopapis.productsapi;

import com.fasterxml.jackson.core.JsonGenerator;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "product", method = RequestMethod.GET )
public class ProductController {
    private List<ProductModel> product;

    public ProductController(){
        product = new ArrayList<>();
        product.add(new ProductModel("Shoes",100,"Wearables"));
        product.add(new ProductModel("Shoes",100,"Wearables"));
        product.add(new ProductModel("Shoes",100,"Wearables"));
        product.add(new ProductModel("Shoes",100,"Wearables"));
        product.add(new ProductModel("Shoes",100,"Wearables"));
    }
    @RequestMapping(value = "/all", method = RequestMethod.GET )
    public List<ProductModel> getAll(){

        return product;
    }
    public void addProduct(ProductModel productModel)
    {
        product.add(productModel);
    }
    public ProductModel getProduct(String name)
    {
        return;
    }


}
