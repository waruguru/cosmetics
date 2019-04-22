package com.cosmetics.store.controller;

import com.cosmetics.store.models.Store;
import com.cosmetics.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @PostMapping("/saveStore")
    public Store save(@RequestBody Store store){
        return storeService.save(store);
    }

    @GetMapping("/listStore")
    public List<Store> getAll(){
        return storeService.findAll();
    }

    @DeleteMapping("/deleteStore/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        storeService.delete(id);
    }

    @DeleteMapping("/deleteAllStore")
    public void deleteAll(){
        storeService.deleteAll();
    }

    @GetMapping("/store/count")
    public long count(){
        return storeService.count();
    }
}