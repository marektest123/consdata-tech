oc new-project consdata-tech
oc apply -f canary/deployment-canary.yml
oc apply -f canary/service-canary.yml
mvn versions:set -DnewVersion=2.0.0
mvn versions:commit
mvn clean package
oc start-build consdata-tech-demo-s2i --from-dir=target  --follow
oc tag consdata-tech-demo:latest consdata-tech/consdata-tech-demo:canary
oc apply -f canary/route-canary.yml
