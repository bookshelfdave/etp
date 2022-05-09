## ETP: An Erlang Term Parser for Java. 

[![Build Status](https://travis-ci.org/metadave/etp.png)](https://travis-ci.org/metadave/etp)

Given a String of Erlang terms, ETP will parse the string into a tree of ETP Java objects. Calling toString() on an ETP object will render a tree as an Erlang term.

### Building

You'll need Maven to build etp.

	mvn package

Also, ETP is available via the [Sonatype OSS repository](https://oss.sonatype.org/index.html#nexus-search;quick~metadave):

```xml
<dependency>
  <groupId>com.github.metadave</groupId>
  <artifactId>etp</artifactId>
  <version>0.6-SNAPSHOT</version>
</dependency>
```




### Usage

	EPTTerm com.metadave.etp.ETP.parse(String s)

	EPTTerm com.metadave.etp.ETP.parse(InputStream is)

An ETP term is made up of any of these classes:

- ETPTerm (abstract base class for all other ETP objects)	
- ETPAtom
- ETPQuotedAtom
- ETPBinary
- ETPBoolean
- ETPDouble
- ETPFun
- ETPLong
- ETPList
- ETPPid
- ETPRef
- ETPString
- ETPTerm
- ETPTuple


### Rendering

Call `toString()` on a `ETPTerm` object will render a valid Erlang term to a `String`. *Note* - at the moment, 
ETP doesn't prevent you setting invalid values on an ETPTerm object. Validation coming soon.


### Grammar

Antlr 4 grammar [here](https://github.com/metadave/etp/blob/master/src/main/java/com/metadave/etp/ETP.g4)


### Example

```java
// at the moment, whitespace and comments between terms aren't retained
ETPTuple tuple = (ETPTuple)ETP.parse("{mylist, [1,2,3,4], \n" +
                                      "my_string, \"Hello world\"}");
// All ETP objects subclass ETPTerm
// you can use "instanceof" to see what the result of the parse is

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
list.getValue().add(new ETPLong(100));
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

### Status & TODO
- Javadocs, better documentation
- Term validation during setValue() to prevent bad terms from being rendered to a String.
- Comments and whitespace are lost during parse. Not sure if I'm going to bother.
- binding parse results to an object model
- $\n
- 2#101


### Contributing

Fork this repo, create a branch with

	git checkout -b your_branch_name
	
Submit a pull request when your code is ready for review.	
### License

http://www.apache.org/licenses/LICENSE-2.0.html

---

© 2014 Dave Parfitt
