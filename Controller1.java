package controller;

import java.util.ArrayList;

import eco.repository.EcoRepo;
import ecommerce.model.Ecommerce2;

public class Controller1 implements EcoRepo {

    private ArrayList<Ecommerce2> listaEcommerce = new ArrayList<>();

    public void pagar(int numero, float valor) {
        // Implemente a lógica para pagamento, se necessário
    }

    public void alterarEnd() {
        // Implemente a lógica para alteração de endereço, se necessário
    }
}
