package com.verm9.ne.controller;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by verm on 3/18/2017
 */
@Controller
public class MainControllerImpl implements MainController {

    private Logger LOG = org.slf4j.LoggerFactory.getLogger(MainControllerImpl.class);

    @Override
    @RequestMapping("/")
    public String getMainPage(ModelAndView modelAndView) {
        return "main";
    }


}
