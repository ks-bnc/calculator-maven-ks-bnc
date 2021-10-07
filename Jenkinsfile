def podTemplate = """
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: jenkins
    image: maven:3.8.3-jdk-11
    command:
    - sleep
    args:
    - infinity
    volumeMounts:
      - name: workspace-volume
        mountPath: /home/jenkins/agent
    workingDir: "/home/jenkins/agent"
  volumes:
      - name: "workspace-volume"
        persistentVolumeClaim:
          claimName: "jenkins-claim"
          readOnly: false
"""
pipeline {
    agent none
    stages {
        stage("Parallel") {
            parallel {
                stage("1.jenkins") {
                    agent {
                        kubernetes {
                            yaml podTemplate
                            defaultContainer 'jenkins'
                        }
                    }
                    steps {
                        sh """
                            mvn clean package
                        """
                    }
                }

            }
        }
    }
}
