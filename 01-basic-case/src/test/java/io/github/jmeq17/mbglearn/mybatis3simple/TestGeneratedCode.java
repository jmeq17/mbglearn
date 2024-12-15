package io.github.jmeq17.mbglearn.mybatis3simple;

import io.github.jmeq17.mbglearn.mybatis3simple.entity.Student;
import io.github.jmeq17.mbglearn.mybatis3simple.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.logging.Logger;

public class TestGeneratedCode {
    private static SqlSessionFactory sqlSessionFactory;
    private static final Logger log = Logger.getLogger(TestGeneratedCode.class.getName());

    static {
        try {
            // 加载 MyBatis 配置文件
            InputStream inputStream = Resources.getResourceAsStream("mybatis3simple/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            log.severe(e.toString());
        }
    }

    @Test
    public void testStudengMapper() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            // 获取 Mapper
            StudentMapper studentMapper = session.getMapper(StudentMapper.class);

            // 查询用户
            Student student = studentMapper.selectByPrimaryKey(1);// 假设查询 ID 为 1 的用户
            System.out.println(student.getName());    // 张三

            // 插入新用户
            Student newStudent = new Student();
            newStudent.setName("张天天");
            newStudent.setAge(30);
            newStudent.setClass_("Class C");
            newStudent.setGender("M");
            newStudent.setEnrollmentDate(new Date());
            studentMapper.insert(newStudent);

            // 提交事务
            session.commit();
        }
    }
}
