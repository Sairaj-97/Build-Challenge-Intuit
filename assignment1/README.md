# Assignment 1 — Producer–Consumer Pattern (Java)

This project implements the classic Producer–Consumer pattern using Java threads and a shared blocking queue. The producer retrieves items from a source container and places them into a shared buffer, while the consumer reads these items from the buffer and stores them into a destination container.

## Features

- Multi-threaded Producer and Consumer implementation
- Thread synchronization using BlockingQueue
- Shared buffer with fixed capacity
- Custom Source and Destination containers
- Maven project structure
- JUnit 5 unit tests for all major components

## Project Structure

```
src/main/java/com/assignment/
├── Main.java
├── Producer.java
├── Consumer.java
├── SharedBuffer.java
├── SourceContainer.java
└── DestinationContainer.java

src/test/java/com/assignment/
├── SourceContainerTest.java
├── DestinationContainerTest.java
└── SharedBufferTest.java
```

## Requirements Covered

- Producer–Consumer pattern implementation
- Thread synchronization using BlockingQueue
- Concurrent programming with multiple threads
- Proper shared resource handling
- Unit tests covering all main components

## How to Run the Program

1. Compile the project:
   ```bash
   mvn clean package
   ```

2. Run the application:
   ```bash
   mvn exec:java
   ```

## How to Run Unit Tests

Execute all tests using:
```bash
mvn test
```

## Sample Output

```
Producer produced: 1
Consumer consumed: 1
Stored in destination: 1
Producer produced: 2
Consumer consumed: 2
Stored in destination: 2
...
Final destination items: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
```

## Technologies Used

- Java 17
- Maven
- JUnit 5
- ArrayBlockingQueue
- Java Threads

## Conclusion

- Demonstrates a correct and synchronized producer–consumer workflow.
- Producer reads values from the SourceContainer and places them into the shared buffer.
- Consumer retrieves and stores processed values into the DestinationContainer.
- Thread safety is ensured using a BlockingQueue, which internally manages waiting, blocking, and notifications.
