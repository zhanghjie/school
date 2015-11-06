package main.java.com.school.service.dao.prefession;

/**
 * Created by Administrator on 2015/11/6.
 */
public class course {
    private int id;
    private String c_name;

    public course() {
    }

    public course(int id, String c_name) {
        this.id = id;
        this.c_name = c_name;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
