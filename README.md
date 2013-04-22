## ETP: An Erlang Term Parser for Java. 

Given a String of Erlang terms, ETP will parse the string into a tree of ETP Java objects.

### Usage

	EPTTerm com.metadave.etp.ETP.parse(String s)

	EPTTerm com.metadave.etp.ETP.parse(InputStream is)

An etp term is made up of any of these classes:

- ETPTerm (abstract)	
- ETPAtom
- ETPQuotedAtom
- ETPBinary
- ETPBoolean
- ETPDouble
- ETPFun
- ETPInteger
- ETPList
- ETPPid
- ETPRef
- ETPString
- ETPTerm
- ETPTuple

### Status

  Etp parses a Riak app.config file without breaking a sweat.

### Building

You'll need Maven to build etp.

	mvn package


### Rendering

Call `toString()` on a `ETPTerm` object will render a valid Erlang term to a `String`.


### TODO

	$\n
	2#101
	etc
	
### License

http://www.apache.org/licenses/LICENSE-2.0.html

---

© 2013 Dave Parfitt
