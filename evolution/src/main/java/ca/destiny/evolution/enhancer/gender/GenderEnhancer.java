package ca.destiny.evolution.enhancer.gender;

import ca.destiny.evolution.enhancer.CharacteristicsEnhancer;
import ca.destiny.other.RandomNumberGeneratorService;

public class GenderEnhancer extends CharacteristicsEnhancer {

    public GenderEnhancer(int first, int second, RandomNumberGeneratorService randomNumberGeneratorService) {
        super(randomNumberGeneratorService);
        this.strength = first;
        this.vitality = first*2;
        this.defense = first;
        this.resistance = first;
        this.dexterity = second;
        this.dodge = second;
        this.speed = second;
    }
}