package com.verm9.ne.cron;

import com.verm9.ne.repository.model.BtcTimepoint;
import com.verm9.ne.service.BtcServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by verm on 4/23/2017
 */
@Component
public class UpdateBtcData {

    private static final Logger LOG = LoggerFactory.getLogger(UpdateBtcData.class);

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private BtcServiceImpl btcService;

    /**
     * updates ETH data (difficulty & price) every 20 mins
     */
    @Scheduled(fixedRate = 1200000)
    public void update() {
        BtcTimepoint t = btcService.saveCurrentData();
        LOG.info("BTC data net-hash:{} & price:{}$ updated at {}", t.getTotalHashRate(), t.getPrice(), DATE_FORMAT.format(new Date()));
    }
}