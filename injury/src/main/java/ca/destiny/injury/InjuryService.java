package ca.destiny.injury;

import ca.destiny.fighter.bodypart.BodyPartDto;
import ca.destiny.fighter.equipment.weapon.WeaponDto;
import ca.destiny.injury.model.FighterInjuryInformation;
import ca.destiny.injury.provider.InjuryGeneratorFactoryProvider;
import ca.destiny.other.RandomNumberGeneratorService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InjuryService {

    private final RandomNumberGeneratorService randomNumberGeneratorService;
    private final InjuryGeneratorFactoryProvider injuryGeneratorFactoryProvider;
    private final FightStatusUpdater fightStatusUpdater;

    public InjuryService(RandomNumberGeneratorService randomNumberGeneratorService,
                         InjuryGeneratorFactoryProvider injuryGeneratorFactoryProvider,
                         FightStatusUpdater fightStatusUpdater) {
        this.randomNumberGeneratorService = randomNumberGeneratorService;
        this.injuryGeneratorFactoryProvider = injuryGeneratorFactoryProvider;
        this.fightStatusUpdater = fightStatusUpdater;
    }

    public void inflictInjuryIfNeeded(FighterInjuryInformation fighterInjuryInformation, WeaponDto weaponDto) {
        int damagePercentage = fighterInjuryInformation.getDamagePercentage();
        var injuryGeneratorFactory = injuryGeneratorFactoryProvider.get(damagePercentage, fighterInjuryInformation, weaponDto);
        var injuryGenerator = injuryGeneratorFactory.create(() -> getRandomBodyPart(fighterInjuryInformation.getAvailableBodyParts()));
        injuryGenerator.inflict(fighterInjuryInformation.isKnockout(), fighterInjuryInformation.getBattleInformation(), fightStatusUpdater);
    }

    private BodyPartDto getRandomBodyPart(List<BodyPartDto> availableBodyParts) {
        int size = availableBodyParts.size();
        int index = randomNumberGeneratorService.getRandomNumberInts(0, size - 1);
        return availableBodyParts.get(index);
    }

}
