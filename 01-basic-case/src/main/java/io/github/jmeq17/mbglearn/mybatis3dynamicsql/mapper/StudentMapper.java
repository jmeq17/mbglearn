package io.github.jmeq17.mbglearn.mybatis3dynamicsql.mapper;

import static io.github.jmeq17.mbglearn.mybatis3dynamicsql.mapper.StudentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import io.github.jmeq17.mbglearn.mybatis3dynamicsql.entity.Student;
import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface StudentMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Student>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, age, gender, class_, enrollmentDate);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="StudentResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="gender", property="gender", jdbcType=JdbcType.CHAR),
        @Result(column="class", property="class_", jdbcType=JdbcType.VARCHAR),
        @Result(column="enrollment_date", property="enrollmentDate", jdbcType=JdbcType.DATE)
    })
    List<Student> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("StudentResult")
    Optional<Student> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, student, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, student, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Student row) {
        return MyBatis3Utils.insert(this::insert, row, student, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(age).toProperty("age")
            .map(gender).toProperty("gender")
            .map(class_).toProperty("class_")
            .map(enrollmentDate).toProperty("enrollmentDate")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Student> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, student, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(age).toProperty("age")
            .map(gender).toProperty("gender")
            .map(class_).toProperty("class_")
            .map(enrollmentDate).toProperty("enrollmentDate")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Student row) {
        return MyBatis3Utils.insert(this::insert, row, student, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(age).toPropertyWhenPresent("age", row::getAge)
            .map(gender).toPropertyWhenPresent("gender", row::getGender)
            .map(class_).toPropertyWhenPresent("class_", row::getClass_)
            .map(enrollmentDate).toPropertyWhenPresent("enrollmentDate", row::getEnrollmentDate)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Student> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, student, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Student> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, student, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Student> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, student, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Student> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, student, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Student row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(name).equalTo(row::getName)
                .set(age).equalTo(row::getAge)
                .set(gender).equalTo(row::getGender)
                .set(class_).equalTo(row::getClass_)
                .set(enrollmentDate).equalTo(row::getEnrollmentDate);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Student row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(name).equalToWhenPresent(row::getName)
                .set(age).equalToWhenPresent(row::getAge)
                .set(gender).equalToWhenPresent(row::getGender)
                .set(class_).equalToWhenPresent(row::getClass_)
                .set(enrollmentDate).equalToWhenPresent(row::getEnrollmentDate);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Student row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .set(age).equalTo(row::getAge)
            .set(gender).equalTo(row::getGender)
            .set(class_).equalTo(row::getClass_)
            .set(enrollmentDate).equalTo(row::getEnrollmentDate)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Student row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .set(age).equalToWhenPresent(row::getAge)
            .set(gender).equalToWhenPresent(row::getGender)
            .set(class_).equalToWhenPresent(row::getClass_)
            .set(enrollmentDate).equalToWhenPresent(row::getEnrollmentDate)
            .where(id, isEqualTo(row::getId))
        );
    }
}