package filmes;

public class Conta_generos {
    int genero_comedia_qtd;
    public int getGenero_comedia_qtd() {
        return genero_comedia_qtd;
    }
    public void setGenero_comedia_qtd(int genero_comedia_qtd) {
        this.genero_comedia_qtd = genero_comedia_qtd;
    }
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
    int ACAO_qtd;
    int INFANTIL_qtd;
    int DESENHO_qtd;
    int ANIME_qtd;
    int CLASSICOS_qtd;
    
    public class main {
        public void checagenero(int filme, Filmes filmes){
            if (filme ==1){
               if( filmes.getGenero().equals(enum_genero.ACAO)){
                  filmes.setACAO_qtd(filmes.getACAO_qtd()+1);
                   
               }
            }
    
            
        }
    }
}
        
