import mysql.connector

mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  passwd="",
  database="Chinook"
)

mycursor = mydb.cursor()

mycursor.execute("SELECT * FROM customers WHERE State = 'Texas' AND FirstName = 'Jane'")

myresult = mycursor.fetchall()

for x in myresult:
  print(x)