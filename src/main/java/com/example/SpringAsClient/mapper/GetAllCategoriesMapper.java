package com.example.SpringAsClient.mapper;

import com.example.SpringAsClient.dto.CategoryAPIResponseDTO;
import com.example.SpringAsClient.dto.CategoryDTO;

import java.util.List;

public class GetAllCategoriesMapper {

    public static List<CategoryDTO> toCategoryDto(CategoryAPIResponseDTO dto) {
        return dto.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();
    }
}
