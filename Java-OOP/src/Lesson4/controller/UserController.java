package Lesson4.controller;

import Lesson4.model.User;

public interface UserController {
    <T extends User> User create(T user);


}
