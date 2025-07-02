package com.example.SpringAsClient.ApiGetway;

import com.example.SpringAsClient.ApiGetway.Api.FakeStoreCategoryApi;
import com.example.SpringAsClient.dto.CategoryAPIResponseDTO;
import com.example.SpringAsClient.dto.CategoryDTO;
import com.example.SpringAsClient.mapper.GetAllCategoriesMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class CategoryGateway implements ICategoryGateway{

    FakeStoreCategoryApi fakeStoreCategoryApi;

    CategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi){
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getCategories() throws IOException {
        CategoryAPIResponseDTO response;
        try {
            response = (CategoryAPIResponseDTO) fakeStoreCategoryApi.getAllCategory().execute().body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(response == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }
        return GetAllCategoriesMapper.toCategoryDto(response);
    }
}
