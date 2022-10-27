pipeline {
    agent any
    
    tools {
    maven "apache-maven"
    jdk "JDK"
    }
    
    stages {
    stage('Checkout')
    {
    steps {
    git branch: 'main', url: 'https://github.com/Sirusthevirus/COMP367Lab2Q2.git'
            }
        }
    stage('Maven Build') {
    steps {
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
			bat "mvn clean compile"
            }
        }
    }
}