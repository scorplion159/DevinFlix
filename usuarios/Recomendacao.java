package usuarios;

import filmes.Filmes;
import usuarios.*;

public class Recomendacao{
    String usuario_inicial;
    String usuario_final;
    public Recomendacao(String usuario_inicial, String usuario_final, String texto, int filme) {
        this.usuario_inicial = usuario_inicial;
        this.usuario_final = usuario_final;
        this.texto = texto;
        this.filme = filme;
    }
    @Override
    public String toString() {
        return "Recomendacao [filme=" + filme + ", texto=" + texto + ", usuario_final=" + usuario_final
                + ", usuario_inicial=" + usuario_inicial + "]";
    }
    String texto;
    int filme;
    public String getUsuario_inicial() {
        return usuario_inicial;
    }
    public void setUsuario_inicial(String usuario_inicial) {
        this.usuario_inicial = usuario_inicial;
    }
    public String getUsuario_final() {
        return usuario_final;
    }
    public void setUsuario_final(String usuario_final) {
        this.usuario_final = usuario_final;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public int getFilme() {
        return filme;
    }
    public void setFilme(int filme) {
        this.filme = filme;
    }

    
}
    

    