#!/bin/bash
directory=$(pwd)
for i in $(ls -d */) ;do 
	cd $directory/$i
	mvn clean
done
