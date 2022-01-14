package filmes;
import main.*;

public class Filmes{
    private String nome;
    public Filmes(String nome, String sinopse, enum_genero genero) {
        this.nome = nome;
        this.sinopse = sinopse;
        this.genero = genero;
    }
    
   

    @Override
    public String toString() {
        return "Filmes [genero=" + genero + ", nome=" + nome + ", sinopse=" + sinopse + "]";
    }



    private String sinopse;
    private enum_genero genero;
    private enum_curtidas opcao_de_curtida;
    private int curtidas;
    
    int ACAO_qtd;
    public int getACAO_qtd() {
        return ACAO_qtd;
    }
    public void setACAO_qtd(int aCAO_qtd) {
        ACAO_qtd = aCAO_qtd;
    }
    public int getINFANTIL_qtd() {
        return INFANTIL_qtd;
    }
    public void setINFANTIL_qtd(int iNFANTIL_qtd) {
        INFANTIL_qtd = iNFANTIL_qtd;
    }
    public int getDESENHO_qtd() {
        return DESENHO_qtd;
    }
    public void setDESENHO_qtd(int dESENHO_qtd) {
        DESENHO_qtd = dESENHO_qtd;
    }
    public int getANIME_qtd() {
        return ANIME_qtd;
    }
    public void setANIME_qtd(int aNIME_qtd) {
        ANIME_qtd = aNIME_qtd;
    }
    public int getCLASSICOS_qtd() {
        return CLASSICOS_qtd;
    }
    public void setCLASSICOS_qtd(int cLASSICOS_qtd) {
        CLASSICOS_qtd = cLASSICOS_qtd;
    }
    int INFANTIL_qtd;
    int DESENHO_qtd;
    int ANIME_qtd;
    int CLASSICOS_qtd;
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
    
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public int getDescurtidas() {
        return descurtidas;
    }
    public void setDescurtidas(int descurtidas) {
        this.descurtidas = descurtidas;
    }
    private int descurtidas;

    public Filmes(int curtidas, int descurtidas) {
        this.curtidas = curtidas;
        this.descurtidas = descurtidas;
    }
    
    
}
    
   

    