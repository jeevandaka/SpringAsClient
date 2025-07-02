package com.example.SpringAsClient.ApiGetway.Api;

import com.example.SpringAsClient.dto.CategoryAPIResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface FakeStoreCategoryApi {

    @GET("api/products/category")
    public Call<CategoryAPIResponseDTO> getAllCategory();
}
