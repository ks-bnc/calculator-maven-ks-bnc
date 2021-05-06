cd ${WORKSPACE}/multiscm-pipeline
chmod +x replace.sh
pwd
echo 'copying files to destination'
cp -a ${WORKSPACE}/multiscm-pipeline/. ${WORKSPACE}/osszemasolos
echo 'done'
echo 'tesztallomany torlese'
'rm -rf $WORKSPACE/osszemasolos/src/test '
echo 'done'
echo 'jo tesztallomany beillesztese a projektbe'
'cp -r /var/lib/jenkins/workspace/multiscm-pipeline-good-test-source/src/test /var/lib/jenkins/workspace/osszemasolos/src'
echo 'done'
'curl -i localhost:8000'
echo 'done'
