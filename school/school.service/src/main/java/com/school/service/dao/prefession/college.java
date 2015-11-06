package main.java.com.school.service.dao.prefession;

import main.java.com.school.service.dao.BaseDo;

/**
 * Created by Administrator on 2015/11/5.
 */
public class college extends BaseDo{
    private int id;
    private String coll_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColl_name() {
        return coll_name;
    }

    public void setColl_name(String coll_name) {
        this.coll_name = coll_name;
    }
}
