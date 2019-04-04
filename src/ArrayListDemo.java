import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo{
  public static void main(String args[]){
    int i = 132;
    List list = new ArrayList<String>();
    list.add(new Object());
    list.add("Hi");
    list.add(i);
    System.out.println(list.get(1));
  }
}

