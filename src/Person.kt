package com.example.h2ormhybernate.com.example.h2ormhybernate


import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GernerativeType
import javax.persistence.Id

@Entity
data class Person (
  @Id
  @GeneratedValue
  val id: Long = 0,
  val name:String,
  val age: Int

  )