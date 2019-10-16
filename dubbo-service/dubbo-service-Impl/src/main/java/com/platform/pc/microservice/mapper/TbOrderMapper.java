package com.platform.pc.microservice.mapper;

import com.platform.mall.dto.OrderChartData;
import com.platform.mall.pojo.TbOrder;
import com.platform.mall.pojo.TbOrderExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderMapper {
    long countByExample(TbOrderExample example);

    int deleteByExample(TbOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    List<TbOrder> selectByExample(TbOrderExample example);

    TbOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    int updateByExample(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    int updateByPrimaryKeySelective(TbOrder record);

    int updateByPrimaryKey(TbOrder record);

    List<TbOrder> selectByMulti(@Param("search") String search,@Param("orderCol") String orderCol, @Param("orderDir") String orderDir);

    List<OrderChartData> selectOrderChart(@Param("startTime") Date startTime, @Param("endTime") Date endTime);

    List<OrderChartData> selectOrderChartByYear(@Param("year") int year);
}