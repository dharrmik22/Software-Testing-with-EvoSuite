/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 09 02:10:27 GMT 2021
 */

package util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import util.Vector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Vector_ESTest extends Vector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>(10);
      Vector<String> vector1 = new Vector<String>(10);
      vector1.ensureCapacity(10);
      vector1.retainAll(vector0);
      Vector<Integer> vector2 = new Vector<Integer>(0);
      int int0 = (-1014);
      vector1.clear();
      Integer integer0 = new Integer((-1014));
      vector2.add(0, integer0);
      vector0.trimToSize();
      Integer[] integerArray0 = new Integer[5];
      integerArray0[0] = integer0;
      Integer integer1 = new Integer(10);
      integerArray0[1] = integer1;
      integerArray0[2] = integer0;
      Integer integer2 = new Integer(0);
      integerArray0[3] = integer2;
      integerArray0[4] = integer0;
      vector0.toArray(integerArray0);
      vector2.lastElement();
      vector1.removeRange((-799), 0);
      int int1 = 534;
      vector0.elementAt(int0);
      Collection<String> collection0 = null;
      vector1.addAll(int1, collection0);
      int int2 = (-1628);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>((-2476));
      Vector<Object> vector1 = null;
      try {
        vector1 = new Vector<Object>(vector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -2476
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector<Vector<String>> vector0 = new Vector<Vector<String>>();
      vector0.ensureCapacity(1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>(0);
      vector0.lastElement();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      String string0 = "i:,";
      vector0.addElement("i:,");
      int int0 = (-432);
      vector0.clear();
      String string1 = "W#wRjx]Zna9Y5OA`J1";
      Collection<Object> collection0 = null;
      // Undeclared exception!
      try { 
        vector0.containsAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      vector0.elementAt(0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector<Vector<Object>> vector0 = new Vector<Vector<Object>>();
      Vector<Object> vector1 = new Vector<Object>(vector0);
      int int0 = (-3084);
      // Undeclared exception!
      try { 
        vector0.setElementAt(vector1, (-3084));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3084
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>(3655, (-1));
      Integer integer0 = new Integer(0);
      vector0.add(0, integer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>(0);
      vector0.isEmpty();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 303;
      Vector<String> vector0 = new Vector<String>(2, 303);
      vector0.clear();
      vector0.add("R V~RZKRh7;@^zlZ");
      vector0.spliterator();
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).test(any());
      vector0.removeIf(predicate0);
      int int1 = 0;
      vector0.elementAt(0);
      Vector<Vector<Integer>> vector1 = new Vector<Vector<Integer>>(303, 661);
      vector1.removeElementAt(853);
      vector1.hashCode();
      Vector<Object> vector2 = new Vector<Object>();
      vector2.trimToSize();
      Vector<Integer> vector3 = null;
      try {
        vector3 = new Vector<Integer>(int1, int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         //  >= 
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 0;
      Vector<String> vector0 = new Vector<String>(0);
      vector0.setElementAt("", 0);
      vector0.removeElementAt(int0);
      Vector<Object> vector1 = null;
      try {
        vector1 = new Vector<Object>(int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 0;
      Vector<Object> vector0 = new Vector<Object>(0);
      Vector<Object> vector1 = new Vector<Object>(vector0);
      // Undeclared exception!
      try { 
        vector1.set(0, vector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector<Vector<Integer>> vector0 = new Vector<Vector<Integer>>(1770, 1770);
      vector0.indexOf((Object) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Vector<Object> vector1 = new Vector<Object>(vector0);
      vector1.removeElement(vector0);
      Vector<Vector<String>> vector2 = new Vector<Vector<String>>();
      vector2.stream();
      vector2.elementAt(1);
      Collection<String> collection0 = null;
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Vector<Integer> vector1 = new Vector<Integer>(vector0);
      vector1.clone();
      Vector<Object> vector2 = new Vector<Object>();
      Integer integer0 = new Integer(0);
      vector2.insertElementAt(integer0, (-2642));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 0;
      Vector<String> vector0 = new Vector<String>(0);
      Vector<String> vector1 = new Vector<String>(vector0);
      vector1.parallelStream();
      vector1.removeAllElements();
      vector0.removeAll(vector1);
      vector0.toArray((Integer[]) null);
      Vector<Object> vector2 = null;
      try {
        vector2 = new Vector<Object>(vector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 0;
      Vector<Object> vector0 = new Vector<Object>(0);
      Vector<Object> vector1 = new Vector<Object>(vector0);
      int int1 = 0;
      // Undeclared exception!
      try { 
        vector1.setElementAt(vector0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      vector0.trimToSize();
      vector0.forEach(consumer0);
      int int0 = 2021;
      Vector<Object> vector1 = new Vector<Object>(0, 2021);
      Object object0 = vector1.clone();
      vector0.removeElement(object0);
      Collection<String> collection0 = null;
      vector0.removeAll((Collection<?>) null);
      int int1 = 0;
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 0;
      Vector<String> vector0 = new Vector<String>(0);
      vector0.removeAllElements();
      vector0.clone();
      Integer integer0 = new Integer(0);
      Vector<Object> vector1 = new Vector<Object>(0, 0);
      vector0.containsAll(vector1);
      vector0.lastIndexOf((Object) integer0);
      vector0.setSize(0);
      // Undeclared exception!
      try { 
        vector1.removeElementAt((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // <0
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      vector0.stream();
      vector0.toString();
      vector0.trimToSize();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>(0, 0);
      vector0.parallelStream();
      Integer integer0 = new Integer(0);
      int int0 = 1093;
      vector0.insertElementAt(integer0, 1093);
      int int1 = 0;
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = 0;
      Vector<String> vector0 = new Vector<String>(0, 0);
      Integer integer0 = new Integer(0);
      vector0.remove((Object) integer0);
      vector0.toString();
      vector0.removeAllElements();
      Vector<Integer> vector1 = new Vector<Integer>(0, 0);
      Integer integer1 = new Integer(1723);
      vector1.setElementAt(integer1, 0);
      int int1 = 0;
      Integer integer2 = null;
      try {
        integer2 = new Integer(int1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Vector<Integer> vector1 = new Vector<Integer>(vector0);
      Vector<Integer> vector2 = new Vector<Integer>(vector1);
      Integer[] integerArray0 = new Integer[6];
      int int0 = 0;
      vector2.setSize(0);
      Integer integer0 = new Integer(0);
      vector2.lastElement();
      integerArray0[0] = integer0;
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>(1958, 0);
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      vector0.removeIf(predicate0);
      Vector<String> vector1 = new Vector<String>((-1236));
      Vector<String> vector2 = new Vector<String>(vector1);
      vector0.containsAll(vector2);
      // Undeclared exception!
      try { 
        vector0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1236
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      vector0.toString();
      vector0.elementAt(0);
      int int0 = (-1126);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      int int0 = (-318);
      String string0 = "M*L[<";
      // Undeclared exception!
      try { 
        vector0.add((-318), "M*L[<");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -318
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector<Vector<String>> vector0 = new Vector<Vector<String>>((-1), (-1));
      // Undeclared exception!
      try { 
        vector0.clear();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = 354;
      Vector<String> vector0 = new Vector<String>(10, 354);
      Vector<Object> vector1 = new Vector<Object>(vector0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = ";f;Ppfxwqi$#]P";
      Integer integer0 = new Integer(10);
      vector1.remove((Object) integer0);
      vector0.insertElementAt("YDpNIE}3*+?", 354);
      vector0.removeElement(vector1);
      Predicate<String> predicate0 = (Predicate<String>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        vector0.removeIf(predicate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // >
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>(2285);
      int int0 = 1;
      Integer integer0 = new Integer(1);
      vector0.equals(integer0);
      Vector<String> vector1 = new Vector<String>(1014);
      vector1.removeElement(integer0);
      vector1.toString();
      vector1.elementAt(0);
      vector0.lastIndexOf((Object) integer0);
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        vector0.toArray(objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = 0;
      Vector<Integer> vector0 = new Vector<Integer>(0, 995);
      Integer integer0 = new Integer((-2310));
      vector0.set((-2310), integer0);
      Vector<String> vector1 = new Vector<String>();
      int int1 = (-657);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      vector0.capacity();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>(0, 0);
      Vector<String> vector1 = new Vector<String>(0);
      vector0.lastIndexOf((Object) vector1, 0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>(0);
      vector0.get(0);
      // Undeclared exception!
      try { 
        vector0.iterator();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = 662;
      int int1 = 0;
      Vector<Integer> vector0 = new Vector<Integer>(662, 0);
      vector0.get(2262);
      int int2 = 3480;
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = 0;
      Vector<Object> vector0 = new Vector<Object>(0);
      Collection<String> collection0 = null;
      Vector<String> vector1 = null;
      try {
        vector1 = new Vector<String>((Collection<? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector<Vector<Object>> vector0 = new Vector<Vector<Object>>();
      vector0.clone();
      Vector<Object> vector1 = vector0.get((-1345));
      // Undeclared exception!
      try { 
        vector1.containsAll(vector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1345
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = 0;
      Vector<String> vector0 = new Vector<String>(0, 0);
      // Undeclared exception!
      try { 
        vector0.remove(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      int int0 = (-1831);
      UnaryOperator<Object> unaryOperator0 = (UnaryOperator<Object>) mock(UnaryOperator.class, new ViolatedAssumptionAnswer());
      vector0.replaceAll(unaryOperator0);
      // Undeclared exception!
      try { 
        vector0.remove((-1831));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1831
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Stream<String> stream0 = vector0.parallelStream();
      Vector<Object> vector1 = new Vector<Object>(vector0);
      Integer integer0 = new Integer((-2738));
      vector1.addElement(integer0);
      vector0.containsAll(vector1);
      vector1.containsAll(vector0);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) stream0;
      objectArray0[1] = (Object) integer0;
      vector1.removeRange((-2738), (-2017));
      objectArray0[2] = (Object) vector1;
      objectArray0[3] = (Object) vector1;
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      String string0 = " >= ";
      vector0.indexOf((Object) " >= ");
      // Undeclared exception!
      try { 
        vector0.setElementAt(" >= ", (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = 2;
      int int1 = (-1);
      Vector<String> vector0 = new Vector<String>(2, (-1));
      int int2 = 1425;
      vector0.lastIndexOf((Object) "1ZkK!w^8!ANiW3", 1425);
      String string0 = "IDScC2i< <rBHv3&'`7";
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = 1565;
      int int1 = 0;
      Vector<Object> vector0 = new Vector<Object>(1565, 0);
      Integer[] integerArray0 = new Integer[0];
      vector0.toArray(integerArray0);
      Vector<Integer> vector1 = new Vector<Integer>();
      int int2 = (-1492);
      Vector<Vector<Object>> vector2 = new Vector<Vector<Object>>(0, 1565);
      Vector<Vector<Object>> vector3 = new Vector<Vector<Object>>(vector2);
      vector3.get(10);
      int int3 = (-1931);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      vector0.sort((Comparator<? super Object>) null);
      vector0.lastElement();
      int int0 = 10;
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      int int0 = 2529;
      vector0.spliterator();
      Integer integer0 = new Integer(2529);
      // Undeclared exception!
      try { 
        vector0.setElementAt(integer0, 2529);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2529 >= 0
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Spliterator<Object> spliterator0 = vector0.spliterator();
      vector0.lastIndexOf((Object) spliterator0);
      vector0.elements();
      Vector<Integer> vector1 = new Vector<Integer>();
      vector1.spliterator();
      Vector<Integer> vector2 = new Vector<Integer>(vector1);
      vector1.addAll(4522, (Collection<? extends Integer>) vector2);
      Vector<Object> vector3 = null;
      try {
        vector3 = new Vector<Object>(vector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      vector0.elements();
      Vector<Object> vector1 = new Vector<Object>(vector0);
      Vector<String> vector2 = new Vector<String>();
      vector1.removeElementAt(0);
      int int0 = (-1279);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int int0 = 1328;
      Vector<Integer> vector0 = new Vector<Integer>(1328);
      Integer integer0 = new Integer(1328);
      vector0.equals(integer0);
      Vector<Object> vector1 = new Vector<Object>(vector0);
      vector1.iterator();
      int int1 = 0;
      vector1.listIterator(0);
      vector1.removeElement(integer0);
      // Undeclared exception!
      try { 
        vector0.firstElement();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int int0 = 1270;
      Vector<Object> vector0 = new Vector<Object>(1270, 760);
      Vector<String> vector1 = new Vector<String>(997);
      Vector<String> vector2 = new Vector<String>(vector1);
      Object object0 = vector2.firstElement();
      vector0.remove(object0);
      // Undeclared exception!
      try { 
        vector0.removeAllElements();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = 778;
      Vector<String> vector0 = new Vector<String>(778, 778);
      vector0.toString();
      vector0.clear();
      Vector<Object> vector1 = new Vector<Object>(778, 778);
      // Undeclared exception!
      try { 
        vector1.set(778, "[]");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      int int0 = 0;
      Vector<Object> vector0 = new Vector<Object>(0, 0);
      int int1 = 1518;
      // Undeclared exception!
      try { 
        vector0.remove(1518);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      vector0.toArray();
      int int0 = (-1367);
      Vector<Vector<Object>> vector1 = null;
      try {
        vector1 = new Vector<Vector<Object>>((-1367));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1367
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int int0 = 1307;
      int int1 = (-1328);
      Vector<Vector<Integer>> vector0 = new Vector<Vector<Integer>>(1307, (-1328));
      // Undeclared exception!
      try { 
        vector0.elementAt((-1328));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1328
         //
         verifyException("util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      vector0.addElement("util.Vector");
      Vector<Integer> vector1 = new Vector<Integer>(1);
      Vector<Object> vector2 = new Vector<Object>(vector1);
      vector2.capacity();
      vector2.indexOf((Object) null, (-2533));
      int int0 = (-401);
      Vector<Integer> vector3 = new Vector<Integer>();
      vector1.addAll(int0, (Collection<? extends Integer>) vector3);
  }
}