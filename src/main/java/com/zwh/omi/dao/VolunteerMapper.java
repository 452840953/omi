package com.zwh.omi.dao;

import com.zwh.omi.entity.Volunteer;
import java.util.List;

public interface VolunteerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Volunteer record);

    Volunteer selectByPrimaryKey(Integer id);

    List<Volunteer> selectAll();

    int updateByPrimaryKey(Volunteer record);
}