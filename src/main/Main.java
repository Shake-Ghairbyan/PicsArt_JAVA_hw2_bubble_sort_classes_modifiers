package main;

import model.Vehicle;

public class Main {
    public static void main(String[] args) {
        //Bubble sort
        int[] nums = {44, 22, 63, -33, -77, -5,-3};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] >= nums[j + 1]) {
                    int stored_value = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = stored_value;
                }
            }
        }
        System.out.println(nums[0]);

        //classes/objects
        Vehicle v1 = new Vehicle();
        v1.setColor("Blue");
        v1.setYear(2020);
        v1.setName("Ford EcoSport");
        v1.setSpeed(168);
        System.out.println("******+++");
        System.out.println("Name of Vehicle: " + v1.getName());
        System.out.println("Color of Vehicle: " + v1.getColor());
        System.out.println("Year of Production: " + v1.getYear());
        System.out.println("Is all-electric vehicle: " + (v1.isElectric() ? "yes": "no"));

        Vehicle v2 = new Vehicle();
        v2.setColor("Red");
        v2.setYear(2020);
        v2.setName("Tesla Model S 2");
        v2.setSpeed(193);
        v2.setElectric(true);
        System.out.println("******+++");
        System.out.println("Name of Vehicle: " + v2.getName());
        System.out.println("Color of Vehicle: " + v2.getColor());
        System.out.println("Year of Production: " + v2.getYear());
        System.out.println("Is all-electric vehicle: " + (v2.isElectric() ? "yes": "no"));

        Vehicle v3 = new Vehicle();
        v3.setColor("Black");
        v3.setYear(1990);
        v3.setName("Volga");
        v3.setSpeed(193);
        System.out.println("******+++");
        System.out.println("Name of Vehicle: " + v3.getName());
        System.out.println("Color of Vehicle: " + v3.getColor());
        System.out.println("Year of Production: " + v3.getYear());
        System.out.println("Is all-electric vehicle: " + (v3.isElectric () ? "yes": "no"));
    }

    //working with classes/objects



}
