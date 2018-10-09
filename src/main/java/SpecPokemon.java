/**
 * parent class of special needs pokemon.
 */
public abstract class SpecPokemon extends Pokemon {
    /**
     * We now have a specialty attack for the electric pokemon! Thunderbolt attack!
     */
    public String specialtyAttack;
    /**
     * The probability that we execute the specialty attack.
     */
    public double specialtyProbability;
    /**
     * special attack.
     * @param other the pokemon to cut up
     * @return if he's dead
     */
    public boolean specAttack(final Pokemon other) {
        if (super.attack(other)) {
            return true;
        } else if (!other.pokeType.equals(this.pokeType) && specialtyProbability > Math.random()) {
            System.out.println(specialtyAttack);
            other.setHitPoints(0);
            return true;
        }
        return false;
    }
}
