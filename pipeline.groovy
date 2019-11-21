pipeline {
	agent any
	stages {
		stage("runningB") {
			echo "running groovy file"
		}
	}
}