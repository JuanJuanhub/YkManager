package com.issCollege.dao;

import com.issCollege.po.Sampleappoint;
import com.issCollege.po.SampleappointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleappointDAO {
    long countByExample(SampleappointExample example);

    int deleteByExample(SampleappointExample example);

    int deleteByPrimaryKey(Long sampleappointId);

    int insert(Sampleappoint record);

    int insertSelective(Sampleappoint record);

    List<Sampleappoint> selectByExample(SampleappointExample example);

    Sampleappoint selectByPrimaryKey(Long sampleappointId);

    int updateByExampleSelective(@Param("record") Sampleappoint record, @Param("example") SampleappointExample example);

    int updateByExample(@Param("record") Sampleappoint record, @Param("example") SampleappointExample example);

    int updateByPrimaryKeySelective(Sampleappoint record);

    int updateByPrimaryKey(Sampleappoint record);
}