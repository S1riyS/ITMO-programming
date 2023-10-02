// https://pokemondb.net/move/fly

package moves;

import pokemons.Sharpedo;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Fly extends PhysicalMove {
    private final Sharpedo ownerInstance;

    public Fly(Sharpedo ownerInstance, double power, double acc) {
        super(Type.FLYING, power, acc);
        this.ownerInstance = ownerInstance;
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
        this.ownerInstance.previousMove = this;
    }

    @Override
    protected String describe() {
        return "uses Fly";
    }
}
