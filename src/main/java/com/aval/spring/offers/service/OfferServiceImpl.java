package com.aval.spring.offers.service;

import com.aval.spring.offers.dao.OffersRepository;
import com.aval.spring.offers.entity.Offers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfferServiceImpl implements OfferService{

    @Autowired
    private OffersRepository offersRepository;

    @Override
    public List<Offers> getAllOffers() {
        return offersRepository.findAll();
    }

    @Override
    public Offers getOfferById(int id) {
        Offers offers = null;
        Optional<Offers> optional = offersRepository.findById(id);
        if (optional.isPresent()) {
            offers = optional.get();
        }
        return offers;
    }
}
