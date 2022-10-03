package com.aval.spring.offers.controller;

import com.aval.spring.offers.dao.OffersRepository;
import com.aval.spring.offers.entity.Offers;
import com.aval.spring.offers.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private OfferService offersService;

    @Autowired
    private OffersRepository offersRepository;

    //Get all offers method
    @GetMapping("/offers")
    public List <Offers> showAllOffers() {

        List<Offers> allOffers = offersService.getAllOffers();
        return allOffers;
    }

    //Get Offers by id method
    @GetMapping("/offers/{id}")
    public Offers getOffer(@PathVariable int id) {
        Offers offers = offersService.getOfferById(id);
        return offers;
    }

    //Get Offers by name method
    @GetMapping("/offers/name/{name}")
    public List<Offers> findByName(@PathVariable String name) {
        return offersService.getOfferByName(name);
    }
}