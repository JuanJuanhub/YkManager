package com.issCollege.dao;

import com.issCollege.po.Reportstate;
import com.issCollege.po.ReportstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportstateDAO {
    long countByExample(ReportstateExample example);

    int deleteByExample(ReportstateExample example);

    int deleteByPrimaryKey(Integer reportstateId);

    int insert(Reportstate record);

    int insertSelective(Reportstate record);

    List<Reportstate> selectByExample(ReportstateExample example);

    Reportstate selectByPrimaryKey(Integer reportstateId);

    int updateByExampleSelective(@Param("record") Reportstate record, @Param("example") ReportstateExample example);

    int updateByExample(@Param("record") Reportstate record, @Param("example") ReportstateExample example);

    int updateByPrimaryKeySelective(Reportstate record);

    int updateByPrimaryKey(Reportstate record);
}