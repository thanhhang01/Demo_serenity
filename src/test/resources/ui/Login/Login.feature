#Step (login folder) -> step definition (java) login
#@ui @Login
#Feature: Test login
#    Scenario: Test loading login page
#        Given I opened chrome browser
#            When I go to opencart login page
#                Then I see login page
#
#    @Login_OK
#    Scenario: Test loading login page 2
#        Given I opened chrome browser
#        When I go to opencart login page
#        Then I see login page
#    @Login_NO
#    Scenario: Test loading login page 3
#        Given I opened chrome browser
#        When I go to opencart login page
#        Then I see login page

Feature: Đăng nhập hệ thống

    Scenario: Đăng nhập thành công
        Given Người dùng ở trang đăng nhập
        When Người dùng nhập username là "20A4802010027" và password là "Hangmon11@@"
        And Người dùng nhấn nút "ĐĂNG NHẬP"
        Then Hệ thống chuyển đến trang chủ


    Scenario: Không nhập username và password
        Given Người dùng ở trang đăng nhập
        When Người dùng không nhập username và không nhập password
        And Người dùng nhấn nút "ĐĂNG NHẬP"
        Then Hệ thống hiển thị thông báo lỗi "Vui lòng nhập tên đăng nhập và mật khẩu"
