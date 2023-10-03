// https://pokemondb.net/pokedex/cascoon

package lab2.pokemons;

import lab2.moves.Flash;
import lab2.moves.HiddenPower;
import lab2.moves.MudSlap;
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
