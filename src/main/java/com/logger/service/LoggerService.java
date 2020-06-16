package com.logger.service;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import com.logger.BoundaryLogger;

import java.util.concurrent.TimeUnit;

@Service
public class LoggerService {

	@BoundaryLogger
	@SneakyThrows
	public String test() {
		TimeUnit.SECONDS.sleep(5);
		return "Hi DJ";
	}

}
