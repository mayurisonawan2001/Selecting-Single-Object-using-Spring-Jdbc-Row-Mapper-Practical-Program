package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springjdbc.dao.StudentDao;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        // Fetch one student by ID
        Student student = studentDao.getStudentById(101);
        System.out.println("Student Fetched: " + student);
    }
}
