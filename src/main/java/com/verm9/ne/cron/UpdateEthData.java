package com.verm9.ne.cron;

import com.verm9.ne.repository.model.EthTimepoint;
import com.verm9.ne.service.EthServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by verm on 4/6/2017
 */
@Component
public class UpdateEthData {

    private static final Logger LOG = LoggerFactory.getLogger(UpdateEthData.class);

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private EthServiceImpl ethService;

    /**
     * updates ETH data (difficulty & price) every 20 mins
     */
    @Scheduled(fixedRate = 1200000)
    public void update() {
        EthTimepoint t = ethService.saveCurrentData();
        LOG.info("ETH data net-hash:{} & price:{} updated at {}", t.getTotalHashRate(), t.getPrice(), DATE_FORMAT.format(new Date()));
    }
}