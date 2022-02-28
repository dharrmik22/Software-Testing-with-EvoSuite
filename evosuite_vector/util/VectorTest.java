package util;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import junit.framework.TestCase;
import edu.ksu.cis.projects.bogor.kiasan.test.Util;
import edu.ksu.cis.projects.bogor.kiasan.translator.Method;
import edu.ksu.cis.projects.bogor.kiasan.util.VerySimpleFormatter;

public class VectorTest extends TestCase {
   public void initLogging() throws Exception{
        Handler fh = new FileHandler("cvcl.log");
        fh.setFormatter(new SimpleFormatter());
        Logger.getLogger("edu.ksu.cis.santos.util.theoremprover").addHandler(fh);
        Logger.getLogger("edu.ksu.cis.santos.util.theoremprover").setLevel(Level.ALL);
        Handler fhvm = new FileHandler("vmtrace.log");
        fhvm.setFormatter(new VerySimpleFormatter());
        Logger.getLogger("edu.ksu.cis.projects.bogor.kiasan.util").addHandler(fhvm);
        Logger.getLogger("edu.ksu.cis.projects.bogor.kiasan.util").setLevel(Level.ALL);
    }

    public void testConstructor() throws Exception {
//        initLogging();
        Util
            .testBogorVM(
                "util.Vector",                
                "kunit.bogor-conf",               
                new Method("util.Vector",
                        "<init>",
                        "(II)V",
                        false),true,false);                
    }   
    public void testAdd() throws Exception {
      Util
          .testBogorVM(
              "util.Vector",                
              "kunit.bogor-conf",               
              new Method("util.Vector",
                      "add",
                      "(Ljava/lang/Object;)Z",
                      false),true,false);                
  }   
    public void testInsertElementAt() throws Exception {
        Util
            .testBogorVM(
                "util.Vector",                
                "kunit.bogor-conf",               
                new Method("util.Vector",
                        "insertElementAt",
                        "(Ljava/lang/Object;I)V",
                        false),true,false);                
    }   
    public void testEnsureCapacity() throws Exception {
        Util
            .testBogorVM(
                "util.Vector",                
                "kunit.bogor-conf",               
                new Method("util.Vector",
                        "ensureCapacity",
                        "(I)V",
                        false),true,false);                
    } 
 public void testIndexOf() throws Exception {
 Util
     .testBogorVM(
         "util.Vector",                
         "kunit.bogor-conf",               
         new Method("util.Vector",
                 "indexOf",
                 "(Ljava/lang/Object;I)I",
                 false),true,true);                
} 
 public void testLastIndexOf() throws Exception {
     Util
         .testBogorVM(
             "util.Vector",                
             "kunit.bogor-conf",               
             new Method("util.Vector",
                     "lastIndexOf",
                     "(Ljava/lang/Object;I)I",
                     false),true,true);                
    } 
 public void testRemoveElementAt() throws Exception {
     Util
         .testBogorVM(
             "util.Vector",                
             "kunit.bogor-conf",               
             new Method("util.Vector",
                     "removeElementAt",
                     "(I)V",
                     false),true,false);                
    } 
}
