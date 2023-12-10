import java.util.ArrayList;
import java.util.List;

public class GameState {
    private List<Character> characters;
    private Strategy currentStrategy;
    private List<Observer> observers = new ArrayList<>();

    public GameState() {
        characters = new ArrayList<>();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void setCurrentStrategy(Strategy strategy) {
        this.currentStrategy = strategy;
        notifyObservers();
    }

    public Strategy getCurrentStrategy() {
        return currentStrategy;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentStrategy);
        }
    }
}