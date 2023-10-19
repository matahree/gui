import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.junit.Test;

public class TestCollection {
  
  @Test
  public void hasNextNone() {
    Collection<String> col = new Collection<>();
    assertEquals(col.listIterator().hasNext(), false);
  }

  @Test
  public void hasNextValid() {
    Collection<String> col = new Collection<>();
    col.add("Entry 1");
    assertEquals(col.listIterator().hasNext(), true);
  }

  @Test
  public void nextNone() {
    Collection<String> col = new Collection<>();
    try {
      col.listIterator().next();
      //This isn't supposed to happen  
      assertTrue(false);
    } catch (NoSuchElementException e) {
      //This is supposed to happen
      assertTrue(true);
    }
  }

  @Test
  public void nextValid() {
    Collection<Integer> col = new Collection<>();
    col.add(1);
    assert(col.listIterator().next().equals(1));
  }

  @Test
  public void hasPreviousNone() {
    Collection<String> col = new Collection<>();
    assertEquals(col.listIterator().hasPrevious(), false);
  }  

  @Test
  public void hasPreviousValid() {
    Collection<Integer> col = new Collection<>();
    col.add(1);
    ListIterator<Integer> iterator = col.listIterator();
    iterator.next();
    assertEquals(iterator.hasPrevious(), true);
  }

  @Test
  public void nextIndexWithNext() {
    Collection<String> col = new Collection<>();
    col.add("string1");
    col.add("string2");
    ListIterator<String> iterator = col.listIterator();
    iterator.next();
    assertEquals(iterator.nextIndex(), 1);
  }

  @Test
  public void nextIndexWithoutNext() {
    Collection<String> col = new Collection<>();
    ListIterator<String> iterator = col.listIterator();
    assertEquals(iterator.nextIndex(), 0);
  }

  @Test
  public void previousIndexWithPrevious() {
    Collection<String> col = new Collection<>();
    col.add("string1");
    col.add("string2");
    ListIterator<String> iterator = col.listIterator();
    iterator.next();
    assertEquals(iterator.previousIndex(), 0);
  }

  @Test
  public void previousIndexWithoutPrevious() {
    Collection<String> col = new Collection<>();
    ListIterator<String> iterator = col.listIterator();
    assertEquals(iterator.previousIndex(), -1);
  }
  
  @Test
  public void addSingle() {
    Collection<String> col = new Collection<>();
    ListIterator<String> iterator = col.listIterator();
    iterator.add("string");
    ArrayList<String> toMatch = new ArrayList<>();
    toMatch.add("string");
    assertEquals(col.list, toMatch);
  }
  
  @Test
  public void addMultiple() {
    Collection<String> col = new Collection<>();
    ListIterator<String> iterator = col.listIterator();
    iterator.add("string");
    iterator.add("string");
    ArrayList<String> toMatch = new ArrayList<>();
    toMatch.add("string");
    toMatch.add("string");
    assertEquals(col.list, toMatch);
  }
  
  @Test
  public void removeNotFollowingNextOrPrevious() {
    Collection<String> col = new Collection<>();
    col.add("string");
    col.add("string");
    try {
      col.listIterator().remove();
      //This isn't supposed to happen  
      assertTrue(false);
    } catch (IllegalStateException e) {
      //This is supposed to happen
      assertTrue(true);
    }
  }
  
  @Test
  public void removeValid() {
    Collection<String> col = new Collection<>();
    col.add("string");
    ListIterator<String> iterator = col.listIterator();
    iterator.next();
    iterator.remove();
    ArrayList<String> toMatch = new ArrayList<>();
    assertEquals(col.list, toMatch);
  }
  
  @Test
  public void setAfterAdd() {
    Collection<String> col = new Collection<>();
    col.add("string");
    ListIterator<String> iterator = col.listIterator();
    iterator.next();
    iterator.add("string");
    try {
      iterator.set("string");
      //This isn't supposed to happen  
      assertTrue(false);
    } catch (IllegalStateException e) {
      //This is supposed to happen
      assertTrue(true);
    }
  }
  
  
  @Test
  public void setAfterRemove() {
    Collection<String> col = new Collection<>();
    col.add("string");
    col.add("string");
    ListIterator<String> iterator = col.listIterator();
    iterator.next();
    iterator.remove();
    try {
      iterator.set("string");
      //This isn't supposed to happen  
      assertTrue(false);
    } catch (IllegalStateException e) {
      //This is supposed to happen
      assertTrue(true);
    }
  }
  
  @Test
  public void setNotFollowingNextOrPrevious() {
    Collection<String> col = new Collection<>();
    col.add("string");
    col.add("string");
    try {
      col.listIterator().set("string");
      //This isn't supposed to happen  
      assertTrue(false);
    } catch (IllegalStateException e) {
      //This is supposed to happen
      assertTrue(true);
    }
  }
  
  @Test
  public void setValid() {
    Collection<String> col = new Collection<>();
    col.add("string");
    ListIterator<String> iterator = col.listIterator();
    iterator.next();
    iterator.set("s");
    ArrayList<String> toMatch = new ArrayList<>();
    toMatch.add("s");
    assertEquals(col.list, toMatch);
  }
  
  
}