// Instruction on how to calculate Type and Power of "Hidden Power":
// https://poke-universe.ru/dex/attacks/bw/hidden_power.html

package utils;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class HiddenPowerCalculator {
    public static Type getType(Pokemon owner) {
        int A = owner.getStat(Stat.HP) % 2 != 0 ? 1 : 0;
        int B = owner.getStat(Stat.ATTACK) % 2 != 0 ? 2 : 0;
        int C = owner.getStat(Stat.DEFENSE) % 2 != 0 ? 4 : 0;
        int D = owner.getStat(Stat.SPEED) % 2 != 0 ? 8 : 0;
        int E = owner.getStat(Stat.SPECIAL_ATTACK) % 2 != 0 ? 16 : 0;
        int F = owner.getStat(Stat.SPECIAL_DEFENSE) % 2 != 0 ? 32 : 0;

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

    public static double getPower(Pokemon owner) {
        int U = 0; // (Я так и не понял, что такое ОД, поэтому 0 по умолчанию)
        int V = owner.getStat(Stat.ATTACK) % 4 == 2 || owner.getStat(Stat.ATTACK) % 4 == 3 ? 2 : 0;
        int W = owner.getStat(Stat.DEFENSE) % 4 == 2 || owner.getStat(Stat.ATTACK) % 4 == 3 ? 4 : 0;
        int X = owner.getStat(Stat.SPEED) % 4 == 2 || owner.getStat(Stat.ATTACK) % 4 == 3 ? 8 : 0;
        int Y = owner.getStat(Stat.SPECIAL_ATTACK) % 4 == 2 || owner.getStat(Stat.ATTACK) % 4 == 3 ? 16 : 0;
        int Z = owner.getStat(Stat.SPECIAL_DEFENSE) % 4 == 2 || owner.getStat(Stat.ATTACK) % 4 == 3 ? 32 : 0;

        return (U + V + W + X + Y + Z) * (40.0 / 63.0) + 30;
    }
}
