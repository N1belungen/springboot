package com.n1belungen.entity;

public class Department {
    private int id;
    private String departmentname;

    public Department() {
    }

    public Department(int id, String departmentname) {
        this.id = id;
        this.departmentname = departmentname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentname='" + departmentname + '\'' +
                '}';
    }
}
