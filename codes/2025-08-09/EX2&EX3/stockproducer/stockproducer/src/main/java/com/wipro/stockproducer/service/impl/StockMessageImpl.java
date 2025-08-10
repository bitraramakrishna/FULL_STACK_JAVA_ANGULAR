package com.wipro.stockproducer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.stockproducer.dto.Stock;
import com.wipro.stockproducer.service.StockService;

@Service
public class StockMessageImpl implements StockService{
	@Autowired
	KafkaTemplate<String,Stock> kafkTemplate;

	@Override
	public void sendStockData(Stock stock) {
		kafkTemplate.send("check-message",stock);
		
	}
}
