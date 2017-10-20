#!/bin/bash

echo $APPLICATION_NAME
echo $LIFECYCLE_EVENT

cd /tmp
nohup java -jar target/sample-1.1.jar > /dev/null 2>&1 &
