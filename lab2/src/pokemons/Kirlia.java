// https://pokemondb.net/pokedex/kirlia

package pokemons;

import moves.Octazooka;

public class Kirlia extends Ralts {
    public Kirlia(String name, int level) {
        super(name, level);
        super.setStats(38, 35, 35, 65, 55, 50);

        // Moves:
        Octazooka octazooka = new Octazooka(65, 85);
        super.addMove(octazooka);
    }
}
