

count = 0

def digits_count(num):
    global count

    if(num!=0):
        count+=1
        return digits_count(num//10)

    return count

num1=4666
num2=544
num3=121317
num4=0
num5=12345
num6=1289396387328
print("Count of digits in ",num1, " is ",digits_count(num1))
# print("Count of digits in ",num2, " is ",digits_count(num2))
# print("Count of digits in ",num3, " is ",digits_count(num3))
# print("Count of digits in ",num4, " is ",digits_count(num4))
# print("Count of digits in ",num5, " is ",digits_count(num5))
# print("Count of digits in ",num6, " is ",digits_count(num6))


