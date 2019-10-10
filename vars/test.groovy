def call(String name)
{
  echo "executing test for ${name}"
}

def anotherTest(Map testVariables)
{
  echo "executing another test with variables: "
  echo "${test-name}"
}
