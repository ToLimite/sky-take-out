package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.result.PageResult;
import org.springframework.stereotype.Service;

public interface CategoryService {
    /**
     * 新增分类
     */
    void save(CategoryDTO categoryDTO);

    /**
     * 分类分页查询
     * @param categoryPageQueryDTO
     * @return
     */
    PageResult page(CategoryPageQueryDTO categoryPageQueryDTO);

    void startOrStop(Integer status, Long id);

    void deleteById(Long id);

    void update(CategoryDTO categoryDTO);
}
