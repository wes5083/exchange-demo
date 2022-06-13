package com.assignment.demo.exchange.task;


import com.assignment.demo.exchange.service.ExchangeRateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;



@Component
@Slf4j
public class ExchangeRateTask {

    @Autowired
    private ExchangeRateService exchangeRateService;

    /**
     * Timing task synchronization latest rates and also update cache data
     * sixty seconds after the serve started, it will call schedule task.
     */
    @Scheduled(initialDelay = 60000, fixedDelayString = "${exchange.rates.data.api.frequency}")
    public void SyncExchangeRate() {
        try {
            String[] symbols = new String[]{"EUR","SEK","USD"};
            exchangeRateService.SynLatestRate(symbols);
        } catch (Exception e) {
            log.error("Sync Date Task Exception", e);
        }
    }


}

