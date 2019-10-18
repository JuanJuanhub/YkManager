package com.issCollege.dao;

import com.issCollege.po.Sample;
import com.issCollege.po.SampleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleDAO {
    long countByExample(SampleExample example);

    int deleteByExample(SampleExample example);

    int deleteByPrimaryKey(Long sampletbId);

    int insert(Sample record);

    int insertSelective(Sample record);

    List<Sample> selectByExample(SampleExample example);

    Sample selectByPrimaryKey(Long sampletbId);

    int updateByExampleSelective(@Param("record") Sample record, @Param("example") SampleExample example);

    int updateByExample(@Param("record") Sample record, @Param("example") SampleExample example);

    int updateByPrimaryKeySelective(Sample record);

    int updateByPrimaryKey(Sample record);
}