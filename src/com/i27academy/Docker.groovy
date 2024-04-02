package com.i27academy.builds

class Docker {
    def jenkins
    Docker(jenkins) {
        this.jenkins = jenkins
    }

    //application build
    //docker build


    def buildApp() {
        jenkins.sh """#!/bin/bash
        echo "building the eureka application"
        mvn clean package -DskipTests=true
        """
    }

}