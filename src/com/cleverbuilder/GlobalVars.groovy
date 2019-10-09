#!/usr/bin/env groovy
package com.cleverbuilder

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo
   
   void test(String str)
   {
      println("Executing test method from GlobalVars: "+ str);
   }
}
