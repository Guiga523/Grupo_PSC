package projetoa3_codigos;

public class Aluno extends Person {
    private String Resultados;
    public Aluno (String nome, int, idade, String resultados) {
        super (nome, idade);
    }
public String getResultados () {
    return resultados;
}
public void setResultados(String resultados) {
    this.resultados = resultados;
}
}
