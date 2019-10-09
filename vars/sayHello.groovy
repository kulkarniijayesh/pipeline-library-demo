#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "test: Hello, ${name}."
}

def test() {
  echo "test: executing test from sayHello"
}
