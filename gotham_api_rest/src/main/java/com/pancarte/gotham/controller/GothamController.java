package com.pancarte.gotham.controller;

import com.pancarte.gotham.repository.ClockRepository;
import com.pancarte.gotham.repository.RoleRepository;
import com.pancarte.gotham.repository.UserRepository;
import com.pancarte.gotham.service.UserService;
import com.pancarte.gotham.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GothamController {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final UserService userService;
    private final ClockRepository clockRepository;

    @Autowired
    public GothamController(@Qualifier("roleRepository") RoleRepository roleRepository, @Qualifier("userRepository") UserRepository userRepository, UserService userService,@Qualifier("clockRepository") ClockRepository clockRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.userService = userService;
        this.clockRepository = clockRepository;
    }

    @RequestMapping(value = {"/createUser"}, method = RequestMethod.GET)
    public void createUser(@RequestParam("last_name") String lastName, @RequestParam("first_name") String firstName, @RequestParam("email") String email, @RequestParam("password") String password) {
        User user = new User();
        user.setLastName(lastName);
        user.setFirstName(firstName);
        user.setEmail(email);
        user.setPassword(password);

        userService.saveUser(user);
    }

    @RequestMapping(value = {"/queryUsers"}, method = RequestMethod.GET)
    public List<User> queryAllUser() {

        return userRepository.findAll();
    }

    @RequestMapping(value = {"/queryUserById"}, method = RequestMethod.GET)
    public String queryUserById(@RequestParam("id_user") int idUser) {

        return "";
    }

    @RequestMapping(value = {"/updateUserById"}, method = RequestMethod.GET)
    public String updateUserById(@RequestParam("id_user") int idUser) {

        return "";
    }

    @RequestMapping(value = {"/deleteUserById"}, method = RequestMethod.GET)
    public String deleteUserById(@RequestParam("id_user") int idUser) {

        return "";
    }

    @RequestMapping(value = {"/clockInUserById"}, method = RequestMethod.GET)
    public String clockInUserById(@RequestParam("id_user") int idUser) {
        //todo:lors de a connetion creer insert date in and set clock out empty

        return "";
    }

    @RequestMapping(value = {"/clockOutUserById"}, method = RequestMethod.GET)
    public String clockOutUserById(@RequestParam("id_user") int idUser) {
        //todo:update  clock out empty
        return "";
    }
}
