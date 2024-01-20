package com.learn.lombok;

import com.learn.lombok.beans.ApiClientConfiguration;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class BuilderMain {

	public static void main(String[] args) {
		ApiClientConfiguration config = ApiClientConfiguration.builder().build();
		System.out.println(config);

		config = ApiClientConfiguration.builder()
				.host("api.server.com")
				.port(443)
				.useHttps(true)
			    .connectTimeout(15_000L).build();
		log.debug(config.toString());
		
	
		

	}

}
