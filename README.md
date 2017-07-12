Simple installer for Camunda license key
=========================

This web application (WAR) can be deployed to your container running a container managed/shared engine.

It searches for a properties file 

* USER_HOME/.camunda/build.properties

containing the Camunda license key as property:

* camunda.license=****

Again
---------------
In order to configure the util create a file **USER-HOME/.camunda/build.properties**:

```
camunda.license=...(your camunda ee license key)...
```

Usage
------------------------

Just build the WAR and deploy it to your container - or download the WAR from our Nexus


License
-------

[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).
