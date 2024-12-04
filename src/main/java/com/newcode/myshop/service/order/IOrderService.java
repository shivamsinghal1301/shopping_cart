package com.newcode.myshop.service.order;

import com.newcode.myshop.dto.OrderDto;
import com.newcode.myshop.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
