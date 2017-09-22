import java.util.*;
/* keys exist and have an x, y, and color value*/
class Key {
  int x, y;
  int color;
}
/* crystals exist and have an x, y, and color value*/
class Crystal {
  int x, y;
  int color;
}

/*ArrayList<Boolean> oneone = newArrayList<Boolean>();
oneone.add(True);
oneone.add(True);
oneone.add(False);
oneone.add(True);

System.out.println(oneone); */

ArrayList<Boolean> oneone = new ArrayList<Boolean>(4);
oneone.add(True);
oneone.add(True);
oneone.add(False);
oneone.add(True);
System.out.println(oneone.get(2));
System.out.println(oneone);
