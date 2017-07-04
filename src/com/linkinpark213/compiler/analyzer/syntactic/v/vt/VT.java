package com.linkinpark213.compiler.analyzer.syntactic.v.vt;

import com.linkinpark213.compiler.analyzer.lexical.symbols.Symbol;
import com.linkinpark213.compiler.analyzer.syntactic.v.V;

import java.util.ArrayList;

/**
 * Created by ooo on 2017/7/3 0003.
 */
public class VT implements V {
    public static final int CONSTANT_INT = 100;
    public static final int CONSTANT_FLOAT = 101;
    public static final int CONSTANT_CHAR = 102;
    public static final int CONSTANT_BOOL = 103;
    public static final int IDENTIFIER = 104;
    public static final int KEYWORD = 105;
    public static final int OPERATOR_ARITHMETIC = 106;
    public static final int OPERATOR_RELATION = 107;
    public static final int OPERATOR_BOOL = 108;
    public static final int OPERATOR_ASSIGNMENT = 109;
    public static final int TYPE_SEPARATOR = 110;
    protected ArrayList<String> acceptableSymbols;

    public VT() {
        acceptableSymbols = new ArrayList<String>();
    }

    public boolean checkSymbol(Symbol symbol) {
        for (int i = 0; i < acceptableSymbols.size(); i++) {
            if (acceptableSymbols.get(i).equals(symbol.toString()))
                return true;
        }
        return false;
    }

    public VT clone() {
        return this.clone();
    }
}