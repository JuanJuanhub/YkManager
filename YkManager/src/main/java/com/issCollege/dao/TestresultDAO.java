package com.issCollege.dao;

import com.issCollege.po.Testresult;
import com.issCollege.po.TestresultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestresultDAO {
    long countByExample(TestresultExample example);

    int deleteByExample(TestresultExample example);

    int deleteByPrimaryKey(Long testresultId);

    int insert(Testresult record);

    int insertSelective(Testresult record);

    List<Testresult> selectByExample(TestresultExample example);

    Testresult selectByPrimaryKey(Long testresultId);

    int updateByExampleSelective(@Param("record") Testresult record, @Param("example") TestresultExample example);

    int updateByExample(@Param("record") Testresult record, @Param("example") TestresultExample example);

    int updateByPrimaryKeySelective(Testresult record);

    int updateByPrimaryKey(Testresult record);
}