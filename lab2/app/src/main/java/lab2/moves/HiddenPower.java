// https://pokemondb.net/move/hidden-power
// Instruction on how to calculate Type and Power of "Hidden Power":
// https://poke-universe.ru/dex/attacks/bw/hidden_power.html

package lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class HiddenPower extends SpecialMove {
    public HiddenPower(Pokemon ownerInstance, double acc) {
        super(getType(ownerInstance), getPower(ownerInstance), acc);
    }

    @Override
    protected String describe() {
        return "uses Hidden Power (Type: %s; Power: %s)".formatted(this.type, this.power);
    }

    private static Type getType(Pokemon owner) {
        int A = restoreNormalStat(owner.getStat(Stat.HP)) % 2 != 0 ? 1 : 0;
        int B = restoreNormalStat(owner.getStat(Stat.ATTACK)) % 2 != 0 ? 2 : 0;
        int C = restoreNormalStat(owner.getStat(Stat.DEFENSE)) % 2 != 0 ? 4 : 0;
        int D = restoreNormalStat(owner.getStat(Stat.SPEED)) % 2 != 0 ? 8 : 0;
        int E = restoreNormalStat(owner.getStat(Stat.SPECIAL_ATTACK)) % 2 != 0 ? 16 : 0;
        int F = restoreNormalStat(owner.getStat(Stat.SPECIAL_DEFENSE)) % 2 != 0 ? 32 : 0;

        int typeNumber = (int) Math.floor((A + B + C + D + E + F) * (15.0 / 63.0));
        return switch (typeNumber) {
            case 0 -> Type.FIGHTING;
            case 1 -> Type.FLYING;
            case 2 -> Type.POISON;
            case 3 -> Type.GROUND;
            case 4 -> Type.ROCK;
            case 5 -> Type.BUG;
            case 6 -> Type.GHOST;
            case 7 -> Type.STEEL;
            case 8 -> Type.FIRE;
            case 9 -> Type.WATER;
            case 10 -> Type.GRASS;
            case 11 -> Type.ELECTRIC;
            case 12 -> Type.PSYCHIC;
            case 13 -> Type.ICE;
            case 14 -> Type.DRAGON;
            case 15 -> Type.DARK;
            default -> Type.NORMAL;
        };
    }

    private static double getPower(Pokemon owner) {
        int normalAttack = restoreNormalStat(owner.getStat(Stat.ATTACK));
        int normalDefense = restoreNormalStat(owner.getStat(Stat.DEFENSE));
        int normalSpeed = restoreNormalStat(owner.getStat(Stat.SPEED));
        int normalSpecialAttack = restoreNormalStat(owner.getStat(Stat.SPECIAL_ATTACK));
        int normalSpecialDefense = restoreNormalStat(owner.getStat(Stat.SPECIAL_DEFENSE));

        int U = 0; // (I couldn't understand what "ОД" is, so variable U will be equal 0 by default)
        int V = normalAttack % 4 == 2 || normalAttack % 4 == 3 ? 2 : 0;
        int W = normalDefense % 4 == 2 || normalDefense % 4 == 3 ? 4 : 0;
        int X = normalSpeed % 4 == 2 || normalSpeed % 4 == 3 ? 8 : 0;
        int Y = normalSpecialAttack % 4 == 2 || normalSpecialAttack % 4 == 3 ? 16 : 0;
        int Z = normalSpecialDefense % 4 == 2 || normalSpecialDefense % 4 == 3 ? 32 : 0;

        return (U + V + W + X + Y + Z) * (40.0 / 63.0) + 30;
    }

    private static int restoreNormalStat(double FS) {
        // I roughly estimated how to convert fighting stat (FS) to normal (NS):
        // NS = (700.0 / 9.0) * FS - (4105.0 / 9.0), if NS is lower than 25 => NS = 25

        double NS = (700.0 / 9.0) * FS - (4105.0 / 9.0);
        double normalizedNS = Math.max(NS, 25.0);
        return (int) normalizedNS;
    }
}
