#print_with_index
N=int(input())
arr=[int(i) for i in input().split()]
for a in range(0,len(arr)):
	print(arr[a],a)
