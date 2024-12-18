pipeline {
    agent any
    stage {
        stage {'Clone Repo'} {
            sh "export AWS_DEFAULT_REGION=us-east-1"
            sh "aws cloudformation create-stack --stack-name CloudFormationStack --template-body file://CloudFormationStack.yml --region 'us-east-1'"
        }
    }
}
