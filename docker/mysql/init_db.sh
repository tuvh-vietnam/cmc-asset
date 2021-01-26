#!/bin/bash
/usr/bin/mysqld_safe --skip-grant-tables &
sleep 5
mysql -u root -e "CREATE DATABASE cmc-asset"
mysql -u root cmc-asset < /tmp/create_db.sql
mysql -u root cmc-asset < /tmp/insert_data.sql