package com.zbogdan.app.shifttest.dao

import com.zbogdan.app.shifttest.models.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserDAO : CrudRepository<User, Int>