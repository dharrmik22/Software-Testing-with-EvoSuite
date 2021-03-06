/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 09 00:48:30 GMT 2021
 */

package intelement;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import intelement.BinaryHeap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class  extends BinaryHeap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BinaryHeap binaryHeap0 = new BinaryHeap();
      assertNotNull(binaryHeap0);
      assertEquals((-1), binaryHeap0.findMin());
      assertFalse(binaryHeap0.isFull());
      assertTrue(binaryHeap0.isEmpty());
      
      boolean boolean0 = binaryHeap0.isEmpty();
      assertEquals((-1), binaryHeap0.findMin());
      assertFalse(binaryHeap0.isFull());
      assertTrue(binaryHeap0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BinaryHeap binaryHeap0 = new BinaryHeap(0);
      assertNotNull(binaryHeap0);
      assertTrue(binaryHeap0.isFull());
      assertTrue(binaryHeap0.isEmpty());
      assertEquals((-1), binaryHeap0.findMin());
      
      int int0 = binaryHeap0.deleteMin();
      assertTrue(binaryHeap0.isFull());
      assertTrue(binaryHeap0.isEmpty());
      assertEquals((-1), binaryHeap0.findMin());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BinaryHeap binaryHeap0 = new BinaryHeap(0);
      assertNotNull(binaryHeap0);
      assertEquals((-1), binaryHeap0.findMin());
      assertTrue(binaryHeap0.isEmpty());
      assertTrue(binaryHeap0.isFull());
      
      boolean boolean0 = binaryHeap0.wellFormed();
      assertEquals((-1), binaryHeap0.findMin());
      assertTrue(binaryHeap0.isEmpty());
      assertTrue(binaryHeap0.isFull());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BinaryHeap binaryHeap0 = new BinaryHeap(215);
      assertNotNull(binaryHeap0);
      assertEquals((-1), binaryHeap0.findMin());
      assertTrue(binaryHeap0.isEmpty());
      assertFalse(binaryHeap0.isFull());
      
      int int0 = binaryHeap0.findMin();
      assertEquals((-1), binaryHeap0.findMin());
      assertTrue(binaryHeap0.isEmpty());
      assertFalse(binaryHeap0.isFull());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BinaryHeap binaryHeap0 = new BinaryHeap(0);
      assertNotNull(binaryHeap0);
      assertTrue(binaryHeap0.isEmpty());
      assertEquals((-1), binaryHeap0.findMin());
      assertTrue(binaryHeap0.isFull());
      
      try { 
        binaryHeap0.insert(1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("intelement.BinaryHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BinaryHeap binaryHeap0 = new BinaryHeap();
      binaryHeap0.insert((-1));
      assertEquals((-1), binaryHeap0.findMin());
      assertFalse(binaryHeap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BinaryHeap binaryHeap0 = new BinaryHeap();
      binaryHeap0.makeEmpty();
      assertEquals((-1), binaryHeap0.findMin());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BinaryHeap binaryHeap0 = null;
      try {
        binaryHeap0 = new BinaryHeap((-1951));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("intelement.BinaryHeap", e);
      }
  }
}
