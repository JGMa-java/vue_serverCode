package com.vueServer.code.service;

import com.vueServer.code.dto.SpecialDTO;
import com.vueServer.code.pojo.StockLiveSpecial;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpecialService {
    List<StockLiveSpecial> querySpecial();
}
