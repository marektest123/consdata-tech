#!/usr/bin/env bash
for ((i=1;i<=1000;i++)); do
curl --header "Connection: keep-alive" "http://consdata-tech-deployment.ib24.consdata.local/";
sleep 0.3;
echo -e
done
