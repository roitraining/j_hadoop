from pyhive import hive
host = 'localhost'
host = '192.168.249.170'
host = '127.0.0.1'
port = 10000
user = 'student'
password = 'student'
database = 'default'
cn = hive.Connection(host=host, port=port, username = user, password = password, database=database, auth='CUSTOM')
cur  = cn.cursor()
cur.execute('select * from regions')
print(cur.fetchall())
