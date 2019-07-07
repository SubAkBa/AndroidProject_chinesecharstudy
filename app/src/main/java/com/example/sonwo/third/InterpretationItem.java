package com.example.sonwo.third;

public class InterpretationItem {
    String hanja, hoonumm, interpre;

    public InterpretationItem(String hanja, String hoonumm, String interpre){
        this.hanja = hanja;
        this.hoonumm = hoonumm;
        this.interpre = interpre;
    }

    public void setHanja(String hanja){ this.hanja = hanja; }
    public void setHoonumm(String hoonumm){ this.hoonumm = hoonumm; }
    public void setInterpre(String interpre){ this.interpre = interpre; }

    public String getHanja(){ return hanja; }
    public String getHoonumm(){ return hoonumm; }
    public String getInterpre(){ return interpre; }
}
