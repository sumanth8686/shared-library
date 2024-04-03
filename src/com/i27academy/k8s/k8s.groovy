package com.i27academy.builds

class K8s {
    def jenkins
    K8s(jenkins) {
        this.jenkins = jenkins
    }
}

    def auth_login() {
        jenkins.sh """#!/bin/bash
        echo "entering authentication method for Gke cluster login"
        gcloud config set account <service account id>
        gcloud compute instances list
        
        """

    }