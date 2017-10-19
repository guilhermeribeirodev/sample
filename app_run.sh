#!/bin/bash

echo $APPLICATION_NAME
echo $LIFECYCLE_EVENT

cd /tmp
nohup java -jar sample-1.0-jar-with-dependencies.jar > /dev/null 2>&1 &
