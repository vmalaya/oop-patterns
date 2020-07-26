package structural.adapter;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Captain {
  private RowingBoat rowingBoat;

  public void row() {
    rowingBoat.row();
  }
}
