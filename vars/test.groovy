def call(String name)
{
  echo "executing test for ${name}"
}

def anotherTest(Map testVariables)
{
  echo "executing another test with variables: "
  //echo "${testVariables.param1}"
  
  for(param in testVariables)
  {
    echo ${param}
  }
}
