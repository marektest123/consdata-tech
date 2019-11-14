#!/usr/bin/env bash
#oc delete project consdata-tech
#oc new-project consdata-tech
git reset --hard
oc delete all --selector app=consdata-tech-demo

