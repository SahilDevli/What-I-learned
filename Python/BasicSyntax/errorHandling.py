var1 = 10

try :
    res = var1 / 0
except ZeroDivisionError:
    print('zero division error')
else:
    print(var1)
finally:
    print('task completed!')