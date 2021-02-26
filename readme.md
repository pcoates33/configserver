spring cloud config server

simple example to help reproduce actuator/refresh problem

* configserver is set to use native profile, so, change the searchLocations in bootstrap.yml of configserver project
to match the actual location on your machine 
* configserver starts on port 8888

has config/simple-service.yml file which holds config for simple-service