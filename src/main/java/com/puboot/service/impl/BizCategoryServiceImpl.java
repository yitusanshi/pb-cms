package com.puboot.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.puboot.mapper.BizCategoryMapper;
import com.puboot.model.BizCategory;
import com.puboot.service.BizCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Linzhaoguan
 * @version V1.0
 * @date 2019年9月11日
 */
@Service
@AllArgsConstructor
public class BizCategoryServiceImpl extends ServiceImpl<BizCategoryMapper, BizCategory> implements BizCategoryService {

    private final BizCategoryMapper bizCategoryMapper;

    @Override
    public List<BizCategory> selectCategories(BizCategory bizCategory) {
        return bizCategoryMapper.selectCategories(bizCategory);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return bizCategoryMapper.deleteBatch(ids);
    }

    @Override
    public BizCategory selectById(Integer id) {
        return bizCategoryMapper.getById(id);
    }

    @Override
    public List<BizCategory> selectByPid(Integer pid) {
        return bizCategoryMapper.selectList(Wrappers.<BizCategory>lambdaQuery().eq(BizCategory::getPid, pid));
    }
}
