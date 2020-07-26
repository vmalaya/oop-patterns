package behavioral.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hobbits implements WeatherObserver {
  @Override
  public void update(WeatherType currentWeather) {
    switch (currentWeather) {
      case COLD:
        log.info("The hobbits are shivering in the cold weather.");
        break;
      case RAINY:
        log.info("The hobbits look for cover from the rain.");
        break;
      case SUNNY:
        log.info("The happy hobbits bade in the warm sun.");
        break;
      case WINDY:
        log.info("The hobbits hold their hats tightly in the windy weather.");
        break;
      default:
        break;
    }
  }
}
