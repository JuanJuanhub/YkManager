package com.issCollege.dao;

import com.issCollege.po.Qualifycontrol;
import com.issCollege.po.QualifycontrolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface QualifycontrolDAO {
    long countByExample(QualifycontrolExample example);

    int deleteByExample(QualifycontrolExample example);

    int insert(Qualifycontrol record);

    int insertSelective(Qualifycontrol record);

    List<Qualifycontrol> selectByExample(QualifycontrolExample example);

    int updateByExampleSelective(@Param("record") Qualifycontrol record, @Param("example") QualifycontrolExample example);

    int updateByExample(@Param("record") Qualifycontrol record, @Param("example") QualifycontrolExample example);
}