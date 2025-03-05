package oleborn.robotsurvivalist.game.gamedictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.game.gamedictionary.textDictionary.DescriptionCommunicationAntenna;

@Getter
@RequiredArgsConstructor
public enum CommunicationAntenna {

    DEFAULT(10,
            10,
            10,
            3,
            DescriptionCommunicationAntenna.DEFAULT_ANTENNA
    );

    private final Integer mass;
    private final Integer durability;
    private final Integer occupiedCapacity;
    private final Integer communicationRange;
    private final DescriptionCommunicationAntenna description;
}
