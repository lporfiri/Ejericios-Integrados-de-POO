package ejercicio1.cartas;

import ejercicio1.Palo;

public class CartaNumeral extends CartaConPalo {
    private int numero;

    public CartaNumeral(int numero, Palo palo) {
        super(palo);
        this.numero = numero;
    }

}
