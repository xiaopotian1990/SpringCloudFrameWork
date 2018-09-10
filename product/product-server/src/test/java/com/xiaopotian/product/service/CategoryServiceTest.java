package com.xiaopotian.product.service;

import com.xiaopotian.product.ProductApplicationTests;
import com.xiaopotian.product.data.ProductCategory;
import com.xiaopotian.product.service.impl.CategoryServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Component
public class CategoryServiceTest extends ProductApplicationTests {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> result = categoryService.findByCategoryTypeIn(Arrays.asList(11, 22));
        Assert.assertTrue(result.size() > 0);
    }
}