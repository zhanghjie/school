package main.java.com.school.service.dao.prefession;

/**
 * Created by Administrator on 2015/11/6.
 */
public class cls {
    private int id;
    private String cls_name;
    private String cls_pc;
    private String cls_num;
    private String cls_coll;

    public cls() {
    }

    public cls(int id, String cls_name, String cls_num, String cls_pc, String cls_coll) {
        this.id = id;
        this.cls_name = cls_name;
        this.cls_num = cls_num;
        this.cls_pc = cls_pc;
        this.cls_coll = cls_coll;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCls_name() {
        return cls_name;
    }

    public void setCls_name(String cls_name) {
        this.cls_name = cls_name;
    }

    public String getCls_pc() {
        return cls_pc;
    }

    public void setCls_pc(String cls_pc) {
        this.cls_pc = cls_pc;
    }

    public String getCls_num() {
        return cls_num;
    }

    public void setCls_num(String cls_num) {
        this.cls_num = cls_num;
    }

    public String getCls_coll() {
        return cls_coll;
    }

    public void setCls_coll(String cls_coll) {
        this.cls_coll = cls_coll;
    }
}
