import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
      List<String> dirs = new ArrayList<String>(Arrays.asList(arr));
      for (int i = 0; i + 1 < dirs.size(); i++) {
        if ("NORTHSOUTH,SOUTHNORTH,EASTWEST,WESTEAST".contains(dirs.get(i) + dirs.get(i + 1))) {
          dirs.remove(i + 1);
          dirs.remove(i);
          i = -1;
        }
      }
      return dirs.toArray(new String[dirs.size()]);
    }
}
