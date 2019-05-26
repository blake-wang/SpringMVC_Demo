package com.wanglei.model;

import java.util.Arrays;
import java.util.Date;

/**
 * @Auther: WangL
 * @Date: 2019/5/18 09:03
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String gender;
    private Date birthday;
    private int age;
    private String[] hobbyIds;

    public User(int id, String username, String gender, Date birthday, int age) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.birthday = birthday;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobbyIds() {
        return hobbyIds;
    }

    public void setHobbyIds(String[] hobbyIds) {
        this.hobbyIds = hobbyIds;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                ", hobbyIds=" + Arrays.toString(hobbyIds) +
                '}';
    }
}
