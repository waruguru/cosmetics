package com.cosmetics.store.controller;

import com.cosmetics.store.models.ProductTypes;
import com.cosmetics.store.service.ProductTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("productType")
public class ProductTypesController {

    @Autowired
    private ProductTypesService producttypesService;

    @PostMapping("/saveProducttypes")
    public ProductTypes save(@RequestBody ProductTypes producttypes){
        return producttypesService.save(producttypes);
    }

   /* @GetMapping("/producttypes/{id}")
    public ProductTypes getById(@PathVariable(value = "id") Long id){
        return producttypesService.find(id);
    }*/

    @GetMapping("/producttypes")
    public List<ProductTypes> getAll(){
        return producttypesService.findAll();
    }

    @DeleteMapping("/producttypes/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        producttypesService.delete(id);
    }

    @DeleteMapping("/producttypes")
    public void deleteAll(){
        producttypesService.deleteAll();
    }

    @GetMapping("/producttypes/count")
    public long count(){
        return producttypesService.count();
    }
}