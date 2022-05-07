testcase = int(input())
while testcase > 0:
    num = int(input())
    result = "21"*(num//3)
    if num % 3 == 1:
        result = "1" + result
    elif num % 3 == 2:
        result = result + "2"
    print(result)
    testcase -= 1
