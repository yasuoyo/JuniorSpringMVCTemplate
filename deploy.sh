#!/bin/bash
#rsync -avz web/target/JuniorSpringMVCTemplate.war  member@tentop.com.cn:/opt/tomcat8/webapps/JuniorSpringMVCTemplate.war
#rsync -avz web/target/JuniorSpringMVCTemplate.war  member@haomo-tech.com:/data/tomcat/webapps/JuniorSpringMVCTemplate.war

rsync -avz -e "ssh -p12322" web/target/JuniorSpringMVCTemplate.war haomo@haomo-studio.com:/opt/hm_tomcat/webapps