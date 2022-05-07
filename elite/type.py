import pyautogui
import time

time.sleep(5)
with open('temp.java') as f:
    lines = f.readlines()
    for line in lines:
        line = line.replace('    ', '')
        pyautogui.typewrite(line, interval=0.02)

pyautogui.hotkey('shiftleft', 'shiftright', 'pagedown', 'delete')
