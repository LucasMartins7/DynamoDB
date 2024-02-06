package br.com.one.amazon;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableScan
public class AmazonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonApplication.class, args);
	}

}
