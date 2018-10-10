package br.ufjf.dcc196.dcc196_trb1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        cadastroAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resposta = new Intent();
                String nome = nomeAluno.getText().toString();
                String email = emailAluno.getText().toString();
                String matricula = matriculaAluno.getText().toString();
                resposta.putExtra("nome", nome);
                resposta.putExtra("email", email);
                resposta.putExtra("matricula", matricula);


                if (!nome.isEmpty() && !email.isEmpty() && !matricula.isEmpty()) {
                    setResult(RESULT_OK, resposta);
                    finish();
                }

                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}
