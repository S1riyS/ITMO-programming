// https://pokemondb.net/pokedex/ralts

package pokemons;

import moves.DragonRage;
import moves.Psybeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ralts extends Pokemon {
    public Ralts(String name, int level) {
        super(name, level);
        super.setType(Type.PSYCHIC, Type.FAIRY);
        super.setStats(28, 25, 25, 45, 35, 40);

        // Moves:
        DragonRage dragonRage = new DragonRage(0, 100);
        Psybeam psybeam = new Psybeam(65, 100);
        super.setMove(dragonRage, psybeam);
    }
}
