#!/usr/bin/env bash
set -e
rm -rf backup-producao; [ -d producao-simulada ] && cp -R producao-simulada backup-producao || true
rm -rf producao-simulada; mkdir producao-simulada; cp -R out/main/* producao-simulada/
echo "IMPLANTACAO: concluida"
