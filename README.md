
## Deploying the app to OpenShift

This project shows a simple Spring Boot “Hello World” app running on OpenShift.

You can deploy it in two main ways:

1. Using the `oc` CLI and the `deployment.yaml file`
2. Using the OpenShift web console (UI)

The `deployment.yaml` file contains everything: image build, deployment, service, and route.



## **1. Deploy using the CLI (`oc apply`)**

### Required
* OpenShift Developer Sandbox account
* A Terminal
* `oc` command-line tool installed
* login via terminal `oc login --token=sha256... --server=https://api.rm2.thpm.p1.openshiftapps.com:6443`
### Getting started

* `git clone https://github.com/Rufus100Procent/openshift-learning.git`
* `cd openshift-learning` folder
* `oc apply -f deployment.yaml`

### Verify
#### Check that the pod is running
 * `oc get pods -l app=learning-openshift`

#### Get the Route URL
* `oc get route learning-openshift -o jsonpath='{.spec.host}{"\n"}'`

#### Copy the printed host name into your browser:
* `http://<your-route-host>/`

You should see: Hello World-1!

### Removing (destroying) the application

* `oc delete -f deployment.yaml`
#### Verify removal

* `oc get pods -l app=learning-openshift`