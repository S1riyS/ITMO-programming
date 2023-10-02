// https://pokemondb.net/move/imprison

package moves;

import pokemons.Sharpedo;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Imprison extends StatusMove {
    private final Sharpedo ownerInstance;

    public Imprison(Sharpedo ownerInstance, double power, double acc) {
        super(Type.PSYCHIC, power, acc);
        this.ownerInstance = ownerInstance;
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        this.ownerInstance.previousMove = this;
    }

    @Override
    protected String describe() {
        return "uses Imprison";
    }
}
