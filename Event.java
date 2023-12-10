//Holds all Event classes

public interface Event {
    void triggerEvent(Character character);
}

class InvasionEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        String location = character.getCurrentLocation().getName();
        System.out.println("An invasion has occurred in " + location + " [Health -10] [Influence -10]");
        character.decreaseHealth(10);
        character.decreaseInfluence(10);
    }
}

class FamineEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println("A severe famine has struck [Health -15] [Strength -15] ");
        character.decreaseHealth(15);
        character.decreaseStrength(15);
    }
}

class TreasureDiscoveryEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println(character.getName() + " has discovered a hidden treasure [Wealth +30]");
        character.increaseWealth(30);
    }
}

class DiplomaticEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println(character.getName() + " has entered into a diplomatic encounter [Influence +10]");
        character.increaseInfluence(10); 
    }
}

class NaturalDisasterEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        String location = character.getCurrentLocation().getName();
        System.out.println("A devastating natural disaster has occurred in " + location + " [Health -15] [Strength -15] [Wealth -10]");
        character.decreaseHealth(15);
        character.decreaseStrength(15);
        character.decreaseWealth(10);
    }
}

class TradeOpportunityEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println(character.getName() + " has encountered a lucrative trade opportunity [Wealth +25]");
        character.increaseWealth(25);
    }
}

class PlagueEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        String location = character.getCurrentLocation().getName();
        System.out.println("A deadly plague spreads through " + location +  " afflicting the population [Health -15] [Strength -10]");
        character.decreaseHealth(15);
        character.decreaseStrength(10);
    }
}

class BanditAttackEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println("Bandits have ambushed travelers [Health -15] [Wealth -10]");
        character.decreaseHealth(15);
        character.decreaseWealth(10);
    }
}

class FestivalEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println("A grand festival brings joy and celebration [Influence +20]");
        character.increaseInfluence(20); 
    }
}

class MonsterAttackEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        String location = character.getCurrentLocation().getName();
        System.out.println("Monsters have attacked " + location + " [Health -15] [Strength -15]");
        character.decreaseHealth(15);
        character.decreaseStrength(15);
    }
}

class MagicArtifactDiscoveryEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println(character.getName() + "has discovered a powerful magic artifact [Strength +20]");
        character.increaseStrength(20);
    }
}

class EconomicBoomEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        String location = character.getCurrentLocation().getName();
        System.out.println(location + " experiences an economic boom [Wealth +30]");
        character.increaseWealth(30);
    }
}

class PoliticalScandalEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        String location = character.getCurrentLocation().getName();
        System.out.println("A political scandal rocks " + location +" [Influence -20]");
        character.decreaseInfluence(20);
    }
}

class DroughtEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println("A severe drought affects the region [Wealth -20]");
        character.decreaseWealth(20);
    }
}

class HeroicDeedEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println(character.getName() + "performed a heroic deed [Influence +15]");
        character.increaseInfluence(15);
    }
}

class AlienInvasionEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        String location = character.getCurrentLocation().getName();
        System.out.println("Aliens from another planet invade" + location + " [Health -15] [Strength -15]");
        character.decreaseHealth(15);
        character.decreaseStrength(15);
    }
}

class ArtThievesEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println("Art thieves steal valuable artifacts [Wealth -20]");
        character.decreaseWealth(20);
    }
}

class RebellionEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println("A rebellion against" + character.getName() + "'s kingdom has lead those closest to you to question your sanity. [Influence -20]");
        character.decreaseInfluence(20);
    }
}

class TimeTravelEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println(character.getName() + "accidentally travel back in time [Influence -20]");
        character.decreaseInfluence(20);
    }
}