package filmes;
import usuarios.*;

public class Filmes_indicados {
    Usuario usuario;
    public Usuario getUsuario() {
        return usuario;
    }
    public Filmes_indicados(Usuario usuario, String filme_indicado) {
        this.usuario = usuario;
        this.filme_indicado = filme_indicado;
    }
    @Override
    public String toString() {
        return "Filmes_indicados [filme_indicado=" + filme_indicado + ", usuario=" + usuario + "]";
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getFilme_indicado() {
        return filme_indicado;
    }
    public void setFilme_indicado(String filme_indicado) {
        this.filme_indicado = filme_indicado;
    }
    String filme_indicado;
    
}
