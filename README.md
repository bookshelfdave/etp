etp
===

Erlang Term Parser

# Status

  I wrote it in a couple hours, it might need some love. 

# Building

You'll need Maven to build etp.

	mvn package

# Usage


	EPTTerm com.metadave.etp.ETP.parse(String s)

	EPTTerm com.metadave.etp.ETP.parse(InputStream is)

An etp term is made up of any of these classes:

- ETPTerm (abstract)	
- ETPAtom
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


# Rendering

Call `toString()` on a `ETPTerm` object will render a valid Erlang term to a `String`.


# TODO

	$\n
	2#101
	etc
	
#License

http://www.apache.org/licenses/LICENSE-2.0.html

---

© 2013 Dave Parfitt
