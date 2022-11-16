package com.example;

import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Studenti {
    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList<Studente> studente= new ArrayList<Studente>();

    public Studenti(){
       
    }
    

    public ArrayList<Studente> getlArrayStud() {
        return studente;
    }

    public void setlArrayStud(ArrayList<Studente> lArrayStud) {
        this.studente = lArrayStud;
    }
    
    public void add(Studente s){
        studente.add(s);
    }
}
