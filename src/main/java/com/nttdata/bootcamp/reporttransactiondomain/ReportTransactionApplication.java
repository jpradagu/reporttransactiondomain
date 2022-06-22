package com.nttdata.bootcamp.reporttransactiondomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ReportTransactionApplication.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ReportTransactionApplication {


  public static void main(String[] args) {
    SpringApplication.run(ReportTransactionApplication.class, args);
  }

}
