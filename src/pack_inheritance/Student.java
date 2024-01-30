package pack_inheritance;

public class Student extends Dept{
    private int rno,sem;
    private float per;

    public void setRno(int rno) {
        this.rno = rno;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public void setPer(float per) {
        this.per = per;
    }

    public int getRno() {
        return rno;
    }

    public int getSem() {
        return sem;
    }

    public float getPer() {
        return per;
    }
}
