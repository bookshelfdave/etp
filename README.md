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

### Example

```
ETPTuple tuple = (ETPTuple)ETP.parse(
                "{mylist, [1,2,3,4], \n" +
                 "my_string, \"Hello world\"}");
        ETPAtom atom = (ETPAtom)tuple.getValue().get(0);
        System.out.println("Atom = " + atom);

        // use getValue() to access the list of terms
        ETPList list = (ETPList)tuple.getValue().get(1);
        for(ETPTerm v : list.getValue()) {
            System.out.println("  List item " + v);
        }
        ETPAtom my_string_atom = (ETPAtom)tuple.getValue().get(2);
        System.out.println(my_string_atom);

        ETPString s = (ETPString)tuple.getValue().get(3);
        System.out.println(s.getValue()); // getValue() gets the "raw" value
        System.out.println(s.toString()); // toString() gets the string representation
```

yields the following output:

```
Atom = mylist
  List item 1
  List item 2
  List item 3
  List item 4
my_string
Hello world
"Hello world"
```

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
