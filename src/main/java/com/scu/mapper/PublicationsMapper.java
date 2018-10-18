package com.scu.mapper;

import com.scu.pojo.Publications;
import com.scu.pojo.PublicationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicationsMapper {
    long countByExample(PublicationsExample example);

    int deleteByExample(PublicationsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Publications record);

    int insertSelective(Publications record);

    List<Publications> selectByExampleWithBLOBs(PublicationsExample example);

    List<Publications> selectByExample(PublicationsExample example);

    Publications selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Publications record, @Param("example") PublicationsExample example);

    int updateByExampleWithBLOBs(@Param("record") Publications record, @Param("example") PublicationsExample example);

    int updateByExample(@Param("record") Publications record, @Param("example") PublicationsExample example);

    int updateByPrimaryKeySelective(Publications record);

    int updateByPrimaryKeyWithBLOBs(Publications record);

    int updateByPrimaryKey(Publications record);
}