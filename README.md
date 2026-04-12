# Assignment 2 – Physical & Logical Data Structures (Banking System)

**Name:** Anurbek Nurkadyr
**Group:** Nurkadyr

I completed the assignment step by step, task by task.


**Task 1** was straightforward — I created a BankAccount class 
and used LinkedList to store accounts. The hardest part was 
understanding how LinkedList stores objects, but once I got it, 
the rest made sense.

<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/ec475049-68f5-4cfd-817d-08bc2f438c27" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/e46c9c05-cfc9-4178-b058-f4b24581676c" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/bb50298f-88b4-4367-88ce-dc48f2a5af94" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/4d1aec71-33d4-4011-aee9-8b53e304005e" />


**Task 2** was an extension of Task 1. Adding deposit and withdraw 
methods taught me how to update objects inside a LinkedList by 
searching first and then modifying the value directly.

Update AccountManager.java
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/b20e9b59-8e64-4c66-9286-48a60328a1c1" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/5f4016f5-54be-4d74-a991-144fc019b7fa" />

Update Main.java
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/0f62010e-2592-439e-84e5-693215291d96" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/ed569338-f20f-4aa3-8415-7f26537f2d7f" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/33bee063-b316-4a37-b3ba-b81d93689aa5" />


**Task 3** introduced Stack. I used it to store transaction history. 
The LIFO concept clicked for me here — the last thing you did is 
the first thing you can undo, just like Ctrl+Z.

Add TransactionManager.java
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/fa8a97d5-4d12-4caa-8f45-ab137b626156" />

Update Main.java
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/475c751c-af9a-4475-aaf2-327caa3fdeff" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/08a2318c-5988-4572-8efa-b778a564ebef" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/9b5f024b-f352-43b4-93ad-001e3da57c33" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/9c68ea3b-816d-4953-9ccb-cfe6ad93a147" />

**Task 4** was about Queue for bill payments. FIFO made total sense 
here — the first bill added should be the first one processed, 
exactly like a real queue at a bank.

Add BillQueueManager.java
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/5b7a7148-21ba-4e76-8a81-479d4fab5ef3" />

Update Main.java
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/f4516787-788d-4d88-bb0c-d3e3cb38270f" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/8a1dffec-c59d-48d2-b8b3-46f232af508f" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/9a068d42-3128-4219-8710-119f308b7a48" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/047dc674-3da5-4899-9d6b-919a0399cc27" />
<img width="421" height="352" alt="image" src="https://github.com/user-attachments/assets/b9e269ba-321e-402e-a685-64408497ba31" />

**Task 5** was the most interesting one. I simulated an admin 
workflow where a user submits an account request, and the admin 
processes it from a queue. This felt like a real system.

Add AccountRequestManager.java
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/95f2ecba-2012-4d76-b91a-2de2bfc5a2fb" />

Update Main.java
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/1ecf3df5-b728-4906-9882-d156e2d925b6" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/2219bf89-17bc-46b0-b2f7-afced659fe05" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/bde07828-31b2-422d-baaa-62600b5e42e2" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/d7fe73ac-7805-4cef-b6ae-07023f861d08" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/6d1c56b4-03a2-45e6-91bf-413f73dd6a91" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/519d4452-b9f9-49f4-b7a9-6390749c0e2f" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/e195c150-f116-49f9-bf12-7a8859a93365" />


**Task 6** showed the difference between physical and logical 
structures. Using a fixed-size array made it clear why dynamic 
structures like LinkedList are more flexible in real applications.

Add BankSystem.java
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/e23ef170-8dc0-4fd4-8404-15f9d87555ef" />

Update Main.java
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/587f5849-55ca-4739-9ed1-63b74b66c639" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/eba8f798-34f2-4d49-95a7-f09f5f8e8aa4" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/20120a09-d2f8-44a4-8b38-0addcf5bc341" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/48032b08-4b80-48b0-ba2a-ef791be210e9" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/c519cd1e-7e86-4b93-9466-037f11545023" />


**Part 3** tied everything together into one menu-driven program 
with Bank, ATM, and Admin sections. This was the most 
challenging part because I had to make sure all the structures 
worked together without conflicts.

Update Main.java 
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/21dd3411-4dae-4c66-a0be-ccd2655f8b3b" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/7d9fdbbd-92fe-49cf-ab17-38b3f52f4818" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/939500b0-b218-4a76-90da-b6758b38ed8c" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/aa230290-d71a-47dc-82e3-16bff45d2cf1" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/1bf3f231-c707-48d8-a68e-904c75cd144a" />
![Uploading image.png…]()


## Conclusion

This assignment helped me understand that choosing the right 
data structure matters. Stack is perfect for undo operations, 
Queue is ideal for ordered processing, and LinkedList gives 
flexibility when the size of data is unknown. I will apply 
this thinking in future projects.
