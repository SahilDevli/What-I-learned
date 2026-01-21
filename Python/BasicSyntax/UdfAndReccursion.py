#functions in python...
def fun1(v):
    if v<5 :
        print("Udf var value =",v)
        v += 1
        fun1(v)
    else:
        return

fun1(0)