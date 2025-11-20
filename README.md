#  File I/O Notes App

A simple, console-based Java application that allows users to create, save, and read notes using a local text file. This project demonstrates the basics of **Java File Handling** (File I/O).

##  Features
* **Write Notes:** Input text via the console, which is instantly appended to a file (`Mynotes.txt`).
* **Read Notes:** Retrieve and display all saved notes from the file using `Files.readString`.
* **Persistent Storage:** Data is not lost when the program closes; it stays saved in the text file.
* **Menu-Driven:** Simple numbered menu for easy navigation.

##  Tech Stack
* **Language:** Java
* **Concepts Used:**
    * `java.io.FileWriter` (For writing data)
    * `java.nio.file.Files` (For reading data efficiently)
    * `java.util.Scanner` (For user input)
    * Exception Handling (`try-catch`)

##  How to Run
1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/Siddhantkr19/your-repo-name.git](https://github.com/Siddhantkr19/your-repo-name.git)
    ```
2.  **Compile the code:**
    ```bash
    javac IONotesApp.java
    ```
3.  **Run the application:**
    ```bash
    java IONotesApp
    ```
