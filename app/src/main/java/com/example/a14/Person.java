package com.example.a14;

public class Person {
    String name;
    String mobile;
    String CA;
    String Ranking;


    public Person(String name, String mobile, String CA, String Raking) {
        this.name = name;
        this.mobile = mobile;
        this.CA = CA;
        this.Ranking = Ranking;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getCA() { return CA; }

    public String getRanking() {return Ranking; }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setCA(String CA) {
        this.CA = CA;
    }

    public void setRanking(String Ranking) { this.Ranking = Ranking;
    }



}
