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
                                credentials('gitub-ci-test')
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