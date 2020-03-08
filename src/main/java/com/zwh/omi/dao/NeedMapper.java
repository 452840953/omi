package com.zwh.omi.dao;

import com.zwh.omi.entity.Need;
import java.util.List;

public interface NeedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Need record);

    Need selectByPrimaryKey(Integer id);

    List<Need> selectAll();

    int updateByPrimaryKey(Need record);
}