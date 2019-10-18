package com.issCollege.dao;

import com.issCollege.po.Standardsample;
import com.issCollege.po.StandardsampleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardsampleDAO {
    long countByExample(StandardsampleExample example);

    int deleteByExample(StandardsampleExample example);

    int deleteByPrimaryKey(Long standardsampleId);

    int insert(Standardsample record);

    int insertSelective(Standardsample record);

    List<Standardsample> selectByExample(StandardsampleExample example);

    Standardsample selectByPrimaryKey(Long standardsampleId);

    int updateByExampleSelective(@Param("record") Standardsample record, @Param("example") StandardsampleExample example);

    int updateByExample(@Param("record") Standardsample record, @Param("example") StandardsampleExample example);

    int updateByPrimaryKeySelective(Standardsample record);

    int updateByPrimaryKey(Standardsample record);
}