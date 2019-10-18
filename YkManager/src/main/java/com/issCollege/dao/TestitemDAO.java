package com.issCollege.dao;

import com.issCollege.po.Testitem;
import com.issCollege.po.TestitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestitemDAO {
    long countByExample(TestitemExample example);

    int deleteByExample(TestitemExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(Testitem record);

    int insertSelective(Testitem record);

    List<Testitem> selectByExample(TestitemExample example);

    Testitem selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") Testitem record, @Param("example") TestitemExample example);

    int updateByExample(@Param("record") Testitem record, @Param("example") TestitemExample example);

    int updateByPrimaryKeySelective(Testitem record);

    int updateByPrimaryKey(Testitem record);
}