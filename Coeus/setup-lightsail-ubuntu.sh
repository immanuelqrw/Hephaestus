sudo apt-get update
sudo apt-get install \
    apt-transport-https \
    ca-certificates \
    curl \
    software-properties-common -y
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
sudo add-apt-repository \
   "deb [arch=amd64] https://download.docker.com/linux/ubuntu \
   $(lsb_release -cs) \
   stable"
sudo apt-add-repository ppa:certbot/certbot -y
sudo apt-get update -y
sudo apt-get install docker-ce -y
sudo apt-get install docker-compose -y
sudo apt-get install certbot -y
docker --version

# ! replace domain
DOMAIN=domain
WILDCARD=*.$DOMAIN

echo $DOMAIN && echo $WILDCARD

sudo certbot -d $DOMAIN -d $WILDCARD --manual --preferred-challenges dns certonly
