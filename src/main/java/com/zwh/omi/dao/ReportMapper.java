package com.zwh.omi.dao;

import com.zwh.omi.entity.Report;
import java.util.List;

public interface ReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Report record);

    Report selectByPrimaryKey(Integer id);

    List<Report> selectAll();

    int updateByPrimaryKey(Report record);
}