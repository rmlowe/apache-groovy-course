import groovy.sql.GroovyRowResult
import groovy.sql.Sql

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/twitter", "twitter", "password", "com.mysql.jdbc.Driver")
println "Connected!"

sql.execute 'DROP TABLE IF EXISTS kiwis'
sql.execute '''
CREATE TABLE kiwis (
    id INT NOT NULL,
    beak_size INT NOT NULL,
    iq INT NOT NULL,
    PRIMARY KEY (id)
  );
'''

sql.execute 'INSERT INTO kiwis (id, beak_size, iq) VALUES (1, 10, 80)'
sql.execute 'INSERT INTO kiwis (id, beak_size, iq) VALUES (2, 12, 70)'

List<GroovyRowResult> rows = sql.rows('SELECT * FROM kiwis')
println rows

def file = new File('kiwis.csv')
file.write('ID,Beak size,IQ\r\n')

rows.forEach { row ->
    file.append("${row.id},${row.beak_size},${row.iq}\r\n")
}

sql.close()
println "Completed!"