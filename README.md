# Supplier Management API

## Prerequisites

1. **Database Setup**
    - Configure the database connection details in `application.properties`.

2. **Spring Boot Application**
    - Run the Spring Boot application. The default port is `8080`.

## Access API Endpoints

**Base URL:** `http://localhost:8080/api/supplier`

### 1. Query Suppliers

**URL:** `POST /api/supplier/query`

**Description:** Retrieves a list of suppliers based on the provided query criteria and optional pagination parameters.

**cURL Command:**
curl -X POST "http://localhost:8080/api/supplier/query" \
     -u user:password \
     -H "Content-Type: application/json" \
     -d '{
           "location": "Austin",
           "natureOfBusiness": "SMALL_SCALE",
           "manufacturingProcess": "PRINTING_3D"
         }'

**Authorization:**
- **Type:** Basic Auth
- **Username:** `user`
- **Password:** `password`

**Request Body:** JSON payload containing the query criteria and pagination details.

**Request Body Example:**

```json
{
  "location": "Austin",
  "natureOfBusiness": "SMALL_SCALE",
  "manufacturingProcess": "PRINTING_3D"
}
