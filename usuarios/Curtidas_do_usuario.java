package usuarios;

import java.util.ArrayList;

public class Curtidas_do_usuario {
     
    ArrayList<String> filmes_curtidos_leonardo = new ArrayList();
    private String usuario;
    private int filme_selecionado;
    public Curtidas_do_usuario(String usuario, int filme_selecionado) {
        this.usuario = usuario;
        this.filme_selecionado = filme_selecionado;
        this.add(filmes_curtidos_leonardo);
    }
    @Override
    public String toString() {
        return "Curtidas_do_usuario [filme_selecionado=" + filme_selecionado + ", usuario=" + usuario + "]";
    }
    public Curtidas_do_usuario(String selecao_usuario, String filme_selecionado_parse_string) {
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public int getFilme_selecionado() {
        return filme_selecionado;
    }
    public void setFilme_selecionado(int filme_selecionado) {
        this.filme_selecionado = filme_selecionado;
    }
    public void add(ArrayList<String> filmes_curtidos_leonardo2) {
    }
    
   
    
    
}
