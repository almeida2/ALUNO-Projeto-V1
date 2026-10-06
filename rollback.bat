@echo off
if not exist backup-producao (echo backup inexistente & exit /b 1)
if exist producao-simulada rmdir /s /q producao-simulada
xcopy backup-producao producao-simulada /E /I /Q >nul
echo ROLLBACK: concluido
