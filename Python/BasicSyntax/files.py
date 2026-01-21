f = open("abc.txt","r")

# data = f.read()             # .read() -> return all data from file
# dataTill = f.read(5)        # .read(index_value) -> return all data to index
line1 = f.readline()       # .readline() -> return all data from file

# print(type(data))
# print(dataTill)
print(line1)

f.close()

# fw = open("abc.txt","w")
fw = open("abc.txt","a")

fw.write("\nAppend demo text.")

fw.close()



# import pandas as pd
# df = pd.read_csv('diet.csv')
# print(df)


# # ======================>>>>>>>>  CSV file  <<<<<<<<<<================

# import csv
# with open("/Users/sahildevli/Documents/python/BasicPythonSyntax/diets.csv", 'r') as file1:
#     reader = csv.reader(file1)
#     next(reader)  # skip header
#     for row in reader:
#         print(row)



# # ================>>>>>>>>>>>  TEXT FILE <<<<<<<<<=======================

# # for .txt file in python

# file = open("/Users/sahildevli/Documents/python/BasicPythonSyntax/abc.txt", 'r')
# contect = file.readlines()
# for line in contect:
#     print(line.strip())

# # write mode cleare the present data of text file and write new content provide to writter
# # with open("/Users/sahildevli/Documents/python/BasicPythonSyntax/abc.txt", 'w') as fileWriter: 
# #     fileWriter.write("This is new line")
# #     fileWriter.write("\nSecond line")

# # to add data afte the present data in file we have to use append 'a'
# with open("/Users/sahildevli/Documents/python/BasicPythonSyntax/abc.txt", 'a') as fileWriter: 
    # fileWriter.write("\nappended line")