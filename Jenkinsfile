pipeline {
    agent any
    
    tools {
    maven "MAVEN"
    jdk "JDK"
    }
    
    stages {
    stage('Checkout')
    {
    steps {
    git branch: 'main', url: 'https://github.com/Sirusthevirus/Comp367Lab2Q2.git'
            }
        }
    stage('Maven Build') {
    steps {
			bat "mvn clean compile"
            }
        }
    }
}