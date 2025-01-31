# Student Management System

This is a **Student Management System** built in Java, which allows you to perform various operations on student records, such as creating, updating, deleting, displaying, and sorting student information. The system also supports saving and retrieving student data from a JSON file.

## Features:
- **Create Student**: Add a new student with ID, name, age, marks (5 subjects), and email.
- **Update Student**: Modify an existing student's details such as name, age, marks, or email.
- **Delete Student**: Remove a student's record from the system by ID.
- **Display Specific Student**: View details of a student by ID.
- **Display All Students**: View a list of all students with their details.
- **Retrieve from JSON**: Load student data from a JSON file.
- **Sort and Filter**:
    - Sort students by name.
    - Sort students by age.
    - Filter students by grade.

## Technologies Used:
- **Java**: Programming language for building the application.
- **Jackson Library**: Used for working with JSON data.
- **Scanner**: For user input.
- **LinkedHashMap**: Stores student data in memory.

## Prerequisites:
- Java 8 or later installed on your machine.
- Jackson library added to your project for JSON processing.

## Class Breakdown:

### 1. **Student Class**:
Represents a student with attributes such as ID, name, age, marks, grade, and email.

#### Methods:
- **Calculating grade** based on marks (A, B, C, D).
- **Calculating average marks**.
- **Accessors and mutators** (getters and setters) for all attributes.
- **Constructor**: Initializes student data, including marks and grade calculation.
- **`toString()`**: Provides a string representation of the student object.

#### Attributes:
- `id`: The student's unique ID.
- `name`: The student's name.
- `age`: The student's age.
- `marks`: List of marks for 5 subjects.
- `grade`: The student's grade based on their average marks.
- `email`: The student's email address.

#### Methods:
- **`calculateGrade(List<Integer> marks)`**: Calculates the grade based on the average of marks.
- **`getAverage(List<Integer> marks)`**: Calculates the average of the marks.
- **`toString()`**: Returns a string representation of the student.

---

### 2. **ClassAdvisor Class**:
Acts as the controller for managing students.

- Handles the core operations like creating, updating, deleting, displaying, sorting, and filtering student data.
- Manages student data storage in a `LinkedHashMap<Integer, Student>`.
- Saves and retrieves student data from a `student.JSON` file using the Jackson library.

#### Key Methods:
- **`checkEmail(String email)`**: Validates the email format using regex.
- **`createStudent()`**: Prompts the user for input and creates a new student.
- **`updateStudent(int id)`**: Allows updates to an existing student's details.
- **`deleteStudent()`**: Deletes a student based on ID.
- **`displaySpecificStudent(int id)`**: Displays a specific student's information.
- **`display()`**: Displays all students' information.
- **`saveStudents()`**: Saves all students' data to a JSON file.
- **`retriveStudent()`**: Retrieves students' data from the JSON file.
- **`sortByName()`**: Sorts students by name and displays them.
- **`sortByAge()`**: Sorts students by age and displays them.
- **`filterByGrade()`**: Filters students based on a specified grade and displays the result.

---

### 3. **StudentManagement Class**:
Contains the main method to run the student management system.

- Displays the main menu to the user and handles user input for different operations.

#### Main Operations:
- The user can interact with the menu to perform tasks like creating a student, updating their details, or sorting/filtering students.
- The system prompts for inputs and calls the corresponding methods in the `ClassAdvisor` class.

## Methods:

### `checkEmail(String email)`:
Validates the format of the student's email using a regular expression.

### `createStudent()`:
Prompts the user to input a new student's details and stores them in memory.

### `updateStudent(int id)`:
Allows the user to update the details of a student given the student's ID.

### `deleteStudent()`:
Deletes a student's record by ID.

### `displaySpecificStudent(int id)`:
Displays the details of a student with the specified ID.

### `display()`:
Displays the details of all students.

### `saveStudents()`:
Saves the student data to a JSON file (`student.JSON`).

### `retriveStudent()`:
Retrieves the student data from the JSON file.

### `sortByName()`:
Sorts and displays students by their names.

### `sortByAge()`:
Sorts and displays students by their ages.

### `filterByGrade()`:
Filters and displays students by their grade.

---
## Usage:

### Main Menu:
Once you run the program, you’ll be presented with the following options:

- `1`: Create a new student.
- `2`: Update an existing student's information.
- `3`: Delete a student.
- `4`: Display a specific student's details.
- `5`: Display all students.
- `6`: Retrieve student data from a JSON file.
- `7`: Perform other actions like sorting by name, age, or filtering by grade.
- `0`: Exit the program.

### Creating a Student:
When creating a new student, you’ll need to enter the student ID, name, age, marks for 5 subjects, and email. The system will calculate the grade based on the average marks.

### Updating a Student:
You can update the student's name, age, marks, or email by providing the student ID and choosing the update option.

### Deleting a Student:
Deleting a student requires the student’s ID. The student record will be removed from the system.

### Sorting Students:
You can sort the student list by name or age.

### Filtering Students by Grade:
You can filter and display students based on their grade.

### Example of Student Data:
```json
{
  "1": {
    "id": 1,
    "name": "Gogul",
    "age": 21,
    "marks": [80, 85, 78, 92, 88],
    "grade": "B",
    "email": "gogul@gmail.com"
  }
}
