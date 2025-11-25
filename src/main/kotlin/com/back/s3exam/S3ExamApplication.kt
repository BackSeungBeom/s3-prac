package com.back.s3exam

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class S3ExamApplication

fun main(args: Array<String>) {
    runApplication<S3ExamApplication>(*args)
}
