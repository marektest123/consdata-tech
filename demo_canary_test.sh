#!/usr/bin/env bash
for ((i=1;i<=1000;i++)); do
curl --header "Connection: keep-alive" "http://canary.127.0.0.1.nip.io/";
sleep 0.3;
echo -e
done
