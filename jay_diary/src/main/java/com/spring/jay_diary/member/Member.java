package com.spring.jay_diary.member;

public class Member {
    private String id;
    private String name;
    private int age;
    private String birthday;
    private String tel;
    private String email;

    // alt + insert : Getter/Setter 생성자 만들기

    public Member(String id, String name, int age, String birthday, String tel, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.tel = tel;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
