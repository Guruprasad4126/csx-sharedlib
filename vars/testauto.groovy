def call(String No_of_threads = 'a', String Environment = 'a') {


pipeline {
  environment { 
		Number_of_threads = "${No_of_threads}"
                Environment       = "${Environment}"
	}
    agent any
   
    stages {
        stage ('Functional test'){
            steps {
		    sh "echo Number of threads executed in parallel is ${Number_of_threads}"
		   sh "echo Test Completed in success in ${Environment}"
                sleep 5
                }
            }
        stage('Integration test') {
                    steps {
			sh "echo Test Completed in success in ${Environment}"
                        sleep 5
                        }
                    }
       
        stage ('Security test'){
            steps {
		    sh "echo Selenium Test Completed in success in ${Environment}"
                sleep 5
                }
            }
        }    
    }
}
