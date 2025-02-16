# Minesweeper

## Table of Contents
1. [Description](#description)
2. [Features](#features)
3. [How to Run](#how-to-run)
    - [Prerequisites](#prerequisites)
    - [Compilation](#compilation)
    - [Execution](#execution)
4. [Gameplay](#gameplay)
5. [Future Improvements](#future-improvements)

## Description

Minesweeper is a classic puzzle game where players navigate a grid to uncover safe cells while avoiding hidden mines. This Java-based implementation features multiple difficulty levels, a console-rendered board, and an intuitive grid layout using ASCII characters. Designed for smooth gameplay, this version lays the foundation for future enhancements such as mine placement, user interaction, and graphical improvements.

## Features
- Three difficulty levels: Easy, Medium, and Hard
- Dynamically generated game boards with different grid sizes
- Console-based UI with Unicode characters for borders

## How to Run

### Prerequisites
- Java Development Kit (JDK) installed (Java 8 or later)

### Compilation
```sh
javac MineSweeper.java
```
### Execution
```sh
java MineSweeper <mode>
```
- `<mode>`: (Optional) Set the difficulty mode.
  - `0` (Default) - Easy
  - `1` - Medium
  - `2` - Hard

If no mode is specified, the game will default to Easy mode.

## Gameplay

- The game initializes a Minesweeper board based on the chosen difficulty level.

- The board is drawn using ASCII/Unicode characters.

- Further gameplay mechanics (such as opening cells, marking mines, etc.) are to be implemented.

## Future Improvements

- Implement mine placement and detection logic

- Add user input for interacting with the board

- Improve UI with a graphical interface
