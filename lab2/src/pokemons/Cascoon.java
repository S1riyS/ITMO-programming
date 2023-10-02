// https://pokemondb.net/pokedex/cascoon

package pokemons;

import moves.Flash;
import moves.HiddenPower;
import moves.MudSlap;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cascoon extends Pokemon {
    public Cascoon(String name, int level) {
        super(name, level);
        super.setType(Type.BUG);
        super.setStats(50, 35, 55, 25, 25, 15);

        // Moves:
        Flash flash = new Flash(0, 100);
        HiddenPower hiddenPower = new HiddenPower(this, 100);
        MudSlap mudSlap = new MudSlap(20, 100);
        super.setMove(flash, hiddenPower, mudSlap);
    }
}
