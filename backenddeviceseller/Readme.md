# Sprint Boot Device Seller

## End points

### Sing-up

````
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Cache-Control: no-cache
Postman-Token: 0af25bcb-59b1-0065-5978-362019853371

{
"name": "admin",
"username": "admin",
"password": "admin"
}
````
### Sign-in
````
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Cache-Control: no-cache
Postman-Token: a1e2a69c-98f4-0eaa-142e-23e453dd5514

{
	"username" :"user",
	"password":"user"
}
````
### Change-Role
````
PUT /api/user/change/USER HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOiJST0xFX0FETUlOIiwidXNlcklkIjoxLCJleHAiOjE2NDA3MTkxODN9.krmoMgpAu6bA8T_gmkpl0XjjPkOrlAmecsHpd39RzckXqkobmmvya4rYTzNJ4GvORi-yvrLHFp-mXqU1eM8GpQ
Cache-Control: no-cache
Postman-Token: 9b333dfb-cf1b-32f7-13b5-09962c33de35
Content-Type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW

------WebKitFormBoundary7MA4YWxkTrZu0gW
Content-Disposition: form-data; name="token"

eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOiJST0xFX1VTRVIiLCJ1c2VySWQiOjEsImV4cCI6MTY0MDcxNjM0OH0.w3DZObF1eWMBHWfX2uCYN9duN96YQw5ZDAZeTy6_58s_W0bAwdVwpVim-3BZdKpsPvwlVJDPSjfZku5TrbgLLQ
------WebKitFormBoundary7MA4YWxkTrZu0gW--
````

### Save device
````
POST /api/device/ HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOiJST0xFX0FETUlOIiwidXNlcklkIjoxLCJleHAiOjE2NDA3MTcyNjh9.KWTq1PNbRhDwaCOMTOF5vZH1vBxtRtFJvDvO8mEKAkNZbaTvPhJBZ9L6a8mrB0vZHvXNnTCapSpFaTrpDKn5Ag
Cache-Control: no-cache
Postman-Token: 1ee9e279-dee3-fdd8-9581-9b6473b48be5

{
	"name": "device-2",
	"description": "Des device-2",
	"price": 9,
	"deviceType": "LAPTOP"
}
````

### Get all devices
````
GET /api/device/ HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOiJST0xFX0FETUlOIiwidXNlcklkIjoxLCJleHAiOjE2NDA3MTcyNjh9.KWTq1PNbRhDwaCOMTOF5vZH1vBxtRtFJvDvO8mEKAkNZbaTvPhJBZ9L6a8mrB0vZHvXNnTCapSpFaTrpDKn5Ag
Cache-Control: no-cache
Postman-Token: f6e0cfc0-0284-3077-c2e2-3b00272304bc
````

### Delete device
````
DELETE /api/device/1 HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOiJST0xFX0FETUlOIiwidXNlcklkIjoxLCJleHAiOjE2NDA3MTc3NDJ9.lfN5gDComR4C-w36eyGgbYN70KEQVr02GWMlvvSiUDI6RvFfxOcJ6wWy71dG5TeoDej1lWwjDiMdi7T0HPI8OQ
Cache-Control: no-cache
Postman-Token: 9547808f-db8d-45d6-65ec-a87f66e52649

{
	"name": "device-2",
	"description": "Des device-2",
	"price": 9,
	"deviceType": "LAPTOP"
}
````

### Save purchase
````
POST /api/purchase HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOiJST0xFX1VTRVIiLCJ1c2VySWQiOjEsImV4cCI6MTY0MDcxOTQzOX0.KKhhcXVpmNZTGaGcZkDlHQs7Tv7R2rMKlQnNjkKSD9FvftDNmJq668tlVyGmyih0WUIbo6NDIjIm2vX_u2SijQ
Cache-Control: no-cache
Postman-Token: 60c289a6-215f-b8c6-62f2-bc3a4513f94b

{
	"userId" : 1,
	"deviceId":2,
	"price": 9,
	"color": "blue"
}
````

### Get all purchases
````
GET /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOiJST0xFX1VTRVIiLCJ1c2VySWQiOjEsImV4cCI6MTY0MDcxOTQzOX0.KKhhcXVpmNZTGaGcZkDlHQs7Tv7R2rMKlQnNjkKSD9FvftDNmJq668tlVyGmyih0WUIbo6NDIjIm2vX_u2SijQ
Cache-Control: no-cache
Postman-Token: 9fc2692b-9569-43af-94a1-5e9a0e9e1be9
````