package com.xym.springbootmybatisfeny.po;

/**
 * @author Xuyimin;
 * @create 2019-03-17-13:35
 */
public class Emp {
    private int eid;
    private String ename;
    private String epwd;

    public Emp(String ename, String epwd) {
        this.ename = ename;
        this.epwd = epwd;
    }

    public Emp(int eid, String ename, String epwd) {
        this.eid = eid;
        this.ename = ename;
        this.epwd = epwd;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", epwd='" + epwd + '\'' +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEpwd() {
        return epwd;
    }

    public void setEpwd(String epwd) {
        this.epwd = epwd;
    }
}
