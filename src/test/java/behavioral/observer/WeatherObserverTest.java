package behavioral.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherObserverTest {
  private Weather weather;
  private Elves elves;
  private Hobbits hobbits;

  @BeforeEach
  public void setUp() {
    weather = new Weather();
    elves = new Elves();
    hobbits = new Hobbits();
  }

  @Test
  void should_notify() {
    weather.addObserver(elves);
    weather.addObserver(hobbits);
    weather.timePasses();
  }
}
