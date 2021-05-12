echo ${WORKSPACE}
chmod +x replace.sh
pwd
echo 'delete test source'
rm -rf ${WORKSPACE}/src/test
echo 'done'
echo 'insert the good test source to the project'
cp -r /var/lib/jenkins/workspace/multiscm-pipeline-good-test-source/src/test ${WORKSPACE}/src
echo 'done'
echo 'the test source's replacement successed'
