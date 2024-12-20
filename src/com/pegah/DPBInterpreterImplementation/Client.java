package com.pegah.DPBInterpreterImplementation;

public class Client {
    public InterpreterContext ic;

    public Client(InterpreterContext i) {
        ic = i;
    }

    public String interpret(String str) {
        Expression exp = null;

        // perform the parsing
        int c = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        if (str.contains("Hexadecimal")) {
            exp = new IntToHexExpression(c);
        } else if (str.contains("Binary")) {
            exp = new IntToBinaryExpression(c);
        } else
            return str;

        return exp.interpret(ic);
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        Client ec = new Client(new InterpreterContext());
        System.out.println(str1 + "= " + ec.interpret(str1));
        System.out.println(str2 + "= " + ec.interpret(str2));
    }
}
