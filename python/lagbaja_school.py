def student_grade():
	student = int(input("Enter number of student: "))
	subject = int(input("Enter number of subjct: "))
     
	scores = [[0]*subject]*student

	print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>")
	print("Saved Successfully")
	print(scores)
	
	for index in range(student):
		for count in range(subject):
	
			score = -1
			while score < 0 or score > 100:
				print("student ", index +1, "subject ", count +1)
				score = int(input("Enter score : "))
				scores[index -1][count-1]= scores
	
	print("=====================================================================================")
	print("STUDENT        ")
	for count in range(student):
		sub = count
	print("SUB",sub,"	")

	print("TOTAL		AVERAGE		POSITION")
	print("==============================================================================================")
	print("")
		
		








print(student_grade())
