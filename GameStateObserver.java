//Obersver for viewing and updating current GameState

public class GameStateObserver implements Observer {

    @Override
    public void update(Strategy currentStrategy) {
        System.out.println("GameState has been updated. Current Strategy: " + currentStrategy.getClass().getSimpleName());
    }
}
