package templates

class PiplineRequestTemplate {
    static void create(job, config) {
        job.with {
            logRotator(30, -1, 1, -1)
            definition {
                cpsScm {
                    scm {
                        git{
                            credentials('gitub-ci-test')
                            branch('**/master')
                            remote {
                                url('https://github.com/baiyongzhen/SpringBootTest.git')
                            }
                        }
                        scriptPath('jenkinsfile')
                    }
                }
            }
        }
    }
}