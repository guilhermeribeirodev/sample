#!/bin/bash

cd /tmp
nohup java -jar sample-1.0-jar-with-dependencies.jar &
echo $APPLICATION_NAME
echo $LIFECYCLE_EVENT