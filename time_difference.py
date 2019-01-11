#find_time_diff
H1,M1=map(int,input().split())
H2,M2=map(int,input().split())

T1=H1*60+M1
T2=H2*60+M2
T=0
if T1>T2:
	T=T1-T2
else:
	T=T2-T1
mins=T
if mins<60:
		print(hours, mins)
else:
	temp=mins
	hours=temp//60
	mins=mins%60
	if mins<60:
		print(hours, mins)
