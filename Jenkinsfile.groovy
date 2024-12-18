pipeline {
    agent any

    environment {
        AWS_DEFAULT_REGION = 'us-east-1'
    }

    stages {
        stage('Clone Repo') {
            steps {
                git branch: 'master', url: 'https://github.com/aadi8999/JenkinsRepo.git', credentialsId: 'aadi8999'
            }
        }

        stage('Deploy CloudFormation Stack') {
            steps {
                sh 'aws cloudformation create-stack --stack-name CloudFormationStack --template-body file://CloudFormation1.yml --region us-east-1'
            }
        }
    }
}
