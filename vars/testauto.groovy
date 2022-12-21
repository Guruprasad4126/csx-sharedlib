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
		   sh "echo 'Test Completed in success in ${Environment}"
                sleep 5
                }
            }
        stage('Integration test') {
                    steps {
			sh "echo Test Completed in success in ${Environment}"
                        sleep 10
                        }
                    }
       
        stage ('Security test'){
            steps {
		    echo '(Selenium Test Completed in success in "${Environment}")'
                sleep 5
                }
            }
        }    
    }
}
