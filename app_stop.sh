#!/bin/bash

echo $APPLICATION_NAME
echo $LIFECYCLE_EVENT

kill -9 $(ps aux | grep sample | grep -v grep | awk '{print $2}')
