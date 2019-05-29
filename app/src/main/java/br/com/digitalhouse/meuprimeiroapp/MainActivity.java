package br.com.digitalhouse.meuprimeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void botaoApertado(View view){
        TextView respostaTextView = findViewById(R.id.texto_resposta_id);
        EditText alturaDigitado = findViewById(R.id.Altura_digitado_id ) ;
        EditText pesoDigitado = findViewById(R.id.Peso_digitado_id);
        Float peso = Float.parseFloat(pesoDigitado.getText().toString());
        Float altura = Float.parseFloat(alturaDigitado.getText().toString());

        Float resultado = peso / (altura * altura);
        respostaTextView.setText("O seu IMC é: " + resultado);

        if (resultado >= 18.5 && resultado <= 24.99){
            Toast.makeText(this, "Peso normal", Toast.LENGTH_LONG).show();
        }

        else if (resultado >= 25 && resultado <= 29.99){
            Toast.makeText(this, "Acima do peso", Toast.LENGTH_LONG).show();
        }

        else if (resultado >= 30 && resultado <= 34.99){
            Toast.makeText(this, "Obesidade I", Toast.LENGTH_LONG).show();
        }

        else {
            Toast.makeText(this, "Obesidade II (severa)", Toast.LENGTH_LONG).show();
        }

    }
}
