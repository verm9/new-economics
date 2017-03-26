package com.verm9.ne.controller;

import com.verm9.ne.repository.model.EthTimepoint;
import com.verm9.ne.service.EthServiceImpl;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by verm on 3/18/2017
 */
@Controller
public class MainControllerImpl implements MainController {

    private Logger LOG = org.slf4j.LoggerFactory.getLogger(MainControllerImpl.class);

    @Autowired
    private EthServiceImpl service;

    @Override
    @RequestMapping("/")
    public String getMainPage(Model model) {

        EthTimepoint lastTimepoint = service.getLastTimepoint();
        model.addAttribute("netHashRate", lastTimepoint.getTotalHashRate());
        model.addAttribute("cryptoCurrencyToBtc", lastTimepoint.getPrice());
        return "main";
    }


}
