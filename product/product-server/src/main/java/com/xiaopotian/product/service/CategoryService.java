package com.xiaopotian.product.service;

import com.xiaopotian.product.data.ProductCategory;

import java.util.List;

/**
 * ==========================================
 * 类目
 * User: 小破天
 * Date: 2018-08-08
 * Time: 23:33
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
