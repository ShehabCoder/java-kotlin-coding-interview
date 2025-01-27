
# Rock-Paper-Scissors Game

This is a simple Java implementation of the classic **Rock-Paper-Scissors** game. The program plays 100 rounds of the game between two players and displays the results. The application is built using Java and Maven, with a focus on clean code principles and test-driven development.

---

## Features

- **Player A** always plays "ROCK".
- **Player B** plays randomly ("ROCK", "PAPER", or "SCISSORS").
- Evaluates the result of each round: **WIN**, **LOSE**, or **DRAW**.
- Displays the total number of wins for each player and the number of draws after 100 rounds.

---

## Prerequisites

Before running the project, ensure the following are installed on your system:

1. **Java Development Kit (JDK)**: Version 17 or higher
   - [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
2. **Maven**: Build and dependency management tool
   - [Download Maven](https://maven.apache.org/download.cgi)
3. **Git**: To clone the repository
   - [Download Git](https://git-scm.com/)

---

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com.example.rps/
│   │       ├── Game.java         # Core game logic
│   │       ├── Move.java         # Enum for game moves
│   │       └── Main.java         # Main entry point
├── test/
│   ├── java/
│   │   └── com.example.rps/
│   │       └── GameTest.java     # Test cases for the game logic
pom.xml                           # Maven configuration
```

---

## How to Run the Project

1. **Clone the Repository**
   Clone the forked repository to your local machine:
   ```bash
   git clone https://github.com/<your-username>/java-kotlin-coding-interview.git
   cd java-kotlin-coding-interview
   ```

2. **Build the Project**
   Use Maven to build the project:
   ```bash
   mvn clean install
   ```

3. **Run the Application**
   Run the program with the following command:
   ```bash
   mvn exec:java -Dexec.mainClass=com.example.rps.Main
   ```

4. **Expected Output**
   After running the application, you will see an output similar to this:
   ```
   Player A wins 31 of 100 games
   Player B wins 37 of 100 games
   Draws: 32 of 100 games
   ```

---

## How to Run Tests

1. **Run the Test Suite**
   Execute the test cases using Maven:
   ```bash
   mvn test
   ```

2. **Test Coverage**
   The tests validate the following:
   - **Game result evaluation**: Ensures the logic for determining wins, losses, and draws is correct.
   - **Round-by-round results**: Ensures the statistics (wins, losses, and draws) are calculated accurately.

3. **Test Location**
   The test cases are located in:
   ```
   src/test/java/com/example/rps/GameTest.java
   ```

---

## Example Files

- **Core Game Logic**: `Game.java`
- **Game Moves Enum**: `Move.java`
- **Main Application Entry**: `Main.java`
- **Unit Tests**: `GameTest.java`

---

## Built With

- **Java**: Programming language for the core implementation.
- **Maven**: Dependency management and build tool.
- **JUnit**: Testing framework for unit tests.

---

## Contributing

1. **Fork the Repository**
2. **Create a New Branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. **Make Changes and Commit**
   ```bash
   git commit -m "Add your message here"
   ```
4. **Push to Your Branch**
   ```bash
   git push origin feature/your-feature-name
   ```
5. **Open a Pull Request**

---


