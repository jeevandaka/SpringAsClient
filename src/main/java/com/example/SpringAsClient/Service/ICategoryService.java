package com.example.SpringAsClient.Service;

import com.example.SpringAsClient.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {
    List<CategoryDTO> getCategoryList() throws IOException;
}
