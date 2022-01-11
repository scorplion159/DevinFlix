package main;
import filmes.*;
import usuarios.*;
import java.util.Scanner;


public class main {public static void main(String[] args) {
    Usuario usuario1 = new Usuario();
    usuario1.setNome("Leonardo");
    usuario1.setDate(27,10,1996);
    usuario1.setEndereco("Rua x");

    Usuario usuario2 = new Usuario();
    usuario2.setNome("Jorge");
    usuario2.setDate(27,05,1996);
    usuario2.setEndereco("Rua y");

    Usuario usuario3 = new Usuario();
    usuario3.setNome("Raquel");
    usuario3.setDate(05,05,1984);
    usuario3.setEndereco("Rua z");

    Usuario usuario4 = new Usuario();
    usuario4.setNome("João");
    usuario4.setDate(13,04,1993);
    usuario4.setEndereco("Rua c");
    

    Usuario usuario5 = new Usuario();
    usuario5.setNome("luiz");
    usuario5.setDate(14,05,1990);
    usuario5.setEndereco("Rua k");

    Usuario usuario6 =new Usuario();
    usuario6.setNome("Julia");
    usuario6.setDate(15,06,2000);
    usuario6.setEndereco("Rua z");

    //FILMES//

    Filmes filme1 = new Filmes();
    filme1.setNome("Homem Aranha");
    filme1.setGenero(enum_genero.DESENHO);
    

    Filmes filme2 = new Filmes();
    filme2.setNome("A viagem de chihiro");
    filme2.setGenero(enum_genero.DESENHO);

    Filmes filme3 = new Filmes();
    filme3.setNome("Medalha de honra");
    filme3.setGenero(enum_genero.ACAO);

    Filmes filme4 = new Filmes();
    filme4.setNome("Berseker");
    filme4.setGenero(enum_genero.ANIME);

    Filmes filme5 = new Filmes();
    filme5.setNome("Se beber não case");
    filme5.setGenero(enum_genero.COMEDIA);

    Filmes filme6 = new Filmes();
    filme6.setNome("O poderoso chefão");
    filme6.setGenero(enum_genero.CLASSICOS);

    ///COMANDOS DOS SISTEMA//
    Scanner entrada_dados = new Scanner(System.in);
    
    System.out.println("Voce tem 6 usuários cadastrados, digite o nome do usuário com o qual deseja fazer login ou digite somente a palavra **listar** para consultar a lista de usuários cadastrados");
    String selecao_usuario = entrada_dados.nextLine();
    if (selecao_usuario.equalsIgnoreCase("listar")){
        System.out.println(usuario1.getNome());
        System.out.println(usuario2.getNome());
        System.out.println(usuario3.getNome());
        System.out.println(usuario4.getNome());
        System.out.println(usuario5.getNome());
        System.out.println(usuario6.getNome());
        System.out.println("Digite o nome do usuário com o qual você desejar acessar a plataforma");
        String selecao_usuario2 = entrada_dados.nextLine();
        selecao_usuario=selecao_usuario2;
    }
    while (selecao_usuario.equalsIgnoreCase(usuario1.getNome())==false && selecao_usuario.equalsIgnoreCase(usuario2.getNome())==false && selecao_usuario.equalsIgnoreCase(usuario3.getNome())==false && selecao_usuario.equalsIgnoreCase(usuario4.getNome())==false && selecao_usuario.equalsIgnoreCase(usuario5.getNome())==false && selecao_usuario.equalsIgnoreCase(usuario6.getNome())==false && selecao_usuario.equalsIgnoreCase("listar")==false){
        System.out.println("usuario não cadastrado, tente novamente, se desejar ver a lista de usuaários cadastrados escreva a palavra **listar**");
        String selecao_usuario3 = entrada_dados.nextLine();
        selecao_usuario=selecao_usuario3;
    
    
        if (selecao_usuario.equalsIgnoreCase("listar")){
            System.out.println(usuario1.getNome());
            System.out.println(usuario2.getNome());
            System.out.println(usuario3.getNome());
            System.out.println(usuario4.getNome());
            System.out.println(usuario5.getNome());
            System.out.println(usuario6.getNome());
            System.out.println("Digite o nome do usuário com o qual você desejar acessar a plataforma");
            String selecao_usuario2 = entrada_dados.nextLine();
            selecao_usuario=selecao_usuario2;
        }
    
    }
    if (selecao_usuario.equalsIgnoreCase(usuario1.getNome())){
        System.out.println("*******************************");
        System.out.println("Bem vindo" + usuario1.getNome());
        System.out.println("*******************************");
    } 
    if (selecao_usuario.equalsIgnoreCase(usuario2.getNome())){
        System.out.println("*******************************");
        System.out.println("Bem vindo " + usuario2.getNome());
        System.out.println("*******************************");
    }
    if (selecao_usuario.equalsIgnoreCase(usuario3.getNome())){
        System.out.println("*******************************");
        System.out.println("Bem vindo " + usuario3.getNome());
        System.out.println("*******************************");
    }
    if (selecao_usuario.equalsIgnoreCase(usuario4.getNome())){
        System.out.println("*******************************");
        System.out.println("Bem vindo "+ usuario4.getNome());
        System.out.println("*******************************");
    }
    if (selecao_usuario.equalsIgnoreCase(usuario5.getNome())){
        System.out.println("*******************************");
        System.out.println("Bem vindo "+ usuario5.getNome());
        System.out.println("*******************************");
    }
    if (selecao_usuario.equalsIgnoreCase(usuario6.getNome())){
        System.out.println("*******************************");
        System.out.println("Bem vindo "+ usuario6.getNome());
        System.out.println("*******************************");
    }
    	
