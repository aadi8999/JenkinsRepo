pipeline {
    agent any

    environment {
        AWS_DEFAULT_REGION = 'us-east-1'  // Setting the AWS region as an environment variable
    }

    stages {
        stage('Clone Repo') {
            steps {
                script {
                    // Assuming you have a repository to clone
                    //sh 'git clone https://github.com/your-repo.git'
                    
                    // Create a CloudFormation stack
                    sh 'aws cloudformation create-stack --stack-name CloudFormation1 --template-body file://CloudFormation1.yml --region us-east-1'
                }
            }
        }
    }
}
