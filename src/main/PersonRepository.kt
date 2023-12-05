package com.example.h2ormhybernate

import com.example.h2ormhybernate.com.example.h2ormhybernate.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person, Long>
