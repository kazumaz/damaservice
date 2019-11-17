package com.dama.damaService

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("domain", "application", "infrastructure") //TOD　ここ間違ってそう
class DamaServiceApplication

fun main(args: Array<String>) {
	runApplication<DamaServiceApplication>(*args)
}
