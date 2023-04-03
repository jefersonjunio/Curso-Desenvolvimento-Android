package devandroid.jeff.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.jeff.applistacurso.R;
import devandroid.jeff.applistacurso.controller.PessoaController;
import devandroid.jeff.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    PessoaController controller;
    EditText et_primeiroNome;
    EditText et_sobreNome;
    EditText et_nomeCurso;
    EditText et_telefoneContato;
    Button bt_limpar;
    Button bt_salvar;
    Button bt_finalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        controller = new PessoaController();
        controller.toString();

        et_primeiroNome = findViewById(R.id.et_primeiro_nome);
        et_sobreNome = findViewById(R.id.et_sobrenome);
        et_nomeCurso = findViewById(R.id.et_nome_curso);
        et_telefoneContato = findViewById(R.id.et_telefone);

        bt_limpar = findViewById(R.id.bt_limpar);
        bt_finalizar = findViewById(R.id.bt_finalizar);
        bt_salvar = findViewById(R.id.bt_salvar);

        et_primeiroNome.setText(pessoa.getPrimeiroNome());
        et_sobreNome.setText(pessoa.getSobreNome());
        et_nomeCurso.setText(pessoa.getCursoDesejado());
        et_telefoneContato.setText(pessoa.getTelefoneContato());

        bt_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_nomeCurso.setText("");
                et_primeiroNome.setText("");
                et_sobreNome.setText("");
                et_telefoneContato.setText("");
            }
        });
        bt_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(MainActivity.this, "App encerrado!", Toast.LENGTH_SHORT).show();
            }
        });
        bt_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pessoa.setPrimeiroNome(et_primeiroNome.getText().toString());
                pessoa.setSobreNome(et_sobreNome.getText().toString());
                pessoa.setTelefoneContato(et_telefoneContato.getText().toString());
                pessoa.setCursoDesejado(et_nomeCurso.getText().toString());
                //Toast.makeText(MainActivity.this, "Salvo " + pessoa.toString(), Toast.LENGTH_SHORT).show();

                controller.salvaPessoa(pessoa);
            }
        });

        Log.i("Teste", pessoa.toString());
    }
}