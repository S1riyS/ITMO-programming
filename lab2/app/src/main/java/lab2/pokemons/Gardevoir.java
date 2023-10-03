// https://pokemondb.net/pokedex/gardevoir

package lab2.pokemons;

import lab2.moves.Charge;

public class Gardevoir extends Kirlia {
    public Gardevoir(String name, int level) {
        super(name, level);
        super.setStats(68, 65, 65, 125, 115, 80);

        // Moves:
        Charge charge = new Charge(0, 0);
        super.addMove(charge);
    }
}
