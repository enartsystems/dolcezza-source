kubectl apply -f Deployment-core.yml
#kubectl create configmap my-postgres --namespace enartsystems1 --from-file=postgresql.conf
kubectl get secret regcred --namespace=default -o yaml | sed 's/namespace:.*/namespace: suinsitlabs/' | kubectl apply -f -
#kubectl apply -f DeployDiscovery.yml
#kubectl apply -f DeployCopernicus.yml
#kubectl apply -f DeployDefiant.yml
#kubectl apply -f DeployTitan.yml
#kubectl apply -f DeploymentBPMN.yml
#kubectl apply -f DeploymentAnalizer.yml
#kubectl apply -f solr.yml
#kubectl apply -f autoscaling.yml
#kubectl apply -f Ingress.yml
kubectl create secret generic regcred --namespace=suin-dolcezza --from-file=.dockerconfigjson=C:/Users/ManuelGonzalez/config.json --type=kubernetes.io/dockerconfigjson




