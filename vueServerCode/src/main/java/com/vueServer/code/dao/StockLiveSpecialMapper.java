package com.vueServer.code.dao;

import com.vueServer.code.pojo.StockLiveSpecial;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface StockLiveSpecialMapper {


    List<StockLiveSpecial> selectAll();
}