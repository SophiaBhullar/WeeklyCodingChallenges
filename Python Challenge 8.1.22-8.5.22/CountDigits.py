
def digits_count(num):

    if(num<=9):
        return 1
    else:
        return 1 + digits_count(num/10)


number=[4666,544,121317,0,12345,1289396387328]
for x in number:
    print("Count of digits in ",x, " is ",digits_count(x))


