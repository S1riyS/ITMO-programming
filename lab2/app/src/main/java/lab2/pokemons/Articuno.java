// https://pokemondb.net/pokedex/articuno

package lab2.pokemons;

import lab2.moves.Flash;
import lab2.moves.HiddenPower;
import lab2.moves.MudSlap;
import lab2.moves.Pursuit;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Articuno extends Pokemon {
    public Articuno(String name, int level) {
        super(name, level);
        super.setType(Type.ICE, Type.FLYING);
        super.setStats(90, 85, 100, 95, 125, 85);

        // Moves:
        Flash flash = new Flash(0, 100);
        HiddenPower hiddenPower = new HiddenPower(this, 100);
        MudSlap mudSlap = new MudSlap(20, 100);
        Pursuit pursuit = new Pursuit(40, 100);
        super.setMove(flash, hiddenPower, mudSlap, pursuit);
    }
}
