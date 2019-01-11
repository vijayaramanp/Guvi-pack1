#Vetri_sort_array
N=int(input())
arr=[int(i) for i in input().split()]
m=sorted(arr)
st=''
for i in m:
	st=st+str(i)+" "
print(st.strip())
