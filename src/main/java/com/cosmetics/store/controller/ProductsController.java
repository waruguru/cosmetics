package com.cosmetics.store.controller;

import com.cosmetics.store.models.Products;
import com.cosmetics.store.repository.ProductsRepository;
import com.cosmetics.store.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;
    private ProductsRepository productsRepository;

   /* @GetMapping("/")
    public showPage(Model model, @RequestParam(defaultValue = "0") int page){
        model.addAttribute("data", productsRepository.findAll(new PageRequest(page, 4)));
        return "home-page";*/
    //}
   @GetMapping("/")
   public String ShowPage(Model model, @RequestParam(defaultValue = "0") int page){
       model.addAttribute("data", productsRepository.findAll(new PageRequest(page,4)));
       return "index";
   }
    @PostMapping("/saveProducts")
    public String save(Products products){
         productsRepository.save(products);
         return "index";
    }
    @GetMapping("/listProducts")
    public List<Products> getAll(){
        return productsService.findAll();
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteById(@PathVariable(value = "id") Long id){
        productsService.delete(id);
        return "redirect:/index";
    }
    @DeleteMapping("/deleteAllProducts")
    public String deleteAll(){
        productsService.deleteAll();
        return "redirect:/index";
    }

    @GetMapping("/products/count")
    public long count(){
        return productsService.count();
    }
}