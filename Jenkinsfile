pipeline {
    agent any

    stages {
        stage('Replace student source') {
            steps {
                echo 'step'
                //sh 'cd $WORKSPACE'
                //sh 'chmod +x replace.sh'
                //sh './replace.sh'
            }
        }
        
        stage('Build') {
            steps {
                echo 'Building.'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
                sh 'printenv'
            }
        }
    }
        
        post {
            success {
            githubNotify status: "SUCCESS", credentialsId: "webhook", account: "ks-bnc", repo: "calculator-maven-ks-bnc", description: "wut", sha: "${GIT_COMMIT}"
        }
        failure {
            githubNotify status: "FAILURE", credentialsId: "webhook", account: "ks-bnc", repo: "calculator-maven-ks-bnc", description: "wut", sha: "${GIT_COMMIT}"
        }
        }   
}
