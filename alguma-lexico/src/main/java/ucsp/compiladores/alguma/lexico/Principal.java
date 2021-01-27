/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsp.compiladores.alguma.lexico;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Principal {
    public static void main(String args[]) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        AlgumaLexerLexer lexer = new AlgumaLexerLexer(cs);

        // // Descomentar para depurar el Léxico
        Token t = null;
        while( (t = lexer.nextToken()).getType() != Token.EOF) {
         System.out.println("<" +AlgumaLexerLexer.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">");
        }
        
        CharStream cs2 = CharStreams.fromFileName(args[0]);
        AlgumaLexerLexer lexer2 = new AlgumaLexerLexer(cs2);
        CommonTokenStream tokens = new CommonTokenStream(lexer2);
        AlgumaLexerParser parser = new AlgumaLexerParser(tokens);
        parser.programa();
    }
}

