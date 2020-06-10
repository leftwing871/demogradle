#!/bin/bash

REPOSITORY=/var/lib/tomcat/webapps/

date >> /home/ec2-user/log-after.txt

rm -rf $REPOSITORY/*

cp /home/ec2-user/ROOT.war $REPOSITORY

sudo service tomcat restart
