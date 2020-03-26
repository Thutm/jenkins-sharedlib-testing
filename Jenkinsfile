@Library('sharedlib@master') _

/*
    Basic global functions, that do not consume anything from
    src directories.
*/

pipeline {
    agent any
    stages {
        stage('Example Build') {
            steps {
                log.info 'Passing into global function'

                uselog.info 'Passing into global function that uses another global function'

                usesrc.info 'Passing into global function that uses src code'
            }
        }
    }
}