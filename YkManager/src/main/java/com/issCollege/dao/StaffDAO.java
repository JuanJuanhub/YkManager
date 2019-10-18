package com.issCollege.dao;

import com.issCollege.po.Staff;
import com.issCollege.po.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffDAO {
    long countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(Long staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(Long staffId);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}