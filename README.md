✅ Use Case
We want to fetch one student by their ID using Spring JDBC with a RowMapper.

🧱 Assumptions
Table:
sql
Copy code
CREATE TABLE Student (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    city VARCHAR(100)
);
🔨 Required Files
We’ll create/use these files:

File	Role
Student.java	Model class
StudentDao.java	Interface (optional but clean)
StudentDaoImpl.java	Actual implementation
StudentRowMapper.java	Maps result to Student
App.java	To run and test
config.xml	Spring config

✅ Step-by-Step
✅ Student.java
✅ StudentDao.java (interface, optional)
✅ StudentDaoImpl.java
✅ StudentRowMapper.java
✅ config.xml
✅ App.java (Runner class)


✅ Output Example
bash
Copy code
Student Fetched: Student [id=101, name=Amit, city=Mumbai]
🧠 Summary
RowMapper is used to convert ResultSet rows into Java objects.
We used queryForObject() for fetching single object.
All JDBC boilerplate is handled by Spring.

![image](https://github.com/user-attachments/assets/fb9a2416-5ccd-4f7a-993c-05248a4453a4)
ResultSet = raw SQL data

RowMapper = bridge to convert that row

Implementation of RowMapper = your logic for mapping

Class Object = final output (like a Student Java object)
