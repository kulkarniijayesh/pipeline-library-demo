#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "test: Hello, ${name}."
}

def test(String name = 'human') {
  echo "test: executing test from sayHello"
}

def mapTest(map values) {
  echo "${values.name}"
}
