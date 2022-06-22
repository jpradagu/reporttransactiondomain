package com.nttdata.bootcamp.reporttransactiondomain.model;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class AverageBalance {
  private String customerType;
  private String customerId;
  private String productName;
  private BigDecimal average;
}
