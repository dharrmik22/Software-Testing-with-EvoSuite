/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 09 00:47:18 GMT 2021
 */

package intelement;

import org.junit.Test;
import static org.junit.Assert.*;
import intelement.Overflow;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Overflow_ESTest extends Overflow_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Overflow overflow0 = new Overflow();
  }
}
