package br.ufjf.dcc196.dcc196_trb1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public final static int REQUEST_CADASTROALUNO = 1;
    public final static int REQUEST_CADASTRAREVENTO = 2;


    private Button cadastroAluno;
    private Button cadastroEvento;

    private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
    private ArrayList<Evento> listaEventos = new ArrayList<Evento>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadastroAluno = findViewById(R.id.btn_cadastro);
        cadastroEvento = findViewById(R.id.btn_evento);

        cadastroAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alunoPage = new Intent(MainActivity.this, CadastroAluno.class);
                startActivityForResult(alunoPage, REQUEST_CADASTROALUNO);
            }
        });

        cadastroEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eventoPage = new Intent(MainActivity.this, CadastroEvento.class);
                startActivityForResult(eventoPage, REQUEST_CADASTRAREVENTO);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == MainActivity.RESULT_OK && data != null) {
            Bundle resultado = data.getExtras();
            if (resultado.isEmpty()) {
                return;
            }

            switch (requestCode) {
                case MainActivity.REQUEST_CADASTROALUNO:
                    String nome = resultado.getString("nome");
                    String email = resultado.getString("email");
                    String matricula = resultado.getString("matricula");

                    Aluno novoAluno = new Aluno(nome, email, matricula);
                    this.listaAlunos.add(novoAluno);

                    Toast.makeText(getApplicationContext(), "Aluno Registrado: "+ nome, Toast.LENGTH_LONG).show();
                    break;

                case MainActivity.REQUEST_CADASTRAREVENTO:
                    String titulo = resultado.getString("titulo");
                    String dia = resultado.getString("dia");
                    String hora = resultado.getString("hora");
                    String facilitador = resultado.getString("facilitador");
                    String descricao = resultado.getString("descricao");

                    Evento novoEvento = new Evento(titulo, dia, hora, facilitador, descricao);
                    this.listaEventos.add(novoEvento);

                    Toast.makeText(getApplicationContext(), "Evento Registrado: "+ titulo, Toast.LENGTH_LONG).show();
                    break;

            }
        }
    }
}
