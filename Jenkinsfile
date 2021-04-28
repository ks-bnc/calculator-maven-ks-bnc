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
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
     }
        post {
            always{
                sh 'pwd'
                echo 'copying files to destination'
                sh 'sudo cp -a /var/lib/jenkins/workspace/multiscm-pipeline/. /var/lib/jenkins/workspace/osszemasolos'
                echo 'done'
                echo 'tesztallomany torlese'
                sh 'rm -rf /var/lib/jenkins/workspace/osszemasolos/src/test '
                echo 'done'
                echo 'jo tesztallomany beillesztese a projektbe'
                sh 'sudo cp -r /var/lib/jenkins/workspace/multiscm-pipeline-good-test-source/src/test /var/lib/jenkins/workspace/osszemasolos/src'
                echo 'done'
            }
        }
        
    
}
 
