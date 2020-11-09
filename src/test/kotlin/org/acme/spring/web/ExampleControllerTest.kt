package org.acme.spring.web

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
class ExampleControllerTest {

    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/springweb/hello")
          .then()
             .statusCode(200)
             .body(`is`("hello"))
    }

}