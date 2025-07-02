package com.example.SpringAsClient.dto;
import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryAPIResponseDTO {
    private String status;
    private String message;
    private List<String> categories;

//    public List<String> getCategories() {
//        return categories;
//    }
//
//    public void setCategories(List<String> categories) {
//        this.categories = categories;
//    }
}
