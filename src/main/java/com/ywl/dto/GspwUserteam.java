package com.ywl.dto;

public class GspwUserteam {
    private Integer tid;

    private String userdeptno;

    private String userteam;

    private String userdeptname;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getUserdeptno() {
        return userdeptno;
    }

    public void setUserdeptno(String userdeptno) {
        this.userdeptno = userdeptno == null ? null : userdeptno.trim();
    }

    public String getUserteam() {
        return userteam;
    }

    public void setUserteam(String userteam) {
        this.userteam = userteam == null ? null : userteam.trim();
    }

    public String getUserdeptname() {
        return userdeptname;
    }

    public void setUserdeptname(String userdeptname) {
        this.userdeptname = userdeptname == null ? null : userdeptname.trim();
    }
}