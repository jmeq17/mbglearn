package io.github.jmeq17.mbglearn.mybatis3simple.mapper;

import io.github.jmeq17.mbglearn.mybatis3simple.entity.Student;
import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student row);

    Student selectByPrimaryKey(Integer id);

    List<Student> selectAll();

    int updateByPrimaryKey(Student row);
}