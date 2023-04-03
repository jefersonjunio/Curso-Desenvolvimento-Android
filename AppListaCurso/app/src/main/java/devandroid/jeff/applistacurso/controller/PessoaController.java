package devandroid.jeff.applistacurso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.jeff.applistacurso.model.Pessoa;

public class PessoaController {

    @NonNull
    @Override
    public String toString() {
        Log.d("Controller", "Controller inicializada");
        return super.toString();
    }
    public void salvaPessoa(Pessoa pessoa) {
        Log.i("Controller", "SALVO "+ pessoa.toString());
    }
}
