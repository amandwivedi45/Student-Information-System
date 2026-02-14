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

Add student
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/0b6d0db9-f9db-46b5-84fd-95637412338a" />

View students
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/a3f08411-ed34-45db-b41e-ad5bb3f510df" />

Search student
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/7c3321fe-b3e6-47ec-99ea-d95f4c9831c6" />

Delete student
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/150f8b33-957e-4b16-9c92-558bc70714ed" />



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
