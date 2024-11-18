package com.pegah.DPSAdapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern Implementation.");
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says ....");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says ....");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says ....");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
