# special chars count
y=input()
count=0
for i in y:
	if i.isnumeric() or i.isalpha():
		continue
	else:
		count+=1

print(count)
