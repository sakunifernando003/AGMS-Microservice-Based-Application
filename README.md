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
Automated-Greenhouse-Management-System/
│
├── docs/
│   └── eureka-dashboard.png          # Screenshot showing all services registered (status: UP)
│
├── frontend/
│   └── agms-client/                  # Frontend application (React - optional UI)
│
├── infrastructure/
│   ├── api-gateway/                  # Spring Cloud Gateway (Port: 8080)
│   ├── config-server/                # Centralized Config Server (Port: 8888)
│   └── service-registry/             # Eureka Server for service discovery (Port: 8761)
│
├── microservices/
│   ├── zone-service/                 # Zone Management (Spring Boot - Port: 8081)
│   ├── sensor-service/               # Sensor Data Fetcher (Python/Flask - Port: 8082)
│   ├── automation-service/           # Rule Engine (Node.js - Port: 8083)
│   └── crop-service/                 # Crop Lifecycle Management (Node.js - Port: 8084)
│
├── config-repo/                      # Centralized YAML configurations for all services
│
├── Postman Collection/
│   └── AGMS.postman_collection.json # API testing collection
│
└── README.md                         # Project documentation

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

