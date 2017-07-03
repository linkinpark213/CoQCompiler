package com.linkinpark213.compiler;

import com.linkinpark213.compiler.analyzer.lexical.LexicalAnalyzer;
import com.linkinpark213.compiler.analyzer.lexical.symbols.Symbol;
import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ooo on 2017/6/2 0002.
 */
public class CompilerTest {
    public void printAnalyzeResult(ArrayList<Symbol> symbols) {
        System.out.println("==================================");
        System.out.println(symbols);
        for (int i = 0; i < symbols.size(); i++) {
            System.out.println(symbols.get(i).fullString());
        }
        System.out.println("==================================");
    }

    public String readCode(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        CompilerTest compilerTest = new CompilerTest();
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer();
//        compilerTest.printAnalyzeResult(lexicalAnalyzer.analyze("a:='a' + 3"));
        compilerTest.printAnalyzeResult(lexicalAnalyzer.analyze(compilerTest.readCode(new File("code.txt"))));
    }
}
