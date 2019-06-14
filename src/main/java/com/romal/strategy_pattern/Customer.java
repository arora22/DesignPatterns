package com.romal.strategy_pattern;

import java.util.ArrayList;

public class Customer {
   private final ArrayList<Integer> drinks = new ArrayList<>();
   private BillingStrategy strategy;

   public Customer(BillingStrategy strategy) {
      this.strategy = strategy;
   }

   public void add(int price, int quantity) {
      this.drinks.add(this.strategy.getActPrice(price * quantity));
   }

   // Payment of bill
   public void printBill() {
      int sum = this.drinks.stream().mapToInt(v -> v).sum();
      System.out.println("Total due: " + sum / 100.0);
      this.drinks.clear();
   }

   // Set Strategy
   public void setStrategy(BillingStrategy strategy) {
      this.strategy = strategy;
   }

}
