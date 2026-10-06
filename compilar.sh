#!/usr/bin/env bash
set -e
rm -rf out; mkdir -p out/main out/test
javac -d out/main $(find src -name "*.java")
javac -cp out/main -d out/test $(find test -name "*.java")
echo "BUILD: SUCESSO"
