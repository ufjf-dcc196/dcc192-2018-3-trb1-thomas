package br.ufjf.dcc196.dcc196_trb1;

import java.io.Serializable;
import java.util.ArrayList;

public class Participante implements Serializable{
    private String nome, email, cpf;
    private ArrayList<Evento> eventosInscritos = new ArrayList<Evento>();

    public Participante(){

    }
    public Participante(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public void inscreveEmEvento(Evento evento){
        this.eventosInscritos.add(evento);
    }

    public void removeDoEvento(int position){ this.eventosInscritos.remove(position);}

    
    public ArrayList<Evento> getEventosInscritos() {
        return eventosInscritos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
