// https://pokemondb.net/move/mud-slap

package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class MudSlap extends SpecialMove {
    public MudSlap(double power, double acc) {
        super(Type.GROUND, power, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().stat(Stat.ACCURACY, -1);
        p.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "uses Mud-Slap";
    }
}
