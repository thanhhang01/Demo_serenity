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
@ui @Login
Feature: Đăng nhập hệ thống

    Scenario: Đăng nhập thành công
#        Given Người dùng ở trang đăng nhập
#        When Người dùng nhập username là "admin" và password là "1234"
#        And Người dùng nhấn nút "ĐĂNG NHẬP"
#        Then Hệ thống chuyển đến trang chủ
        Given Người dùng ở trang đăng nhập
        When Người dùng nhập username là "admin" và password là "123456"
        And Người dùng nhấn nút "ĐĂNG NHẬP"
        Then Hệ thống hiển thị nút đăng xuất
        When Người dùng nhấn nút đăng xuất
        Then Hệ thống chuyển đến trang chủ

    @Login_OK
#    Scenario: Không nhập username và password
#        Given Người dùng ở trang đăng nhập
#        When Người dùng không nhập username và không nhập password
#        And Người dùng nhấn nút "ĐĂNG NHẬP"
#        Then Hệ thống hiển thị thông báo lỗi "Vui lòng nhập tên đăng nhập và mật khẩu"


    Scenario: Bỏ trống thông tin đăng nhập
        Given Người dùng ở trang đăng nhập
        When Người dùng không nhập gì
        And Người dùng nhấn nút "ĐĂNG NHẬP"
        Then Hệ thống hiển thị thông báo lỗi "Tên đăng nhập và mật khẩu không hợp lệ, bạn nhập lại !"
