package br.ufjf.dcc196.dcc196_trb1;

public class Evento {

    private String titulo;
    private String dia;
    private String hora;
    private String facilitador;
    private String descricao;


    Evento(String title, String day, String time, String facilitator, String description) {
        this.titulo = title;
        this.dia = day;
        this.hora = time;
        this.facilitador = facilitator;
        this.descricao = description;
    }
}
