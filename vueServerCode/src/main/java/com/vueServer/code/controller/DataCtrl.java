package com.vueServer.code.controller;

import com.vueServer.code.dto.SpecialDTO;
import com.vueServer.code.pojo.StockLiveSpecial;
import com.vueServer.code.service.SpecialService;
import net.sf.jsqlparser.statement.create.table.CreateTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created By majg on 2020-07-27
 */
@RestController
public class DataCtrl {
    @Autowired
    private SpecialService specialService;

    /**
     * 查询全部专题列表
     * @return
     */
    @GetMapping("/querySpecial")
    public Object querySpecial(){

        List<StockLiveSpecial> liveSpecials = specialService.querySpecial();

        return liveSpecials;
    }

}
