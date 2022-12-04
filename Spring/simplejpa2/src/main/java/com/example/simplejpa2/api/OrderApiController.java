package com.example.simplejpa2.api;


import com.example.simplejpa2.domain.Order;
import com.example.simplejpa2.dto.OrderDtos;
import com.example.simplejpa2.dto.ResultDtos;
import com.example.simplejpa2.service.MemberService;
import com.example.simplejpa2.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OrderApiController {
    private final OrderService orderService;
    private final MemberService memberService;

    @PostMapping(value="/api/order" , produces = "application/json;charset=UTF-8")
    public ResultDtos.ResultResponseMessage order(@RequestBody OrderDtos.OrderPostRequest request)
    {
        if(memberService.findOne(request.getMemberId()) != null){
            orderService.order(request.getMemberId(),request.getO_name(),request.getCount());
            return new ResultDtos.ResultResponseMessage("post Complete", 200);
        }
        else {
            return new ResultDtos.ResultResponseMessage("Wrong member id", 400);
        }
    }

    @GetMapping(value="/api/orders" , produces = "application/json;charset=UTF-8")
    public ResultDtos.ResultResponseData orderList(@RequestBody OrderDtos.OrderGetRequest request)
    {
        List<Order> orders = orderService.findOrderByName(request.getM_name());
        return  new ResultDtos.ResultResponseData("this is results", 200 ,orders);
    }

    @PostMapping("/orders/cancel")
    public ResultDtos.ResultResponseMessage cancelOrder(@RequestParam("orderId") Long orderId)
    {
        orderService.cancelOrder(orderId);
        return  new ResultDtos.ResultResponseMessage(" Cancel Order" , 200 );
    }


}
