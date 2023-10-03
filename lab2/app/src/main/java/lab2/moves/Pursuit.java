// https://pokemondb.net/move/pursuit

package lab2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Pursuit extends PhysicalMove {
    public Pursuit(double power, double acc) {
        super(Type.DARK, power, acc);
    }

    @Override
    protected String describe() {
        return "uses Pursuit";
    }
}
