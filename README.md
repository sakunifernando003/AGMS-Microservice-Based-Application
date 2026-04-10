# 🌱 Automated Greenhouse Management System (AGMS)

## 📌 Overview
The Automated Greenhouse Management System (AGMS) is a cloud-native, microservices-based platform designed to simulate intelligent greenhouse management. The system integrates with an external IoT provider to fetch real-time environmental data and automatically triggers actions to maintain optimal conditions for crops.

---

## 🏗️ Architecture
This project follows a **Microservices Architecture** using Spring Boot and Spring Cloud.

### 🔧 Infrastructure Services
- Config Server – Centralized configuration management
- Eureka Server – Service discovery and registration
- API Gateway – Single entry point and routing

### 🌿 Domain Microservices
- Zone Service – Manage greenhouse zones and thresholds
- Sensor Service – Fetch and handle sensor data
- Automation Service – Apply rules and trigger actions
- Crop Service – Manage crop lifecycle

---

## 🔄 System Workflow
1. Sensor Service fetches environmental data from external IoT API  
2. Automation Service processes data using predefined rules  
3. Zone Service provides threshold values  
4. Actions are triggered (e.g., Fan ON, Heater ON)  
5. Crop Service tracks plant lifecycle  

---

## 🔐 Security
- JWT-based authentication handled at API Gateway level  
- All incoming requests are validated before routing  

---

## ⚙️ Technologies Used
- Java (Spring Boot)
- Spring Cloud (Eureka, Gateway, Config)
- REST APIs
- Maven
- Git & GitHub

---

## 📁 Project Structure
AGMS/
├── config-server
├── eureka-server
├── api-gateway
├── zone-service
├── sensor-service
├── automation-service
├── crop-service
├── config-repo

---

## 🚀 How to Run (Recommended Order)
1. Start Config Server  
2. Start Eureka Server  
3. Start API Gateway  
4. Start all Microservices  

---

## 🧪 API Testing
- Postman can be used to test all endpoints  
- Example endpoints:
  - `/api/zones`
  - `/api/sensors/latest`
  - `/api/automation/process`
  - `/api/crops`

---

## 📸 Eureka Dashboard
All services are registered and visible in the Eureka dashboard.

---

## 📌 Notes
This project demonstrates a distributed system design using microservices architecture and cloud-based configurations.

---

## 👩‍💻 Author
Sakuni Fernando

