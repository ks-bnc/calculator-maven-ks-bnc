pipeline {
    agent any
    
    environment{
mavenHome = tool 'myMaven'
}
    tools {
    maven 'M3'
  }

    stages {
        stage('Replace student source') {
            steps {
                echo 'step'
                //sh 'cd $WORKSPACE'
                //sh 'chmod +x replace.sh'
                //sh './replace.sh'
               // sh 'mvn clean install'
               // sh 'mvn -version'
            }
        }
        
        stage('Build') {
            steps {
                echo 'Building.'
                sh 'mvn clean package'
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
            githubNotify status: "SUCCESS", credentialsId: "jenkins-webhook", account: "kiss.bence.599@gmail.com", repo: "calculator-maven-ks-bnc", description: "wut", sha: "${GIT_COMMIT}"
        }
        failure {
            githubNotify status: "FAILURE", credentialsId: "jenkins-webhook", account: "kiss.bence.599@gmail.com", repo: "calculator-maven-ks-bnc", description: "wut", sha: "${GIT_COMMIT}"
        }
        }   
}
