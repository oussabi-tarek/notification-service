package com.microservices.notificationservice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class OrderPlacedEvent {
  private String orderNumber;
}
