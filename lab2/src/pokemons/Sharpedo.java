// https://pokemondb.net/pokedex/sharpedo

package pokemons;

import moves.FakeOut;
import moves.Fly;
import moves.Imprison;
import moves.LightOfRuin;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sharpedo extends Pokemon {
    public Move previousMove;

    public Sharpedo(String name, int level) {
        super(name, level);
        super.setType(Type.WATER, Type.DARK);
        super.setStats(70, 120, 40, 95, 40, 95);
        this.previousMove = null;

        // Moves:
        Fly fly = new Fly(this, 90, 95);
        Imprison imprison = new Imprison(this, 0, 0);
        LightOfRuin lightOfRuin = new LightOfRuin(this, 140, 90);
        FakeOut fakeOut = new FakeOut(this, 40, 100);
        super.setMove(fly, imprison, lightOfRuin, fakeOut);
    }
}
