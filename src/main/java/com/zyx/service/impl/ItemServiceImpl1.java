package com.zyx.service.impl;

import com.zyx.dao.ItemsMapper;
import com.zyx.model.Items;
import com.zyx.service.ItemService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl1 implements ItemService1 {

    @Autowired
    private ItemsMapper itemsMapper;

    public List<Items> getItemList() {
        List<Items> list = itemsMapper.selectAll();

        return list;
    }

}