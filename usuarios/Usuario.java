package usuarios;

import javax.xml.crypto.Data;

import filmes.enum_genero;

public class Usuario {
    String nome;
    String endereco;
    Data date;
    enum_genero generos_preferidos;
    String sugestoes;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Data getDate() {
        return date;
    }
    public void setDate(Data date) {
        this.date = date;
    }
    public enum_genero getGeneros_preferidos() {
        return generos_preferidos;
    }
    public void setGeneros_preferidos(enum_genero generos_preferidos) {
        this.generos_preferidos = generos_preferidos;
    }
    public String getSugestoes() {
        return sugestoes;
    }
    public void setSugestoes(String sugestoes) {
        this.sugestoes = sugestoes;
    }
    public void setDate(int i, int j, int k) {
    }

    

    
    
}
