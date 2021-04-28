pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean compile'
                // bat '.\mvnw clean compolie'
            }
        }
        stage('Test') {
            steps {
                //dir('SOURCE DIRECTORY') {
                //git url: 'https://github.com/ks-bnc/multiple-scm-1.git'
                //}
                //dir('TEST DIRECTORY') {
                //git url: 'https://github.com/ks-bnc/multiple-scm-2.git'
                //}
                sh 'mvn test'
                
            }
        }
        stage('post') {
            steps{
        post {
            always{
                junit '**/src/test/java/com/mkyong/hashing/AppTest.java'
            }
        }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
 
