N,A,D=raw_input().split()
i=1
ap_sum=0
temp=int(A)
while i<=int(N):
    ap_sum=ap_sum+temp
    temp=temp+int(D)
    i=i+1
print(ap_sum)
