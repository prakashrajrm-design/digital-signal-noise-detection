package com.ece.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NoiseDetectionTest {

@Test
void testNoiseDetected() {
    assertTrue(NoiseDetection.isNoise(50, 30));
}

@Test
void testNormalSignal() {
    assertFalse(NoiseDetection.isNoise(10, 30));
}

@Test
void testSignalAtThreshold() {
    assertFalse(NoiseDetection.isNoise(30, 30));
}

}
