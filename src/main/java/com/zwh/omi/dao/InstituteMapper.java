package com.zwh.omi.dao;

import com.zwh.omi.entity.Institute;
import java.util.List;

public interface InstituteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Institute record);

    Institute selectByPrimaryKey(Integer id);

    List<Institute> selectAll();

    int updateByPrimaryKey(Institute record);
}