pipeline {
   agent any

   stages {
      stage('Running B') {
         steps {
            echo 'Running groovy file'
         }
      }
   }
}