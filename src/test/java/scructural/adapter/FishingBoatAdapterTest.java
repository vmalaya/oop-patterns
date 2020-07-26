package scructural.adapter;

import lombok.var;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import structural.adapter.Captain;
import structural.adapter.FishingBoat;
import structural.adapter.FishingBoatAdapter;
import structural.adapter.RowingBoat;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class FishingBoatAdapterTest {

  private Map<String, Object> beans;

  private static final String FISHING_BEAN = "fisher";

  private static final String ROWING_BEAN = "captain";

  /**
   * This method runs before the test execution and sets the bean objects in the beans Map.
   */
  @BeforeEach
  public void setup() {
    beans = new HashMap<>();

    var fishingBoatAdapter = spy(new FishingBoatAdapter(new FishingBoat()));
    beans.put(FISHING_BEAN, fishingBoatAdapter);

    var captain = new Captain();
    captain.setRowingBoat((FishingBoatAdapter) beans.get(FISHING_BEAN));
    beans.put(ROWING_BEAN, captain);
  }

  @Test
  public void testAdapter() {
    var captain = (Captain) beans.get(ROWING_BEAN);

    captain.row();

    var adapter = (RowingBoat) beans.get(FISHING_BEAN);
    verify(adapter).row();
  }
}
