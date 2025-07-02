package com.example.SpringAsClient.Service;

import com.example.SpringAsClient.ApiGetway.ICategoryGateway;
import com.example.SpringAsClient.dto.CategoryDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryService implements ICategoryService{
    ICategoryGateway categoryGateway;
    FakeStoreCategoryService(ICategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;
    }
    @Override
    public List<CategoryDTO> getCategoryList() throws IOException {
        return categoryGateway.getCategories();
    }
}
