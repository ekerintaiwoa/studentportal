package com.studentportal.studentportal.services;


import com.studentportal.studentportal.model.User;
import com.studentportal.studentportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplem implements UserServiceInterface {

      @Autowired
    private UserRepository userRepository ;


      @Autowired
     // private PasswordEncoder  passwordEncoder ;


     public User saveUser(User user){

          //pass

         // user.setPassword(passwordEncoder.);

         return userRepository.save(user);

     }


   // method to update User , save can be used to update user
     public User updateUser(User user){

          return userRepository.save(user);
     }




     // delete a user


    public void deleteUser(int userId){


          userRepository.deleteById(userId);
    }



    public User findByUsername(String username){

      return  userRepository.findByUsername(username).orElse(null);

    }


    public List<User> findallUsers(){

      return userRepository.findAll();

    }


   public  Long numberofUsers( ){

          return userRepository.count();


   }


}
