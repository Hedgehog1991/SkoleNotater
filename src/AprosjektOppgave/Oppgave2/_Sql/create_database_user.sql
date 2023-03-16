CREATE DATABASE Collective;

CREATE USER 'collective' IDENTIFIED BY 'collective';

GRANT ALL on Collective.* TO 'collective';