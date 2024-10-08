package com.scalefocus.msscbeerservice.web.controller;

import com.scalefocus.msscbeerservice.web.model.BeerDto;
import com.scalefocus.msscbeerservice.web.service.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/beers")
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable String beerId) {

        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Void> saveNewBeer(@RequestBody BeerDto beerDto) {

        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Void> updateBeerById(@PathVariable UUID beerId, @RequestBody BeerDto beerDto) {

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @DeleteMapping("/{beerId}")
    public ResponseEntity<Void> deleteBeerById(@PathVariable UUID beerId) {

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
