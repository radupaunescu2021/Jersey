# Jersey


Currency converter

This is a Java REST and TCP server which communicates with a curency exchange server though xml.
When a client requests currency parity the server responds with the result in JSON format.When the client does a GET request it must
also authenticate with the REST server with  Basic access authentication.Username:user , password:password.


Examples:
REST: curl -X GET -H 'Authorization: Basic dXNlcjpwYXNzd29yZA==' -i http://localhost:8080/Converter3/webapi/curs/USD

TCP: netcat locahost:9000
