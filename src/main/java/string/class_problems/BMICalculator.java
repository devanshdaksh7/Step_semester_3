package string.class_problems;

import java.util.Random;

public class BMICalculator {

    public static String getBmiStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void printWellnessReport(double[] heights, double[] weights) {

        System.out.println("Person\tHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < heights.length; i++) {

            double bmi = weights[i] / (heights[i] * heights[i]);

            String status = getBmiStatus(bmi);

            System.out.printf(
                "%d\t%.2f\t%.2f\t%.2f\t%s%n",
                i + 1,
                heights[i],
                weights[i],
                bmi,
                status
            );
        }
    }

    public static void main(String[] args) {

        int numberOfPeople = 10;

        double[] heights = new double[numberOfPeople];
        double[] weights = new double[numberOfPeople];

        Random random = new Random();

        for (int i = 0; i < numberOfPeople; i++) {

            heights[i] = 1.5 + random.nextDouble() * 0.4;
            weights[i] = 50 + random.nextDouble() * 50;
        }

        printWellnessReport(heights, weights);
    }
}