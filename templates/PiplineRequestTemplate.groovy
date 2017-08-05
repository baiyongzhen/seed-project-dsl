package templates

class PiplineRequestTemplate {
    static void create(job, config) {
        pipeline.with {
            agent any
            parameters {
                string(name: 'myInput', description: 'Some pipeline parameters')
            }
            stages {
                stage('Stage one') {
                    steps {
                        script {
                            echo "Parameter from template creation: " + templateParams.someParam
                        }
                    }
                }
                stage('Stage two') {
                    steps {
                        script {
                            echo "Job input parameter: " + params.myInput
                        }
                    }
                }
            }
        }
    }
}