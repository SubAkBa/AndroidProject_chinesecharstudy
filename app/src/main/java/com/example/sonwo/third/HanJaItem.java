package com.example.sonwo.third;

/**
 * Created by sonwo on 2018-04-01.
 */

public class HanJaItem {
    String hanja, hoon, busu, umm, mean, part;

    public HanJaItem(String busu){
        this.busu = busu;
    }

    public HanJaItem(String hanja, String hoon, String umm, String busu, String mean){
        this.hanja = hanja;
        this.hoon = hoon;
        this.umm = umm;
        this.busu = busu;
        this.mean = mean;
        this.part = "";
    }

    public HanJaItem(String hanja, String hoon, String umm, String busu, String mean, String part){
        this.hanja = hanja;
        this.hoon = hoon;
        this.umm = umm;
        this.busu = busu;
        this.mean = mean;
        this.part = part;
    }

    public String getHanja(){ return hanja; }
    public String getHoon(){ return hoon; }
    public String getUmm(){ return umm; }
    public String getBusu(){ return busu; }
    public String getMean(){ return mean; }
    public String getPart(){ return part; }
}
