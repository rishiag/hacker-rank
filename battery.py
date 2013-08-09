import csv


f=open('trainingdata.txt','r')
#print f
#print f.read()
csv_reader=csv.reader(f)
a=[]
b=[]
for row in csv_reader:
  a.append(row[0])
	b.append(row[1])

#a=numpy.array(a)
#b=numpy.array(b)

#print a
#print b
a=map(float, a)
c= sum(a)/100
b=map(float, b)
d=sum(b)/100

#print c
#print d

e = float(raw_input())
if e<4.00:
	print 2*e
else:
	print 8.00
