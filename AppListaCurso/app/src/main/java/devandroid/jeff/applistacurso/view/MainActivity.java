package devandroid.jeff.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.jeff.applistacurso.R;
import devandroid.jeff.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    String dadosPessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Jef");
        pessoa.setSobreNome("Robersvaldo");
        pessoa.setCursoDesejado("Dev");
        pessoa.setTelefoneContato("31-3423433");


        Log.i("Teste", pessoa.toString());

    }
}