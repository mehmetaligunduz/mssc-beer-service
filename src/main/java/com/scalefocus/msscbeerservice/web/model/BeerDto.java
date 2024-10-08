package com.scalefocus.msscbeerservice.web.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;

    private Integer version;

    private OffsetDateTime createdDate;

    private OffsetDateTime lastModifiedDate;

    private String name;

    private BeerStyleEnum style;

    private Long upc;

    private BigDecimal price;

    private Integer quantityOnHand;

}
