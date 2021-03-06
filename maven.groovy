library 'sharedfile'
node
{
    stage('checkout')
    {
        code_checkout()
    }
    stage('build')
    {
       code_build()
    }
    stage('SonarScanner')
    {
        sonar_scanner()
    }
    stage('Nexus-Upload')
    {
       nexus_upload()
    }
    stage('Nexus-Download')
    {
       nexus_download()
    }
}
