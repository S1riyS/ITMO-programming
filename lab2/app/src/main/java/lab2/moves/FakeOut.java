// https://pokemondb.net/move/fake-out

package lab2.moves;

import lab2.pokemons.Sharpedo;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FakeOut extends PhysicalMove {
    private final Sharpedo ownerInstance;

    public FakeOut(Sharpedo ownerInstance, double power, double acc) {
        super(Type.NORMAL, power, acc, 3, 1); // Priority = 3
        this.ownerInstance = ownerInstance;
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        if (this.ownerInstance.previousMove == null) {
            super.applyOppDamage(def, damage); // Damage
            Effect.flinch(def); // Effect
            System.out.println(def + " is flinched");
            this.ownerInstance.previousMove = this;
        } else {
            System.out.println(this.ownerInstance + " cannot use Fake Out");
        }
    }

    @Override
    protected String describe() {
        return "uses Fake Out";
    }
}
