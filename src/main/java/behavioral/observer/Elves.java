package behavioral.observer;

import behavioral.observer.WeatherObserver;
import behavioral.observer.WeatherType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Elves implements WeatherObserver {

  @Override
  public void update(WeatherType currentWeather) {
    switch (currentWeather) {
      case COLD:
        log.info("Elves don't care how cold is outside.");
        break;
      case RAINY:
        log.info("Elves don't care how rainy is outside.");
        break;
      case SUNNY:
        log.info("Elves don't care how sunny is outside.");
        break;
      case WINDY:
        log.info("Elves don't care how windy is outside.");
        break;
      default:
        break;
    }
  }
}
