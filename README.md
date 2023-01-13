# SPRINGBOOT_SHINHANDS_WEEK_5-2
![image](https://user-images.githubusercontent.com/72481546/212363686-b2b066b5-3082-49c2-abfc-102ade261b08.png)


# Cách Spring Data JPA hoạt động:

## Application Modules
Đầu tiên, Repository được tiêm vào trong service. 
Repository sẽ chịu trách nhiệm giao tiếp với các DB, thiết bị lưu trữ, xử lý query và trả về các kiểu dữ liệu mà tầng Service yêu cầu
Reposity được thiết kế dựa trên các interface do đó cần phải implement nó thông qua Reposity Impl.

## O/R Mapper
Tiếp theo, Trước khi thao tác với DB ta phải mapping dữ liệu trong Java với DB bằng Hibernate. 
Hibernate thực thi theo phương thức JPA, nó mapping dữ liệu và tạo DAO (Data Access Object) để giao tiếp với DB. 
Bên cạnh đó, hibernate kế thừa các phương thức Spring Data JPA để sử dụng các method xây dựng sẳn.


## JDBC interfaces
Bên dưới hibermate đang sử dụng JDBC để để kết nối đến database và thực thi các lệnh SQL được nó tạo ra. 
Do đó, ta tạo kết nối với DB thông qua JDBC API để kết nối và thực thi các câu lệnh SQL xuống database và cấu hình để connect đến datasource

## JDBC implementations
JDBC cần được thực thi thông qua JBDC driver để đảm bảo cho JDBC API kết nối đến database mà nó cần. Đối với mỗi database sẽ có JDBC driver riêng mà JDBC API có thể chỉ định để làm việc với nó.

## Persistence layer
Persistence layer sẽ là cầu nối để giao tiếp với các lớp chứa dữ liệu trong database (cụ thể là CSDL quan hệ Oracle.....). Tại đây JDBC sẽ thực thi truy vấn đến data trong CSDL này.
