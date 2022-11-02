# A101-FinalCase / Hepsiburada.com

This project is created for A101TestOtomasyonPracticum - Patika. The aim is to perform e-commerce UI testing using simple Selenium & TestNG. The tested webside is `hepsiburada.com`.

**Desired test steps:**
```
1. Kullanıcı girişi yapılarak sepete ürün eklenmesi
   - Kullanıcı Hepsiburada.com sitesini ziyaret eder.
   - Kullanıcı giriş işlemi yapılır.
   - Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır.
   - Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
   - Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
   - Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
   - Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.

2. Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
   - Kullanıcı Hepsiburada.com sitesini ziyaret eder.
   - Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
   - Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
   - Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.
```
---

**Test with Maven**
```
mvn test
```

- *If maven used for run the project, the report will be saved in `target/surefire-reports`.*
- *If testng.xml used for run the project, the report will be saved in `test-output`.*
---

**Used Technologies:**
- Java
- Selenium
- TestNG
- Maven

**Used Maven Libraries:**
- selenium-java
- selenium-support
- selenium-chrome-driver
- webdrivermanager
- testng
- surefire-report-parser
