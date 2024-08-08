package com.example.apikotlin.services

import com.example.apikotlin.models.User
import com.example.apikotlin.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(@Autowired private val userRepository: UserRepository) {

    fun findAll(): List<User> = userRepository.findAll()

    fun findById(id: Long): User? = userRepository.findById(id).orElse(null)

    fun save(user: User): User = userRepository.save(user)

    fun deleteById(id: Long) = userRepository.deleteById(id)
}
