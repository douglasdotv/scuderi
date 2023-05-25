package org.dv;

import org.dv.scuderi.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private final static Map<String, Scuderi> questions = new HashMap<>();
    private static int n;

    static {
        questions.put("Aviao", new A());
        questions.put("Bob", new B());
        questions.put("FakeNews", new C());
        questions.put("ProsaGPT", new D());
        questions.put("Eclipse", new E());
        questions.put("Cabotagem", new F());
        questions.put("Magica", new G());
    }

    public static void main(String[] args) {
        questions.forEach((qName, problem) -> {
            System.out.println("Problema " + ++n + " – \"" + qName + "\"");
            problem.solve();
            System.out.println();
        });
    }

}
