GIỚI THIỆU VỀ ĐĂNG KÝ TOUR VỚI 4 SERVER 
server lịch trình --> server phương tiện --> server khách sạn --> server dịch vụ

run:   .\mvnw.cmd spring-boot:run
stop: Ctrl + C 
truy cập thư mục : cd tenthumuc
lùi về thư mục gốc : cd..
lịch trình :  http://localhost:8081
phương tiện:  http://localhost:8082
khách sạn:    http://localhost:8083
dịch vụ:      http://localhost:8084


## Công nghệ sử dụng

- Ngôn ngữ: Java 25
- Framework: Spring Boot
- Giao diện: Thymeleaf, HTML, CSS, JavaScript, Bootstrap
- Cơ sở dữ liệu: PostgreSQL
- Công cụ quản trị CSDL: pgAdmin 4
- Kiểm thử API: Postman
- Quản lý mã nguồn: Git, GitHub
- Build tool: Maven

## 4. Cấu trúc thư mục

```text
dangkytour/
├── serverlichtrinh/
├── serverphuongtien/
├── serverkhachsan/
├── serverdichvu/
├── README.md
└── .gitignore
```

## 5. Hướng dẫn triển khai

1. Cài đặt JDK 25.
2. Cài đặt PostgreSQL.
3. Mở từng server bằng Visual Studio Code.
4. Cấu hình kết nối cơ sở dữ liệu trong từng server.
5. Khởi chạy các server theo cấu hình cổng đã thống nhất.
6. Kiểm tra giao tiếp giữa các server bằng Postman.

## 6. Thành viên thực hiện

