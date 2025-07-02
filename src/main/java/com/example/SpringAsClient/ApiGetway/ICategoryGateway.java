package com.example.SpringAsClient.ApiGetway;

import com.example.SpringAsClient.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {
    List<CategoryDTO> getCategories() throws IOException;
}
