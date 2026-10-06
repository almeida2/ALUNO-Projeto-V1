@echo off
if exist out rmdir /s /q out
mkdir out\main
mkdir out\test
dir /s /b src\*.java > sources.txt
javac -d out\main @sources.txt
if errorlevel 1 exit /b 1
dir /s /b test\*.java > testsources.txt
javac -cp out\main -d out\test @testsources.txt
if errorlevel 1 exit /b 1
del sources.txt testsources.txt
echo BUILD: SUCESSO
