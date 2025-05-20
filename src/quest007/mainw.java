package quest007;

import java.util.ArrayList;

public class mainw {
    public static void main(String[] args) {
        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(new Gerente("Wild", "111.111.111-11", 5000.0, 1500.0));
        lista.add(new Vendedor("Renan", "222.222.222-22", 2000.0, 800.0));
        lista.add(new Vendedor("Lucas", "333.333.333-33", 2200.0, 900.0));

        for (Funcionario f : lista) {
            System.out.println(f);
        }
    }
}

