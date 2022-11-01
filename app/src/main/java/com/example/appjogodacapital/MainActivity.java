package com.example.appjogodacapital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String estados [] = {"Acre", "São Paulo", "Paraná", "Maranhão",
            "Pará", "Rio de Janeiro", "Rio Grande do Sul",
            "Rondônia", "Santa Catarina", "Tocantins", "Sergipe",
            "Rio Grande do Norte", "Piauí", "Paraíba", "Roraima"};

    public String capitais [] = {"rio branco", "sao paulo", "curitiba", "sao luis", "belem", "rio de janeiro", "porto alegre",
            "porto velho", "florianopolis", "palmas", "aracaju", "natal", "teresina", "jaoa pessoa", "boa vista"
    };

    int i = (int)Math.round(Math.random() *14);
    TextView tEstados, pontuacao, resp;
    EditText respCapital;
    int pontos = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         tEstados = findViewById(R.id.estados);
         pontuacao = findViewById(R.id.pontuacao);
         resp = findViewById(R.id.resp);
         respCapital = findViewById(R.id.respCapital);


         this.tEstados.setText(estados[i]);
    }

    public void confirmResp(View view){
         for(int j = 0; j < 5; j++) {
             int i = (int) Math.round(Math.random() * 14);
             this.tEstados.setText(estados[i]);
             if(respCapital.getText().equals(this.capitais[i])){
                this.pontuacao.setText(String.valueOf(this.pontos + 10));
                this.tEstados.setText(estados[i]);
                this.resp.setText("Acetou !!!");
             }else {
                 this.resp.setText("Tente novamente");
             }
         }

    }

}