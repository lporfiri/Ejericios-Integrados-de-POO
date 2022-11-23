package ejercicio1.cartas;

import ejercicio1.Palo;

public abstract class CartaConPalo extends Carta {

    private Palo palo;

    public CartaConPalo(Palo palo) {
        this.palo = palo;
    }

}