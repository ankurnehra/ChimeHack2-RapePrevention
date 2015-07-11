package hackmate.rapeprevention.Models;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;

public class Model {
  public Observable<Location> userLocation = new Observable<>();
  public Observable<String> userName = new Observable<>();
  public Observable<ArrayList<Integer>> reactionTime = Observable.from(new ArrayList<Integer>());

  private Model() {}
  private static Model ONLY = new Model();
  public static Model getModel() {
    return ONLY;
  }
}
