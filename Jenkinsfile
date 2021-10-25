pipeline {
    agent any
    
    environment{
mavenHome = tool 'myMaven'
}
    tools {
    maven 'myMaven'
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
                echo 'homongyammaaa na'
            }
        }
        
        stage('Build') {
            steps {
                echo 'Building.'
                sh 'mvn package'
            }
        }
        stage('Test') {
            steps {
                //sh 'mvn test'
                sh 'printenv'
            }
        }
    }
        
        post {
            success {
            githubNotify status: "SUCCESS", credentialsId: "jenkins2", account: "ks-bnc", repo: "calculator-maven-ks-bnc", description: "wut", sha: "${GIT_COMMIT}"
        }
        failure {
            githubNotify status: "FAILURE", credentialsId: "jenkins2", account: "ks-bnc", repo: "calculator-maven-ks-bnc", description: "wut", sha: "${GIT_COMMIT}"
        }
        }   
}
