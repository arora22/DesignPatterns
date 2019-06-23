package com.romal.effective_java.builder_pattern;

public class BuilderPatternTester {

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();

   }

}
