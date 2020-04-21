package com.demogorgen.mapper;

import com.demogorgen.bean.Country;
import com.demogorgen.bean.UserVo;

import java.util.List;

/**
 * @author lzr
 * @date 2020/4/21 17:04:21
 * @description
 */
public interface CountryMapper {
    public List<Country> SelectAllCountry();
    public List<UserVo> Select();
}
