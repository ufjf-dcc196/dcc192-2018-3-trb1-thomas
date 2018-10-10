package br.ufjf.dcc196.dcc196_trb1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CadastroAluno extends AppCompatActivity {

    private Button cadastroAluno;
    private TextView nomeAluno;
    private TextView emailAluno;
    private TextView matriculaAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);

        cadastroAluno = findViewById(R.id.btn_registrarAluno);
        nomeAluno = findViewById(R.id.txt_nome);
        emailAluno = findViewById(R.id.txt_email);
        matriculaAluno = findViewById(R.id.txt_matricula);

        
    }
}
