# count numeric
x=input()
count=0
for i in x:
	if i.isnumeric():
		count+=1

print(count)
