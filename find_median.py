#Vetri_find_median
N=int(input())
arr=[int(i) for i in input().split()]
m=sorted(arr)
med=0
if N%2==1:
	med=m[N//2]
else:
	med=(m[N//2-1]+m[N//2])/2
	
print(med)
