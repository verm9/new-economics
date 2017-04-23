package com.verm9.ne.controller;

import com.verm9.ne.repository.model.BtcTimepoint;
import com.verm9.ne.service.BtcServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 * Created by verm on 3/5/2017
 */
@RestController
@RequestMapping("/btc")
public class BtcControllerImpl implements CoinController {

    private Logger LOG = LoggerFactory.getLogger(BtcControllerImpl.class);

    @Autowired
    private BtcServiceImpl service;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<BtcTimepoint> getAllTimepoints() {
        return (Collection<BtcTimepoint>)service.getAllTimepoints();
    }

    @RequestMapping(path="/save", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveCurrentData(HttpServletResponse response) throws IOException {
        service.saveCurrentData();
        response.sendRedirect("/");
    }
    
}