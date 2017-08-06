package templates

class PiplineRequestTemplate {
    static void create(job, config) {
        job.with {
            logRotator(30, -1, 1, -1)
            definition {
                cpsScm {
                    scm {
                        git{
                            branch('**/master')
                            remote {
                                url('https://github.com/jenkinsci/job-dsl-plugin.git')
                            }
                        }
                        scriptPath('jenkinsfile')
                    }
                }
            }
        }
    }
}