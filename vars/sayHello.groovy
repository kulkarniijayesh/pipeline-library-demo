#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
}

def test() {
  echo "Executing the test method."
}
