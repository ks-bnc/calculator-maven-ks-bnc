echo ${WORKSPACE}
chmod +x replace.sh
pwd
echo 'copying files to destination'
cp -a ${WORKSPACE}/. /var/lib/jenkins/workspace/osszemasolos
echo 'done'
echo 'tesztallomany torlese'
rm -rf /var/lib/jenkins/workspace/osszemasolos/src/test
echo 'done'
echo 'jo tesztallomany beillesztese a projektbe'
cp -r /var/lib/jenkins/workspace/multiscm-pipeline-good-test-source/src/test /var/lib/jenkins/workspace/osszemasolos/src
echo 'done'
echo 'amugy lehet ketto kornyezeti valtozo kellene, egy a first source-nak egy pedig a secondnek ahol ossze masolodik az allomany.. amugy.. pre-build'
