package devandroid.jeff.applistacurso.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.jeff.applistacurso.model.Pessoa;
import devandroid.jeff.applistacurso.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    public static final String NOME_PREFERENCES = "pref_listavip";
    SharedPreferences.Editor listaVip;
    public PessoaController(MainActivity mainActivity) {
        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();

    }
    @NonNull
    @Override
    public String toString() {
        Log.d("Controller", "Controller inicializada");
        return super.toString();
    }
    public void salvaPessoa(Pessoa pessoa) {
        Log.i("Controller", "SALVO "+ pessoa.toString());
        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("sobreNome", pessoa.getSobreNome());
        listaVip.putString("cursoDesejado", pessoa.getCursoDesejado());
        listaVip.putString("telefoneContato", pessoa.getTelefoneContato());
        listaVip.apply();
    }

    public Pessoa buscar(Pessoa pessoa) {
        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", "NA"));
        pessoa.setSobreNome(preferences.getString("sobreNome", "NA"));
        pessoa.setCursoDesejado(preferences.getString("cursoDesejado", "NA"));
        pessoa.setTelefoneContato(preferences.getString("telefoneContato", "NA"));
        return pessoa;
    }

    public void limpar() {
        listaVip.clear();
        listaVip.apply();
    }

}
