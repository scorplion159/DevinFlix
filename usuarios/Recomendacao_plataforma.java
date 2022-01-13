package usuarios;

import java.time.LocalDate;
import java.util.Date;
import usuarios.*;

public class Recomendacao_plataforma {
    private String titulo;
    private String usuario;
    private String data_da_recomendacao;
    private boolean recomendou;
    public boolean isRecomendou() {
        return recomendou;
    }
    public void setRecomendou(boolean recomendou) {
        this.recomendou = recomendou;
    }
    public Recomendacao_plataforma(String data_da_recomendacao) {
        this.data_da_recomendacao = data_da_recomendacao;
    }
    public Recomendacao_plataforma(String titulo, String usuario, String data_legivel2, boolean recomendou) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.data_da_recomendacao = data_legivel2;
        this.recomendou=recomendou;
        
        
    }
        
        
    
    @Override
    public String toString() {
        return "Recomendacao_plataforma [data_da_recomendacao=" + data_da_recomendacao + ", titulo=" + titulo
                + ", usuario=" + usuario + "]";
    }
    public String getData_da_recomendacao() {
        return data_da_recomendacao;
    }
    public void setData_da_recomendacao(String data_da_recomendacao) {
        this.data_da_recomendacao = data_da_recomendacao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void verifica_indicacao(String ususario ){
        
        
    }

    public void verifica_dias(int data_da_recomendacao, boolean recomendou){
        if (recomendou == true);

    }
    
}
