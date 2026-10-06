#!/usr/bin/env bash
set -e
[ -d backup-producao ] || { echo "backup inexistente"; exit 1; }
rm -rf producao-simulada; cp -R backup-producao producao-simulada; echo "ROLLBACK: concluido"
