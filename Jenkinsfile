@Library('sharedlib@master') _

pipeline {
    agent none
    stages {
        stage ('Example') {
            steps {
                log.info 'Passing into global function'

                // uselog.info 'Passing into global function that uses another global function'

                // usesrc.info 'Passing into global function that uses src code'
            }
        }
    }
}