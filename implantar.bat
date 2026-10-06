@echo off
if exist backup-producao rmdir /s /q backup-producao
if exist producao-simulada xcopy producao-simulada backup-producao /E /I /Q >nul
if exist producao-simulada rmdir /s /q producao-simulada
mkdir producao-simulada
xcopy out\main\* producao-simulada\ /E /I /Q >nul
echo IMPLANTACAO: concluida
