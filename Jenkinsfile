pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'printenv'
            }
        }
    }
        
        post {
            always{
                sh 'cd $WORKSPACE'
                sh 'chmod +x replace.sh'
                sh './replace.sh'
            }
            success {
            githubNotify status: "SUCCESS", credentialsId: "jenkins-webhook", account: "ks-bnc", repo: "calculator-maven-ks-bnc", description: "wut"
        }
        failure {
            githubNotify status: "FAILURE", credentialsId: "jenkins-webhook", account: "ks-bnc", repo: "calculator-maven-ks-bnc", description: "wut"
        }
        }   
}
