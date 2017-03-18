package com.verm9.ne.controller;

import com.verm9.ne.repository.model.Coin.Timepoint;
import com.verm9.ne.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 * Created by verm on 3/5/2017.
 */
@RestController
@RequestMapping("/eth")
public class EthControllerImpl implements CoinController {
    @Autowired
    private CoinService service;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Timepoint> getAllTimepoints() {
        System.out.println();
        return service.getAllTimepoints();
    }

    @RequestMapping(path="/save", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveCurrentData(HttpServletResponse response) throws IOException {
        service.saveCurrentData();
        response.sendRedirect("/eth");
    }

}
