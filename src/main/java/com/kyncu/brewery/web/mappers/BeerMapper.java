package com.kyncu.brewery.web.mappers;

import com.kyncu.brewery.domain.Beer;
import com.kyncu.brewery.web.model.v2.BeerDtoV2;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDtoV2 beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDtoV2 dto);
}
