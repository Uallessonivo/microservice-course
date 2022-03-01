package io.github.uallessonivo.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class HrpayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrpayrollApplication.class, args);
	}

}
