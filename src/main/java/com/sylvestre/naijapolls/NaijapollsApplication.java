package com.sylvestre.naijapolls;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.util.TimeZone;

@SpringBootApplication
@EntityScan(basePackageClasses = {
		NaijapollsApplication.class,
		Jsr310JpaConverters.class
})
public class NaijapollsApplication {

	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	public static void main(String[] args) {
		SpringApplication.run(NaijapollsApplication.class, args);
	}

}
