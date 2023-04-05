package devandroid.jeff.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.jeff.applistacurso.model.Curso;

public class CursoController {

    private List listCursos;

    public List getListaDeCursos() {
       listCursos = new ArrayList<Curso>();

       listCursos.add(new Curso("Java"));
       listCursos.add(new Curso("HTML"));
       listCursos.add(new Curso("CSS"));
       listCursos.add(new Curso("Dart"));

       return listCursos;
    }

    public ArrayList<String> dadosParaSpinner() {
        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaDeCursos().size(); i++) {
            Curso objeto =  (Curso) getListaDeCursos().get(i);
            dados.add(objeto.getNomeDoCursoDesejado());
        }
        return dados;
    }
}
