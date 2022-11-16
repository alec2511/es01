package com.example;


public class Studente {
    public int id;
    public String nome;
    public String cognome;
    public String datanascita;
    public int votoesame;


    
    public Studente() {
    }


    public Studente(int id, String nome, String cognome, String datanascita, int votoesame) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.datanascita = datanascita;
        this.votoesame = votoesame;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getDatanascita() {
        return datanascita;
    }
    public void setDatanascita(String datanascita) {
        this.datanascita = datanascita;
    }
    public int getVotoesame() {
        return votoesame;
    }
    public void setVotoesame(int votoesame) {
        this.votoesame = votoesame;
    }


    @Override
    public String toString() {
        return "Studente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", datanascita=" + datanascita
                + ", votoesame=" + votoesame + "]";
    }

    
}