package com.vueServer.code.service.impl;

import com.vueServer.code.dao.StockLiveSpecialMapper;
import com.vueServer.code.dto.SpecialDTO;
import com.vueServer.code.pojo.StockLiveSpecial;
import com.vueServer.code.service.SpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By majg on 2020-07-27
 */
@Service
public class SpecialServiceImpl implements SpecialService {

    @Autowired
    private StockLiveSpecialMapper stockLiveSpecialMapper;

    @Override
    public List<StockLiveSpecial> querySpecial() {

        List<StockLiveSpecial> liveSpecials = stockLiveSpecialMapper.selectAll();
        return liveSpecials;
    }
}
