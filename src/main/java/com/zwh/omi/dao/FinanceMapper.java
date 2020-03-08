package com.zwh.omi.dao;

import com.zwh.omi.entity.Finance;
import java.util.List;

public interface FinanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Finance record);

    Finance selectByPrimaryKey(Integer id);

    List<Finance> selectAll();

    int updateByPrimaryKey(Finance record);
}