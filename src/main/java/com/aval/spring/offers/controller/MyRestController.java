package com.aval.spring.offers.controller;

import com.aval.spring.offers.entity.Offers;
import com.aval.spring.offers.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private OfferService offersService;

    @GetMapping("/offers") //getmapping because of get-request
    public List <Offers> showAllOffers() {

        List<Offers> allOffers = offersService.getAllOffers();
        return allOffers;
    }

    @GetMapping("/offers/{id}") //getmapping because of get-request
    public Offers getOffer(@PathVariable int id) {
        Offers offers = offersService.getOfferById(id);
        return offers;
    }

}