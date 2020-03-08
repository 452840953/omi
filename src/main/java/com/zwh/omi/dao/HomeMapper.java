package com.zwh.omi.dao;

import com.zwh.omi.entity.Home;
import java.util.List;

public interface HomeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Home record);

    Home selectByPrimaryKey(Integer id);

    List<Home> selectAll();

    int updateByPrimaryKey(Home record);
}