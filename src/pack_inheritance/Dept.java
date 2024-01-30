package pack_inheritance;

public class Dept extends Person{
    private int deptno;
    private String dname;

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDeptno() {
        return deptno;
    }

    public String getDname() {
        return dname;
    }
}
