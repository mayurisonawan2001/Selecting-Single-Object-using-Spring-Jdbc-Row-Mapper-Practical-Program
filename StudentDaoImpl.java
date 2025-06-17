package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springjdbc.Student;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Student getStudentById(int studentId) {
        String query = "SELECT * FROM Student WHERE id = ?";
        RowMapper<Student> rowMapper = new StudentRowMapper();
        return jdbcTemplate.queryForObject(query, rowMapper, studentId);
    }
}
