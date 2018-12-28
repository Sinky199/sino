package org.test.po;

public class UserInfo {

    private Long id;
    private String name;
    private Integer gender;
    private String username;
    private String pwd;



    public UserInfo(long id, String name, int gender, String username, String pwd) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.username = username;
        this.pwd = pwd;
    }

    public UserInfo() {

    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
