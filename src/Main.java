import gen.expLexer;
import gen.expParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


//Dupla EVELLYN ALANE ALVES DE MELO BUONAFINA
//      EDUARDO CAMELO BARRETO DE SIQUEIRA

public class Main {
    public static void main(String args[]) throws IOException {
        File arquivo = new File("C:/Users/Micro/IdeaProjects/compProjeto/src/teste.txt"); // pega os testes

        Analisador lexico = new Analisador(); // chama o nosso analisador
        @SuppressWarnings("resource") // resolver o bug do input
        Scanner input = new Scanner(arquivo); // lê o arquivo
        String Allargs = ""; // Ficar com todos os argumentos
        char letra; // Vai pegar letra por letra do Allargs
        String argumentos = ""; // caso a gnt queira add algo

        while (input.hasNextLine()) { // add tudo oq tá no arquivo nos Allargs
            argumentos = input.nextLine();
            Allargs += argumentos;
            Allargs += " \n ";
        }

        lexico.setArgs(Allargs); // Coloca todos os argumentos no analisador
        // Caso tenha um comentário, eu preciso saber o tamanho

        for (int i = 0; i < Allargs.length(); i++) {// lê todos os Allargs
            letra = Allargs.charAt(i); // Pega letra por letra
            lexico.setPos(i); // setar o local de onde parou.
            if (letra == ' ') { // vai até formar uma palavra
                lexico.categorizar(); // faz a categorização da palavra
            } else if (lexico.SimboloEspc(letra)) { // Valida se é um simbEsp
                lexico.getTokens().add("SimboloEsp: " + letra);
            } else if (letra == '"') {// valida as "
                lexico.setChar(letra);
                do {
                    i++;
                    letra = Allargs.charAt(i);
                    lexico.setChar(letra);
                } while (letra != '"');
                lexico.categorizar();
                lexico.setPos(i);

            } else {
                lexico.setChar(letra); // incrementa todos os caracteres para formar o lexema
            }
            i = lexico.getPos();// garante que eu vou pular os comentários
        }
        System.out.println("ANALISE LEXICA: ");
        System.out.println(" ");
        lexico.lista();
        System.out.println("");
        System.out.println("Todos os argumentos em ordem: ");
        System.out.println(lexico.getArgs());

        System.out.println("");

        System.out.println("ANALISE SINTATICA: ");
        // Exemplo de expressão de entrada
        String expression = lexico.getArgs();

        // Criação do InputStream a partir da string de entrada
        InputStream inputStream = new ByteArrayInputStream(expression.getBytes(StandardCharsets.UTF_8));

        // Criação do CharStream a partir do InputStream
        CharStream inputAux = CharStreams.fromStream(inputStream);

        // Criação do lexer usando o lexer externo
        expLexer lexer = new expLexer(inputAux);

        // Criação do TokenStream a partir do lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Criação do parser a partir do TokenStream
        expParser parser = new expParser(tokens);

        // Parse da expressão e obtenção da árvore de sintaxe
        ParseTree tree = parser.declarar();

        // Impressão da árvore de sintaxe
        System.out.println(tree.toStringTree(parser));

    }
}

/*
 *
 */