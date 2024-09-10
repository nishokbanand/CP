txt = input()
list1 = []
for ele in txt:
    if ele not in list1:
        list1.append(ele)
maxstr = txt[0]
for ele in txt:
    if txt.count(ele) >= txt.count(maxstr):
        maxstr = ele
sum = 0
for ele in list1:
    if ele != maxstr:
        sum += txt.count(ele)
