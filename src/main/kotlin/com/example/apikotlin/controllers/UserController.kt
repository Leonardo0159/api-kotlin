package com.example.apikotlin.controllers

import com.example.apikotlin.models.User
import com.example.apikotlin.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(@Autowired private val userService: UserService) {

    @GetMapping
    fun getAllUsers(): ResponseEntity<List<User>> = ResponseEntity.ok(userService.findAll())

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): ResponseEntity<User> =
        userService.findById(id)?.let { ResponseEntity.ok(it) }
            ?: ResponseEntity(HttpStatus.NOT_FOUND)

    @PostMapping
    fun createUser(@RequestBody user: User): ResponseEntity<User> = ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user))

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: Long): ResponseEntity<Void> {
        userService.deleteById(id)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }
}
