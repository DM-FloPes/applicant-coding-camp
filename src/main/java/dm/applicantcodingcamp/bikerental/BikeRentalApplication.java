package dm.applicantcodingcamp.bikerental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class BikeRentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(BikeRentalApplication.class, args);
    }

}
