pipeline {
    agent any
    stage {
        stage {'Clone Repo'} {
            sh "export AWS_DEFAULT_REGION=us-east-1"
            sh "aws cloudformation create-stack --stack-name CloudFormation1 --template-body file://CloudFormation1.yml --region 'us-east-1'"
        }
    }
}
