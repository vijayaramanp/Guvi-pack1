#print_time_in_hours_minutes
mins=int(input())
hours=0
if mins<60:
		print(hours, mins)
else:
	temp=mins
	hours=temp//60
	mins=mins%60
	if mins<60:
		print(hours, mins)
