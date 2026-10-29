package com.ece.devops;

public class NoiseDetection {

    public static boolean isNoise(int signalValue, int threshold) {
        return signalValue > threshold;
    }

    public static void main(String[] args) {

        int[] signal = {10, 12, 11, 50, 13, 12, 60, 11};
        int threshold = 30;

        System.out.println("Digital Signal Noise Detection System");
        System.out.println("-------------------------------------");

        for (int i = 0; i < signal.length; i++) {

            if (isNoise(signal[i], threshold)) {
                System.out.println("Noise detected at position "
                        + i + ": " + signal[i]);
            } else {
                System.out.println("Normal signal at position "
                        + i + ": " + signal[i]);
            }
        }
    }
}
