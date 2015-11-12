Java client library for Insightly web API (v2.2)

The Insightly Java SDK enables Java developers to quickly integrate their applications with the Insightly REST API (version 2.2).

The library handles low level communication, authentication, and encoding to minimize learning curve and debugging overhead for new users. The library provides the ability to read/write/delete all major Insightly objects, including:

Contacts Events Organizations Opportunities Projects Leads Events Emails Notes

The Insightly Java SDK is implemented as a standard Maven project. To install it, simply run

mvn install
from the project root.

To use the Insightly Java SDK in your own project, simply include the following dependency in your pom.xml:

<dependency>
  <groupId>com.insightly</groupId>
  <artifactId>insightly-java-api</artifactId>
  <version>0.1.0-SNAPSHOT</version>
</dependency>

com.insightly insightly-java-api 0.1.0-SNAPSHOT

The library is currently in beta (first version uploaded on Nov 11th, 2015)
