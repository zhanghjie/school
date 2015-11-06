package main.java.com.school.service.dao.prefession;

/**
 * Created by Administrator on 2015/11/6.
 */
public class prefess {
    private int id;
    private String pc_name;
    private String pc_coll;

    public prefess() {
    }

    public prefess(int id, String pc_name, String pc_coll) {
        this.id = id;
        this.pc_name = pc_name;
        this.pc_coll = pc_coll;
    }

    public String getPc_name() {
        return pc_name;
    }

    public void setPc_name(String pc_name) {
        this.pc_name = pc_name;
    }

    public String getPc_coll() {
        return pc_coll;
    }

    public void setPc_coll(String pc_coll) {
        this.pc_coll = pc_coll;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
