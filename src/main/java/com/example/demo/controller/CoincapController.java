package com.example.demo.controller;
import com.example.demo.service.CoinCapService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/coincap")
public class CoincapController {
    @Autowired
    private CoinCapService coinCapService;
    public CoincapController(CoinCapService coinCapService){
        this.coinCapService = coinCapService;
    }
    @GetMapping
    public String getBitcoinPrice(){
        log.trace("Start of getBitcoinPrice()");
        log.trace("End of getBitcoiinPrice()");
        return coinCapService.getBitcoinPrice();
    }
}
