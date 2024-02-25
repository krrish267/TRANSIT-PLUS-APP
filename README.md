# Hackathon 2024


# Transit Plus
This repository contains the code developed during the DevClub Hackathon, where my team and I built a Winnipeg Transit application from scratch within 24 hours. Leveraging various technologies and APIs, we created an intuitive and efficient solution to enhance the transit experience for users in Winnipeg. Explore the code to see our collaborative efforts in rapid prototyping, problem-solving, and innovative design

## Team :- Seg Fault

1. Dharm Patel 
2. Hrutil Patel
3. Tanha Patel 
4. Krish Patel 
5. Dhariya Kachhia 

![https://media3.giphy.com/media/hQDl7aB6HwkfNnx5T7/giphy.gif?cid=7941fdc6v63naa84irr61zpak2c8zz8sthxsjzdkbtfh8vgj&ep=v1_gifs_search&rid=giphy.gif&ct=g](https://media3.giphy.com/media/hQDl7aB6HwkfNnx5T7/giphy.gif?cid=7941fdc6v63naa84irr61zpak2c8zz8sthxsjzdkbtfh8vgj&ep=v1_gifs_search&rid=giphy.gif&ct=g)

## Features

---



2. Feature:- Stop near me 
    
    → Description :- user will able to know which stops are near me based on their longitude and latitude 
    
    → Priority :- High 
    
3. Feature :- Search Bar  
    
    → Description :- user will able to search the bus stop based on the area name 
    
    → Priority :- Medium 
    
4. Feature :- When to leave 
    
    → Description :- based on the time estimate user will be informed when to leave from their current location, so they don’t have to wait for their second bus. 
    
    → Priority :- High 
    
5. Feature :- Trip Planning 
    
    → Description :- user will select where he wants to go and based on that a trip will be planned. 
    
    → Priority :- High 
    
    
7. Feature :-  e-ticket 
    
    → Description: User will able to purchase the e-ticket online and will get QR code 
    
    → Priority :- High 

8. Feature :- Weather

   -> Description : User will able to see the weather when they will open dashboard

   -> Priority :- High

## Formula

---

```java
- One min for one stop to another stop
- Average speed 54
- A min per stop

int estimateTime = 0.9km * number of stops/ 54 km/h
```

## Data

---

- We did API calls from Winnipeg Transit API and Weather API, which offers real-time data updates.
