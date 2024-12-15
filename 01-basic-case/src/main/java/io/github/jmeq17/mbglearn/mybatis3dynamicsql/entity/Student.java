package io.github.jmeq17.mbglearn.mybatis3dynamicsql.entity;

import jakarta.annotation.Generated;
import java.util.Date;

public class Student {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer age;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String gender;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String class_;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date enrollmentDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getAge() {
        return age;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAge(Integer age) {
        this.age = age;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getGender() {
        return gender;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getClass_() {
        return class_;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setClass_(String class_) {
        this.class_ = class_ == null ? null : class_.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}