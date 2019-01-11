#fibonacci series
n=int(input())
nth=0
n1=1
n2=1
res=""
for i in range(n):
	res=res+str(n1)+' '
	nth=n1+n2
	n1=n2
	n2=nth
print(res.strip())
