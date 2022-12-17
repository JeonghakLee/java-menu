package menu.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import menu.domain.Menu;

public class MenuRepository {
  private static final List<Menu> menus = new ArrayList<>();

  public static List<Menu> menus() {
    return Collections.unmodifiableList(menus);
  }

  public static void addStation(Menu menu) {
    menus.add(menu);
  }
}
