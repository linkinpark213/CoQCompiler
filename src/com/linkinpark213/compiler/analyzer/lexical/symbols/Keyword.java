package com.linkinpark213.compiler.analyzer.lexical.symbols;

import java.util.ArrayList;

/**
 * Created by ooo on 2017/6/2 0002.
 */
public class Keyword implements Symbol {
    public String symbol;
    private int row;
    private int column;

    public static final ArrayList<String> keyWords;
    public static final int TYPE_KEYWORD = 105;

    static {
        keyWords = new ArrayList<String>();
        keyWords.add("int");
        keyWords.add("float");
        keyWords.add("char");
        keyWords.add("bool");
        keyWords.add("if");
        keyWords.add("then");
        keyWords.add("else");
        keyWords.add("switch");
        keyWords.add("case");
        keyWords.add("while");
        keyWords.add("do");
    }

    public Keyword(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String fullString() {
        return "Keyword: " + symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    @Override
    public int getType() {
        return TYPE_KEYWORD;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public int getColumn() {
        return column;
    }

    @Override
    public void setColumn(int column) {
        this.column = column;
    }
}
