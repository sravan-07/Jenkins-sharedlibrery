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
    stage('Nexus-Upload')
    {
       nexus_upload()
    }
}
