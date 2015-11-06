package main.java.com.school.service.dao.User;

import main.java.com.school.service.dao.BaseDo;

/**
 * Created by Administrator on 2015/11/5.
 */
public class stu_score extends BaseDo {
    private int id;
    private String stu_num;
    private String s_course;
    private int score;

    public stu_score() {
    }

    public stu_score(int id, int score, String s_course, String stu_num) {
        this.id = id;
        this.score = score;
        this.s_course = s_course;
        this.stu_num = stu_num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStu_num() {
        return stu_num;
    }

    public void setStu_num(String stu_num) {
        this.stu_num = stu_num;
    }

    public String getS_course() {
        return s_course;
    }

    public void setS_course(String s_course) {
        this.s_course = s_course;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
