FROM mysql:5.7
VOLUME ["/etc/mysql", "/var/lib/mysql"]

ADD asset-sql-data-create.sql /tmp/create_db.sql
ADD asset-sql-data-insert.sql /tmp/insert_data.sql

ADD init_db.sh /tmp/init_db.sh

RUN /tmp/init_db.sh