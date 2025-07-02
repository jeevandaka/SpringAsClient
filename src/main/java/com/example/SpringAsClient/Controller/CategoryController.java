package com.example.SpringAsClient.Controller;

import com.example.SpringAsClient.Service.ICategoryService;
import com.example.SpringAsClient.dto.CategoryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/products")
public class CategoryController {
    ICategoryService service;
    CategoryController(ICategoryService service){
        this.service =service;
    }
    @GetMapping("/category")
    public ResponseEntity<List<CategoryDTO>> getAllCategory() throws IOException {
        List<CategoryDTO> result = service.getCategoryList();
        return ResponseEntity.ok(result);
    }
    @GetMapping("/get")
    public String getAll() throws IOException {
        return "service.getCategoryList()";
    }
}
