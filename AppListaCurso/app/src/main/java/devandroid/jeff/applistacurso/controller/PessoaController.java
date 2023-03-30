package devandroid.jeff.applistacurso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.jeff.applistacurso.model.Pessoa;

public class PessoaController {

    @NonNull
    @Override
    public String toString() {
        Log.d("DEBUG", "Controller iniciada");
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {
        Log.i("DEBUG", "Salvo "+ pessoa.toString());
    }
}
