package ca.destiny.evolution.enhancer.classEnhancer;

import ca.destiny.evolution.enhancer.CharacteristicsEnhancer;
import ca.destiny.other.RandomNumberGeneratorService;

public class RearAdmiralEnhancer extends CharacteristicsEnhancer {
    public RearAdmiralEnhancer(RandomNumberGeneratorService randomNumberGeneratorService) {
        super(randomNumberGeneratorService);
        int bonus1 = 11;
        int bonus2 = 9;
        this.strength = bonus1;
        this.speed = bonus1;
        this.dexterity = bonus1;
        this.courage = bonus1;
        this.stamina = bonus1;
        this.defense = bonus2;
        this.dodge = bonus2;
        this.resistance = 1;
        this.vitality = 75;
    }
}
