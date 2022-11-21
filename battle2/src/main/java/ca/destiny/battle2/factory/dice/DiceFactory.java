package ca.destiny.battle2.factory.dice;

import ca.destiny.other.RandomNumberGeneratorService;
import org.springframework.stereotype.Component;

@Component
public class DiceFactory {

    private final RandomNumberGeneratorService randomNumberGeneratorService;
    public DiceFactory(RandomNumberGeneratorService randomNumberGeneratorService) {
        this.randomNumberGeneratorService = randomNumberGeneratorService;
    }

    public AccuracyDices getAccuracyDices(int dexterity, int dodge) {
        double numberOfDice = Math.ceil(Math.abs(dexterity - dodge) / 2d) + 1;
        return new AccuracyDices(numberOfDice, dexterity >= dodge, randomNumberGeneratorService);
    }

    public DamageDices getDamageDices(int strength, int defense) {
        double numberOfDice = Math.ceil(Math.abs(strength - defense) / 2d) + 1;
        return new DamageDices(numberOfDice, strength >= defense, randomNumberGeneratorService);
    }
}