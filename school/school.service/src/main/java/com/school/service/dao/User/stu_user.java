package main.java.com.school.service.dao.User;

import main.java.com.school.service.dao.BaseDo;

/**
 * Created by Administrator on 2015/11/5.
 */
public class stu_user extends BaseDo {
    private int id;
    private String user_name;
    private String password;
    private String coll_name;
    private String pc_name;
    private String class_name;
    private String nick_name;
    private char sex;
    private int age;
    private String idcared;
    private String adress;
    private long tellphone;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPc_name() {
        return pc_name;
    }

    public void setPc_name(String pc_name) {
        this.pc_name = pc_name;
    }

    public String getColl_name() {
        return coll_name;
    }

    public void setColl_name(String coll_name) {
        this.coll_name = coll_name;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdcared() {
        return idcared;
    }

    public void setIdcared(String idcared) {
        this.idcared = idcared;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getTellphone() {
        return tellphone;
    }

    public void setTellphone(long tellphone) {
        this.tellphone = tellphone;
    }
}
