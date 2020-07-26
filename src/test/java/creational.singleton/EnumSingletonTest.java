package creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnumSingletonTest {
  @Test
  void should_create_one_instance() {
    EnumSingleton first_instance = EnumSingleton.INSTANCE;
    EnumSingleton second_instance = EnumSingleton.INSTANCE;
    EnumSingleton third_instance = EnumSingleton.INSTANCE;

    Assertions.assertEquals(first_instance, second_instance);
    Assertions.assertEquals(first_instance, third_instance);
    Assertions.assertEquals(second_instance, third_instance);
  }
}
