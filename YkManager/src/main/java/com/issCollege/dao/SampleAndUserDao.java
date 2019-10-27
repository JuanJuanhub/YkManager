package com.issCollege.dao;

import com.issCollege.po.SampleAndUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SampleAndUserDao {
    @Select("SELECT \n" +
            "testitem.item_name,\n" +
            "sample.sample_num,\n" +
            "sample.sampleTest_id,\n" +
            "sample.sample_state,\n" +
            "user.user_name \n" +
            "FROM sample,user,testitem \n" +
            "WHERE sample.sampletb_id=`user`.user_id\n" +
            "AND testitem.item_id=sample.item_name  \n" +
            "AND sampletb_id=1;")
    List<SampleAndUser> getSampAndUser(Long sampletb_id);
}
