/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.acrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/customer")
public class CustomerController {

    @GetMapping
    public String getCustomerView(){
        return "acrm/customer.html";
    }

    @GetMapping("/create")
    public String getCustomerCreateView(){
        return "../acrm/customerCreate.html";
    }

    @GetMapping("/edit")
    public String getCustomerEditView(){
        return "../acrm/customerEdit.html";
    }

    @GetMapping("/review")
    public String getOrderReviewView(){
        return "../acrm/orderReview.html";}

    @GetMapping("/orders")
    public String getPastOrdersView(){
        return "../acrm/pastOrders.html";}


}
