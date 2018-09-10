package com.xiaopotian.product.service.impl;

import com.xiaopotian.product.data.ProductCategory;
import com.xiaopotian.product.repository.ProductCategoryRepository;
import com.xiaopotian.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-08
 * Time: 23:35
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
