package com.zwh.omi.dao;

import com.zwh.omi.entity.Base;
import java.util.List;

public interface BaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Base record);

    Base selectByPrimaryKey(Integer id);

    List<Base> selectAll();

    int updateByPrimaryKey(Base record);
}