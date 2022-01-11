package filmes;

public class Filmes{
    String nome;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public enum_genero getGenero() {
        return genero;
    }
    public void setGenero(enum_genero genero) {
        this.genero = genero;
    }
    public enum_curtidas getOpcao_de_curtida() {
        return opcao_de_curtida;
    }
    public void setOpcao_de_curtida(enum_curtidas opcao_de_curtida) {
        this.opcao_de_curtida = opcao_de_curtida;
    }
    String sinopse;
    enum_genero genero;
    enum_curtidas opcao_de_curtida;

    public Filmes() {
    }

    
}