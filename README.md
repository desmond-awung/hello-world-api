# Hello World API

![GitHub repo size](https://img.shields.io/github/repo-size/dawungayi/hello-world-api)
![GitHub contributors](https://img.shields.io/github/contributors/dawungayi/hello-world-api)
![GitHub stars](https://img.shields.io/github/stars/dawungayi/hello-world-api?style=social)
![GitHub forks](https://img.shields.io/github/forks/dawungayi/hello-world-api?style=social)

Hello World API is a REST API that returns a greeting object to a client. This greeting can be customized to a specific name based on query parameters passed. This is built with Spring Boot 2.4.0., using [Spring Initializr](https://start.spring.io/). This project follows the [Spring RESTful Web Service tutorial](https://spring.io/guides/gs/rest-service/), as describe in [Dan Vega's Youtube Tutorial](https://www.youtube.com/watch?v=MWLe1tqPmUo). 

## Prerequisites

Before you begin, ensure you have met the following requirements:

* Java 8 JDK: https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
* All Spring Boot dependencies are included in this project.


## Installing Hello World API

To install Hello World API, follow these steps to clone this repo on your system:
```
git clone https://github.com/dawungayi/hello-world-api.git
```

## Using Hello World API

To use Hello World API, follow these steps:
* Open terminal in Mac OSX / Linux or command prompt in Windows. In the root directory of this project, start the API on port 8080 by running:

```
java -jar target/rest-service-0.0.1-SNAPSHOT.jar
```

* Open Google Chrome/FireFox/Safari browser, and in the search bar, enter: 
```
http://localhost:8080/greeting
```
This will return a JSON like so:
```
{"id":2,"content":"Hello, World!"}
```

* To customize the greeting, add a query parameter to the url as follows:
```
http://localhost:8080/greeting?name=Peter
```
Output:
```
{"id":11,"content":"Hello, Peter!"}
```

* Note that the id increments every time you refresh the page / change the query parmeter.
* If using a Chrome, I would recommend a JSON parser extension for more better readibility of the output JSON data, like this one: [JSONView](https://chrome.google.com/webstore/detail/jsonview/chklaanhfefbnpoihckbnefhakgolnmc). 

## Contributors
Thanks to the following people who have contributed to this project:
* [@dawungayi](https://github.com/dawungayi)

## Contact

If you want to contact me you can reach me at <dawungayi@gmail.com>.

## License

This project uses the following license: [MIT](https://opensource.org/licenses/MIT).