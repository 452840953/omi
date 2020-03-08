package com.zwh.omi.dao;

import com.zwh.omi.entity.Data;
import java.util.List;

public interface DataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Data record);

    Data selectByPrimaryKey(Integer id);

    List<Data> selectAll();

    int updateByPrimaryKey(Data record);
}