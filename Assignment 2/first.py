from datetime import time
import time

from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

serv_obj = Service("../../../Downloads/chromedriver_win32/chromedriver.exe")
driver = webdriver.Chrome(service=serv_obj)
driver.get('https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjgwMTEyMjcyLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D')
time.sleep(10)
act_title=driver.title
exp_title='facebook'
if act_title==exp_title:
    print("login test pass")
else:
    print("failed")
driver.find_element(By.ID, 'email').send_keys('9974133011')
driver.find_element(By.ID, 'pass').send_keys('Sanu@1234')
driver.find_element(By.NAME, 'login').click()
time.sleep(10)
search_input = driver.find_element(By.XPATH, '//input[@placeholder="Search Facebook"]')
search_input.send_keys('purva')
time.sleep(15)
driver.find_element(By.ID, 'dir_nav_sts:100007096781423').click()
time.sleep(5)
driver.maximize_window()

#for linkedin
driver = webdriver.Chrome(service=serv_obj)
driver.get('https://www.linkedin.com/')
driver.find_element(By.ID, 'session_key').send_keys('parekhsanu7215@gmail.com')
driver.find_element(By.ID, 'session_password').send_keys('vGSPe79TZPpAT@h')
#driver.find_element(By.XPATH, "//button[@type='submit']").click()
time.sleep(10)
#driver.find_element(By.XPATH, "//input[@placeholder='Search']").send_keys('Shaip')