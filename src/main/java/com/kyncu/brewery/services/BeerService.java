package com.kyncu.brewery.services;

import com.kyncu.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
