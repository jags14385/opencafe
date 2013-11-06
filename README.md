opencafe
========

opencafe has been inspired from the OpenStack Community "OpenCafe" repo ( https://github.com/stackforge/opencafe ). This describes a design patern on how we can 
test Webservices & API in a domain driven manner efficiently.

I have implemented the design pattern in JAVA.

Terminology

Following are some notes on Open CAFE lingo and concepts.

Implementation

Although the engine can serve as a basic framework for testing, it's meant to be used as the base for the implementation of a product-specific testing framework.

Client / Client Method

A client is an "at-least-one"-to-"at-most-one" mapping of a product's functionality to a collection of client methods. Using a REST API as an example, a client that represents that API in CAFE will contain at least one (but possibly more) method(s) for every function exposed by that API. Should a call in the API prove to be too difficult or cumbersome to define via a single client method, then multiple client methods can be defined such that as a whole they represent the complete set of that API call's functionality. A client method should never be a superset of more than one call's functionality.

Behavior

A behavior is a many-to-many mapping of client methods to business logic, functioning as compound methods. An example behavior might be to POST content, perform a GET to verify the POST, and then return the verified data

Model

A model can be many things, but generally is a class that describes a specific data object. An example may be a collection of logic for converting an XML or JSON response into a data object, so that a single consumer can be written to consume the model.

Provider

This is meant to be a convenience facade that performs configuration of clients and behaviors to provide configuration-based default combinations of different clients and behaviors
