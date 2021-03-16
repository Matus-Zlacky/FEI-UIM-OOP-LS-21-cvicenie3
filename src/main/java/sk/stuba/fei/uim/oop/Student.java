package sk.stuba.fei.uim.oop;

public class Student {
    private int id;
    private String meno;
    private String priezvisko;
    private int vek;
    //alt+insert
    //constructors

    public Student(){}

    public Student(int id, int vek) {
        this.id = id;
        this.vek = vek;
    }

    public Student(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
    }


    //geters
    public int getId() {
        return id;
    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public int getVek() {
        return vek;
    }

    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }



}
