package com.newcode.myshop.request;

import com.newcode.myshop.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductUpdateRequest {
    private Long id;
    private String name;
    private String description;
    private String Brand;
    private BigDecimal price;
    private int inventory;
    private Category category;
}
