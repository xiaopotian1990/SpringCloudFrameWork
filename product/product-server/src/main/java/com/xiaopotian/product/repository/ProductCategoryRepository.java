package com.xiaopotian.product.repository;

import com.xiaopotian.product.data.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-08
 * Time: 20:56
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
