package structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RequiredArgsConstructor
@AllArgsConstructor
public class FishingBoatAdapter implements RowingBoat {
  private FishingBoat boat;

  @Override
  public void row() {
    boat.sail();
  }
}
