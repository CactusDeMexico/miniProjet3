# MyERP


#### Docker était sous windows. L'adresse Ip par défaut est 192.168.99.100 sous windows.

Il y a xxx machine:
 


## Organisation du répertoire

*   
`doc` : documentation
*   `docker` : répertoire relatifs aux conteneurs _docker_ utiles pour le projet
    
*   `dev` : environnement de développement

*   `gotham_api_rest` : code source de Api rest


## 
Environnement de développement

Les composants nécessaires lors du développement sont disponibles via des conteneurs _docker_.
L'environnement de développement est assemblé grâce à _docker-compose_
(cf docker/dev/docker-compose.yml).


Il comporte :

*   une base de données _PostgreSQL_ contenant un jeu de données de démo (`postgresql://127.0.0.1:9032/db_myerp`)





### Lancement

    

cd docker/dev
    
docker-compose up




### Arrêt

    

cd docker/dev
    
docker-compose stop




### Remise à zero

    

cd docker/dev
    
docker-compose stop

docker-compose rm -v
    
docker-compose up


