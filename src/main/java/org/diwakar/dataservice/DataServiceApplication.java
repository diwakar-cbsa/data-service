package org.diwakar.dataservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@EnableConfigurationProperties
@SpringBootApplication
public class DataServiceApplication {

  private static final Logger logger = LoggerFactory.getLogger(DataServiceApplication.class);

  public static void main(String[] args) {
    ConfigurableApplicationContext applicationContext = SpringApplication.run(
        DataServiceApplication.class, args);
    logger.info("Data Service Application Started");
    applicationContext.registerShutdownHook();
  }
}
