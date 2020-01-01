package com.qf.j1902.vo;

import lombok.Data;

/**
 * 对view数据的封装
 * Created by jeffrey on 2019/5/24.
 */
@Data
public class Dept {
    private int deptno;//部门id
    private String dname;//部门名称
    private String loc;//地址
    public Dept() {}
    public Dept(int deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }
}
