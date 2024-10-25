import os

f = open("Name.txt")
#print(f.read())
#print(f.readline())
#print(f.read(5))

for line in f:
    print(line)

f.close()  

if os.path.exists("new.txt"):
   os.remove("new.txt") 
else: 
    print("Does not exist")   