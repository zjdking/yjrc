
pkill -9 -f "yjrc-0.0.1-SNAPSHOT"
sleep 2

nohup java -Xms10m -Xmx100m -jar yjrc-0.0.1-SNAPSHOT.jar  >> /usr/local/yjrc-0.0.1-SNAPSHOT.out 2>&1 &
echo "yjrc start success"
