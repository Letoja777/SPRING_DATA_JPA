package com.aval.spring.offers.dao;

import com.aval.spring.offers.entity.Offers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffersRepository extends JpaRepository <Offers, Integer> {

}
