/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 09 18:19:09 GMT 2021
 */

package intkey;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import intkey.BinaryNode;
import intkey.BinarySearchTree;
import intkey.Range;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BinarySearchTree_ESTest extends BinarySearchTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = binarySearchTree0.repOK((BinaryNode) null, range0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      BinaryNode binaryNode0 = mock(BinaryNode.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        binarySearchTree0.repOK(binaryNode0, (Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("intkey.BinarySearchTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      boolean boolean0 = binarySearchTree0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      // Undeclared exception!
      try { 
        binarySearchTree0.insert(1575);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problems: 
         // \tAssertion cannot be resolved to a type
         // \tCase cannot be resolved to a type
         //
         verifyException("intkey.BinarySearchTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      binarySearchTree0.printTree();
      assertTrue(binarySearchTree0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      BinaryNode binaryNode0 = mock(BinaryNode.class, new ViolatedAssumptionAnswer());
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(range0).inRange(anyInt());
      boolean boolean0 = binarySearchTree0.repOK(binaryNode0, range0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      // Undeclared exception!
      try { 
        binarySearchTree0.spex_M_remove(1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problems: 
         // \tAuto cannot be resolved to a type
         // \tThe method pre(boolean) is undefined for the type BinarySearchTree
         // \tThe method pre(boolean) is undefined for the type BinarySearchTree
         // \tThe method post(boolean) is undefined for the type BinarySearchTree
         //
         verifyException("intkey.BinarySearchTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      // Undeclared exception!
      try { 
        binarySearchTree0.spex_M_findMin();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problems: 
         // \tAuto cannot be resolved to a type
         // \tThe method pre(boolean) is undefined for the type BinarySearchTree
         // \tThe method pre(boolean) is undefined for the type BinarySearchTree
         // \tThe method post(boolean) is undefined for the type BinarySearchTree
         //
         verifyException("intkey.BinarySearchTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      BinaryNode binaryNode0 = mock(BinaryNode.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = binarySearchTree0.repOK(binaryNode0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      // Undeclared exception!
      try { 
        binarySearchTree0.spex_M_insert((-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problems: 
         // \tAuto cannot be resolved to a type
         // \tThe method pre(boolean) is undefined for the type BinarySearchTree
         // \tThe method pre(boolean) is undefined for the type BinarySearchTree
         // \tThe method post(boolean) is undefined for the type BinarySearchTree
         //
         verifyException("intkey.BinarySearchTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      // Undeclared exception!
      try { 
        binarySearchTree0.spex_M_findMax();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problems: 
         // \tAuto cannot be resolved to a type
         // \tThe method pre(boolean) is undefined for the type BinarySearchTree
         // \tThe method pre(boolean) is undefined for the type BinarySearchTree
         // \tThe method post(boolean) is undefined for the type BinarySearchTree
         //
         verifyException("intkey.BinarySearchTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      // Undeclared exception!
      try { 
        binarySearchTree0.find(0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problems: 
         // \tAssertion cannot be resolved to a type
         // \tCase cannot be resolved to a type
         //
         verifyException("intkey.BinarySearchTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      // Undeclared exception!
      try { 
        binarySearchTree0.remove(441);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problems: 
         // \tAssertion cannot be resolved to a type
         // \tCase cannot be resolved to a type
         //
         verifyException("intkey.BinarySearchTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      // Undeclared exception!
      try { 
        binarySearchTree0.spex_M_find((-1461));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problems: 
         // \tAuto cannot be resolved to a type
         // \tThe method pre(boolean) is undefined for the type BinarySearchTree
         // \tThe method pre(boolean) is undefined for the type BinarySearchTree
         // \tThe method post(boolean) is undefined for the type BinarySearchTree
         //
         verifyException("intkey.BinarySearchTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      // Undeclared exception!
      try { 
        binarySearchTree0.findMin();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problems: 
         // \tAssertion cannot be resolved to a type
         // \tCase cannot be resolved to a type
         //
         verifyException("intkey.BinarySearchTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      binarySearchTree0.makeEmpty();
      assertTrue(binarySearchTree0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BinarySearchTree binarySearchTree0 = new BinarySearchTree();
      // Undeclared exception!
      try { 
        binarySearchTree0.findMax();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problems: 
         // \tAssertion cannot be resolved to a type
         // \tCase cannot be resolved to a type
         //
         verifyException("intkey.BinarySearchTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        BinarySearchTree.main(stringArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problems: 
         // \tAssertion cannot be resolved to a type
         // \tCase cannot be resolved to a type
         //
         verifyException("intkey.BinarySearchTree", e);
      }
  }
}
