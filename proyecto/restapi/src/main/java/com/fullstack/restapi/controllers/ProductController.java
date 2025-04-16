package com.fullstack.restapi.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("api/v1")
public class ProductController {

    @GetMapping("/productos")
    public String allProducts(){
        return "afsgf";
    }
@GetMapping("/productos/{id}")
public String getProduct(@PathVariable Long id){
    return "Haz retornado el producto con el id:" + id.toString();
}

}
