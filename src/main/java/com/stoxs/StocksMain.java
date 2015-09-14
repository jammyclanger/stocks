package com.stoxs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.stoxs.impl.StoxsImpl;

@SpringBootApplication
@Configuration
public class StocksMain {

	public static void main(String[] args) {
        SpringApplication.run(StocksMain.class, args);
    }
	
	@Bean
	public StoxsImpl createStoxsImpl() {
		return new StoxsImpl();
	}
}