    System.out.println("Se deseja ver o catalogo de filmes digite: 1.");
    System.out.println("Se deseja indicar um filme para outro usuário, digite 2.");
    System.out.println("Caso deseje indicar um filme que queira ver em nossa plataforma, digite 3");
    int resposta = entrada_dados.nextInt();
    //System.out.println("Deseja recomendar um filme?");
    //int resposta2 = entrada_dados.nextInt();

    if (resposta == 1){System.out.println("1-" + filme1.getNome());
        System.out.println("2-" + filme2.getNome());
        System.out.println("3-" + filme3.getNome());
        System.out.println("4-" + filme4.getNome());
        System.out.println("5-" + filme5.getNome());
        System.out.println("6-" + filme6.getNome());
    }
    if (resposta == 2){
        
        String usuario_inicial=selecao_usuario;
        System.out.println("Digite o nome do usuário para o qual deseja recomendar o filme");
        String usuario_final=entrada_dados.nextLine();
        if(usuario_final.equalsIgnoreCase(usuario1.getNome())==false && usuario_final.equalsIgnoreCase(usuario2.getNome())==false && usuario_final.equalsIgnoreCase(usuario3.getNome())==false && usuario_final.equalsIgnoreCase(usuario4.getNome())==false && usuario_final.equalsIgnoreCase(usuario5.getNome())==false && usuario_final.equalsIgnoreCase(usuario6.getNome())==false && usuario_final.equalsIgnoreCase("listar")==false){
            while (usuario_final.equalsIgnoreCase(usuario1.getNome())==false && usuario_final.equalsIgnoreCase(usuario2.getNome())==false && usuario_final.equalsIgnoreCase(usuario3.getNome())==false && usuario_final.equalsIgnoreCase(usuario4.getNome())==false && usuario_final.equalsIgnoreCase(usuario5.getNome())==false && usuario_final.equalsIgnoreCase(usuario6.getNome())==false && usuario_final.equalsIgnoreCase("listar")==false){
                System.out.println("usuario não cadastrado, tente novamente, se desejar ver a lista de usuaários cadastrados escreva a palavra **listar**");
                String usuario_final2 = entrada_dados.nextLine();
                usuario_final=usuario_final2;
                if (usuario_final.equalsIgnoreCase("listar")){
                    System.out.println(usuario1.getNome());
                    System.out.println(usuario2.getNome());
                    System.out.println(usuario3.getNome());
                    System.out.println(usuario4.getNome());
                    System.out.println(usuario5.getNome());
                    System.out.println(usuario6.getNome());
                    System.out.println("Digite o nome do usuário com o qual você desejar acessar a plataforma");
                    String usuario_final3 = entrada_dados.nextLine();
                    usuario_final=usuario_final3;
                }
            }
        }
        String texto; 
        System.out.println("digite a sua mensagem de recomendação");
        texto = entrada_dados.nextLine();
        Recomendacao recomendacao = new Recomendacao(usuario_inicial, usuario_final, texto);
        ///adicionar a variaveln a classe

    

    }
    if (resposta == 1){System.out.println("1-" + filme1.getNome());
        System.out.println("2-" + filme2.getNome());
        System.out.println("3-" + filme3.getNome());
        System.out.println("4-" + filme4.getNome());
        System.out.println("5-" + filme5.getNome());
        System.out.println("6-" + filme6.getNome());
    
        System.out.println("Caso deseje assitir um filme, digite o código deste:");
        int filme_selecionado = entrada_dados.nextInt();
        System.out.println("Voce deseja deixar sua opinião sobre o filme selecionado? Pressione 1 para curtir e 2 para descurtir");
        int seleciona_curtida = entrada_dados.nextInt();
        if (filme_selecionado == 1 || filme_selecionado == 2 || filme_selecionado==3 || filme_selecionado==4 || filme_selecionado==5 || filme_selecionado==6 && seleciona_curtida==1 ){
            if (filme_selecionado ==1 && seleciona_curtida==1) {
                filme1.setOpcao_de_curtida(enum_curtidas.CURTIDA);
                System.out.println("Olá  " + selecao_usuario + " voce curtiu " + filme1.getNome());
            }
            if (filme_selecionado ==2 && seleciona_curtida==1) {
                filme2.setOpcao_de_curtida(enum_curtidas.CURTIDA);
                System.out.println("Olá  " + selecao_usuario + " voce curtiu " + filme2.getNome());
            }
            if (filme_selecionado ==3 && seleciona_curtida==1) {
                filme3.setOpcao_de_curtida(enum_curtidas.CURTIDA);
                System.out.println("Olá " + selecao_usuario + " voce curtiu " + filme3.getNome());
            }
            if (filme_selecionado ==4 && seleciona_curtida==1) {
                filme4.setOpcao_de_curtida(enum_curtidas.CURTIDA);
                System.out.println("Olá " + selecao_usuario + " voce curtiu " + filme4.getNome());
            }
            if(filme_selecionado==5 && seleciona_curtida==1){
                filme5.setOpcao_de_curtida(enum_curtidas.CURTIDA);
                System.out.println("Olá  " + selecao_usuario + " voce curtiu " + filme5.getNome());
            }
            if (filme_selecionado==6 && seleciona_curtida==1){
                filme6.setOpcao_de_curtida(enum_curtidas.CURTIDA);
                System.out.println("Olá  " + selecao_usuario + " voce curtiu " + filme6.getNome());

            }
        
        if (filme_selecionado == 1 && seleciona_curtida==2 || filme_selecionado == 2 && seleciona_curtida==2 || filme_selecionado==3 && seleciona_curtida==2 || filme_selecionado==4  && seleciona_curtida==2|| filme_selecionado==5 && seleciona_curtida==2 || filme_selecionado==6 && seleciona_curtida==2 ){
            if (filme_selecionado ==1) {
                filme1.setOpcao_de_curtida(enum_curtidas.DESCURTIDA);
                System.out.println("Olá " + selecao_usuario + " voce descurtiu " + filme1.getNome());
                }
            if (filme_selecionado ==2) {
                filme2.setOpcao_de_curtida(enum_curtidas.DESCURTIDA);
                System.out.println("Olá " + selecao_usuario + " voce descurtiu " + filme2.getNome());
                }
            if (filme_selecionado ==3) {
                filme3.setOpcao_de_curtida(enum_curtidas.DESCURTIDA);
                System.out.println("Olá " + selecao_usuario + " voce descurtiu " + filme3.getNome());
                }
            if (filme_selecionado ==4) {
                filme4.setOpcao_de_curtida(enum_curtidas.DESCURTIDA);
                System.out.println("Olá " + selecao_usuario + " voce descurtiu " + filme4.getNome());
                }
            if(filme_selecionado==5){
                filme5.setOpcao_de_curtida(enum_curtidas.DESCURTIDA);
                System.out.println("Ola " + selecao_usuario + " voce descurtiu " + filme5.getNome());
                }
            if (filme_selecionado==6){
                filme6.setOpcao_de_curtida(enum_curtidas.DESCURTIDA);
                System.out.println("Ola " + selecao_usuario + " voce descurtiu " + filme6.getNome());
    
                }
        

    }
    }
    
    
    
}
}}
    
    

