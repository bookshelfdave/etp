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
ETPAtom atom = (ETPAtom)tuple.getValue(0);
System.out.println("Atom = " + atom);

ETPList list = (ETPList)tuple.getValue(1);
// use getValue() to access the list of terms
for(ETPTerm v : list.getValue()) {
    System.out.println("  List item " + v);
}
ETPAtom my_string_atom = (ETPAtom)tuple.getValue(2);
System.out.println(my_string_atom);

ETPString s = (ETPString)tuple.getValue(3);
System.out.println(s.getValue()); // getValue() gets the "raw" value
System.out.println(s.toString()); // toString() gets the string representation

// you can set values on the ETP structure and call toString() to render
// a new Erlang term
atom.setValue("new_atom_value");
list.getValue().add(new ETPInteger(100));
System.out.println(tuple.toString());
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
{new_atom_value,[1,2,3,4,100],my_string,"Hello world"}
```

### Status

  Comments and whitespace are lost during parse, however I should be able to reconstruct these with Antlr.

### Building

You'll need Maven to build etp.

	mvn package


### Rendering

Call `toString()` on a `ETPTerm` object will render a valid Erlang term to a `String`.


### TODO

	$\n
	2#101
	Sontatype OSS
	Retain comments + whitespace on a separate Antlr token stream
	Pretty print

### Contributing

Fork this repo, create a branch with

	git checkout -b your_branch_name
	
Submit a pull request when your code is ready for review.	
### License

http://www.apache.org/licenses/LICENSE-2.0.html

---

© 2013 Dave Parfitt
