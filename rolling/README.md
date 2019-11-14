oc cluster up
oc new-project consdata-tech
oc apply -f rolling-update/imageStream.yml 
oc apply -f rolling-update/build.yml
oc apply -f rolling-update/deployment.yml
mvn versions:set -DnewVersion=1.0.0
mvn versions:commit
mvn clean package
oc start-build consdata-tech-demo-s2i --from-dir=target  --follow
oc tag consdata-tech-demo:latest consdata-tech/consdata-tech-demo:prod
oc apply -f rolling-update/service.yml
oc apply -f rolling-update/route.yml
mvn versions:set -DnewVersion=1.0.1
mvn versions:commit
mvn clean package
