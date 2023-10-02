// https://pokemondb.net/move/hidden-power

package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import utils.HiddenPowerCalculator;

public class HiddenPower extends SpecialMove {
    public HiddenPower(Pokemon ownerInstance, double acc) {
        super(HiddenPowerCalculator.getType(ownerInstance), HiddenPowerCalculator.getPower(ownerInstance), acc);
    }

    @Override
    protected String describe() {
        return "uses Hidden Power";
    }
}
