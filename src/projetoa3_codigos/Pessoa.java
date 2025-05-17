package projetoa3_codigos.src.projetoa3_codigos;
public class Pessoa {
    protected String nome;
    protected String RA;
    public static Boolean login(String email){
        Boolean arroba = email.contains("@");
        Boolean ponto = email.contains(".");
        Boolean tamanho = email.length()>10;
        return arroba && ponto && tamanho;
    }

    public void setRA(){
        this.RA = RA;
    }
    public String getRA(){
        return this.RA;
    }
    public void setnome(){
        this.nome = nome;
    }
    public String getnome(){
        return this.nome;
    }
    public void setProfessor(){
    }
    public String getProfessor(){
        return this.getProfessor();
    }
    public void setAluno(){
    }
    public String getAluno(){
        return this.getAluno();
    }



}
