#!/usr/bin/env groovy
package com.cleverbuilder

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo
   
   void test(str)
   {
      sh "echo 'Executing test method from GlobalVars:'  ${str}"
   }
}
