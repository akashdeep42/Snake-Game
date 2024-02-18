package com.gamecodeschool.c17snake;

import android.content.Context;

public class DifficultyManager {

    private static final int DEFAULT_SNAKE_SPEED = 5;
    private static final int DEFAULT_APPLE_SPAWN_RATE = 2;

    private int snakeSpeed;
    private int appleSpawnRate;

    private int currentDifficultyLevel;

    public DifficultyManager() {
        // Set default values
        snakeSpeed = DEFAULT_SNAKE_SPEED;
        appleSpawnRate = DEFAULT_APPLE_SPAWN_RATE;

        // Initialize the difficulty level
        currentDifficultyLevel = 1;
    }

    public void adjustSnakeSpeed(Snake snake) {
        // Adjust snake speed based on the current difficulty level
        // For simplicity, we'll increase the speed every 5 points
        if (mScore % 5 == 0) {
            currentDifficultyLevel++;
            snake.setSnakeSpeed(DEFAULT_SNAKE_SPEED + currentDifficultyLevel);
        } else {
            snake.setSnakeSpeed(DEFAULT_SNAKE_SPEED);
        }
    }

    public void modifyAppleSpawnRate(Apple apple) {
        // Modify apple spawn rate based on the current difficulty level
        // For simplicity, we'll decrease the spawn rate every 5 points
        if (mScore % 5 == 0) {
            currentDifficultyLevel++;
            apple.setSpawnRate(DEFAULT_APPLE_SPAWN_RATE - currentDifficultyLevel);
        } else {
            apple.setSpawnRate(DEFAULT_APPLE_SPAWN_RATE);
        }
    }
    // IN PROGRESS
    // Other methods for adjusting difficulty-related factors

    public int getSnakeSpeed() {
        return snakeSpeed;
    }

    public int getAppleSpawnRate() {
        return appleSpawnRate;
    }
}