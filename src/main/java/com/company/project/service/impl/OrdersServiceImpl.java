package com.company.project.service.impl;

import com.company.project.dao.OrdersMapper;
import com.company.project.model.Orders;
import com.company.project.service.OrdersService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Mxy's CodeGenerator on 2017/12/29.
 */
@Service
@Transactional
public class OrdersServiceImpl extends AbstractService<Orders> implements OrdersService {
    @Resource
    private OrdersMapper ordersMapper;

}
