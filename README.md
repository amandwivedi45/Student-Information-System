1)Project Overview:
The Student Information System is a Java console-based application that allows users to manage student records using CRUD operations with validation and modular architecture.

2)Setup Instructions
Step 1: Install JDK
Step 2: Clone repository
Step 3: Open terminal in src folder
Step 4: Compile using javac *.java
Step 5: Run using java StudentInformationSystem

3)Code Structure

Student.java → Model
ValidationUtils.java → Validation logic
StudentManager.java → Business logic
StudentInformationSystem.java → UI

4)Visual Documentation
Menu screen
Add student
View students
Search student
Delete student

5)Technical Details Section
Data Structure Used:
ArrayList for dynamic storage.

Algorithm Used:
Linear search for student lookup.
Iterator for safe deletion.
Validation using utility methods.

Architecture:
Modular multi-file design.
Separation of concerns.

6)Testing Evidence
| Test Case      | Input       | Expected Result | Status |
| -------------- | ----------- | --------------- | ------ |
| Add student    | Age = -5    | Rejected        | Passed |
| Add student    | Grade = 120 | Rejected        | Passed |
| Search student | S999        | Not Found       | Passed |
| Delete student | S001        | Deleted         | Passed |
