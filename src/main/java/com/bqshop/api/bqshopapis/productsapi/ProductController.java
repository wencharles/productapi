package com.bqshop.api.bqshopapis.productsapi;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping(value = "/product", method = RequestMethod.GET )
public class ProductController {

ArrayList<ProductModel> product = new ArrayList<>(Arrays.asList(
        new ProductModel("shoes", 1000, "wearables"),
        new ProductModel("boots", 1000, "clothes "),
        new ProductModel("boxers",200,"shoes")
));

    @RequestMapping(value = "/all", method = RequestMethod.GET )
    public ArrayList<ProductModel> getAll(){

        return product;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public ArrayList<ProductModel> addItem(@RequestBody ProductModel productModel){
    product.add(productModel);
    return product;
}
    @RequestMapping(method = RequestMethod.GET,value = "/get/{pathname}")
    public ProductModel getProduct(@PathVariable String pathname){
        return product.stream().filter(t->t.getName().equals(pathname)).findFirst().get();
    }
    @RequestMapping(method = RequestMethod.POST, value = "/update/{pathname}")
    public ArrayList<ProductModel> updateProduct(@RequestBody ProductModel PM, @PathVariable String pathname){
        //product.stream().filter(t->t.getName().equals(pathname) product.set(t,PM));
        //lambda doesnt work and im tired

        for (int i =0; i<product.size(); i++){

            ProductModel t = product.get(i);
            if (t.getName().equals(pathname))
            {
                product.set(i, PM);

            }
        }
        return product;
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{name}")
    public ArrayList<ProductModel> deleteProduct(@PathVariable String name)
    {
        product.removeIf(t->t.getName().equals(name));
        return product;
    }
}
