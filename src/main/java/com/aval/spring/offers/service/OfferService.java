package com.aval.spring.offers.service;

import com.aval.spring.offers.dao.OffersRepository;
import com.aval.spring.offers.entity.Offers;

import java.util.List;

public interface OfferService {
    public List<Offers> getAllOffers();
    public Offers getOfferById(int id);
    public List <Offers> getOfferByName(String name);
}
