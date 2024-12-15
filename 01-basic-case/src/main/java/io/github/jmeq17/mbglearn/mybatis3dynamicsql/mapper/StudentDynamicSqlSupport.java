package io.github.jmeq17.mbglearn.mybatis3dynamicsql.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class StudentDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Student student = new Student();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = student.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = student.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> age = student.age;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> gender = student.gender;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> class_ = student.class_;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> enrollmentDate = student.enrollmentDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Student extends AliasableSqlTable<Student> {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> age = column("age", JDBCType.INTEGER);

        public final SqlColumn<String> gender = column("gender", JDBCType.CHAR);

        public final SqlColumn<String> class_ = column("class", JDBCType.VARCHAR);

        public final SqlColumn<Date> enrollmentDate = column("enrollment_date", JDBCType.DATE);

        public Student() {
            super("student", Student::new);
        }
    }
}