package com.verm9.ne.controller;

import com.verm9.ne.repository.model.BtcTimepoint;
import com.verm9.ne.repository.model.EthTimepoint;
import com.verm9.ne.service.BtcServiceImpl;
import com.verm9.ne.service.EthServiceImpl;
import org.apache.commons.math3.util.Precision;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;


/**
 * Created by verm on 3/18/2017
 */
@Controller
public class MainControllerImpl implements MainController {

    private Logger LOG = LoggerFactory.getLogger(MainControllerImpl.class);

    @Autowired
    private EthServiceImpl ethService;

    @Autowired
    private BtcServiceImpl btcService;

    @Override
    @RequestMapping("/")
    public String getMainPage(Model model) {
        LOG.info("The main page has been accessed");

        EthTimepoint lastEthTimepoint = Optional.ofNullable(ethService.getLastTimepoint()).orElse(new EthTimepoint());
        BtcTimepoint lastBtcTimepoint = Optional.ofNullable(btcService.getLastTimepoint()).orElse(new BtcTimepoint());

        model.addAttribute( "netHashRate", Optional.ofNullable(lastEthTimepoint.getTotalHashRate()).orElse(15087740000000D) );
        model.addAttribute( "cryptoCurrencyToBtc", Precision.round(Optional.ofNullable(lastEthTimepoint.getPrice()).orElse(0.0365),4) );
        model.addAttribute( "btcToUsd", Precision.round(Optional.ofNullable(lastBtcTimepoint.getPrice()).orElse(2500.0),0) );
        return "main";
    }


}
