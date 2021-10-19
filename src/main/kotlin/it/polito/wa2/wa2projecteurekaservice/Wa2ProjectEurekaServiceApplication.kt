package it.polito.wa2.wa2projecteurekaservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class Wa2ProjectEurekaServiceApplication

fun main(args: Array<String>) {
    runApplication<Wa2ProjectEurekaServiceApplication>(*args)
}
