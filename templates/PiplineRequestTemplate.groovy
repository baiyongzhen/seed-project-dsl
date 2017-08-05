package templates

class PiplineRequestTemplate {
    static void create(job, config) {
        pipelineJob('example-pipline1') {
            logRotator(30, -1, 1, -1)
            definition {
                cpsScm {
                    scm {
                        git('https://github.com/jenkinsci/job-dsl-plugin.git', '**/master')
                        scriptPath('jenkinsfile')
                    }
                }
            }
        }
    }
}