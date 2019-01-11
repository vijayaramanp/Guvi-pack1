# find string len without space
x=input()
length=len(x)
arr=x.split()
length=length-(len(arr)-1)
print(length)
