#### How to iterate a Map using lambda in forEach loop
##### filename and method name: StreamGoupingByExample.java , customizedGpaGroupingBy()
##### Code:
      public static Map<String, List<Student>> customizedGpaGroupingBy() {
		 		 Map<String, List<Student>> studentGapGrouping = 
                                   StudentDataBase
                                   .getAllStudents()
                                   .stream()
                                   .collect(
                                   Collectors.groupingBy(stud -> stud.getGpa()>=5? "OUTSTANDING":"AVERAGE"));
		 return studentGapGrouping;
	 }

##### code in main( )
      customizedGpaGroupingBy().forEach((x, y) -> {
                               System.out.println(x + "  ");
                               y.forEach(a -> 
                               System.out.println("name= " + a.getName() + " gpa=" + a.getGpa()));
	});
      
##### OutPut: to remove square brackets and for clean output
		  AVERAGE                                   OUTSTANDING
		name= Adam gpa=3.6                     name= Dave gpa=6.0
		name= Jenny gpa=1.8                    name= Viccky gpa=7.0
		name= Emily gpa=4.0                    name= Gopal gpa=8.9
		name= Sophia gpa=3.5                   name= Vijay gpa=5.5
		name= James gpa=3.9
		  
		

### Java-8-Code Samples using  Lambda, Streams, Functional Interfaces etc.

#####  To avoid duplicate keys in Collectors.toMap() using List to Map with Key Mapper, Value Mapper and Merge Function and assign it to LinkedHashMap
~~~ 
    <T,K,U> Collector<T,?,Map<K,U>> toMap(Function<? super T,? extends K> keyMapper,
                                          Function<? super T,? extends U> valueMapper,
                                          BinaryOperator<U> mergeFunction)
~~~
##### Code :
~~~
  public static void main(String[] args) {
      List<Person> list = new ArrayList<>();
      list.add(new Person(100, "Mohan"));
      list.add(new Person(100, "Sohan"));
      list.add(new Person(300, "Mahesh"));
      LinkedHashMap<Integer, String> map =list.stream()
                                          .collect(Collectors.toMap(Person::getId, Person::getName, 
                                          (x, y) -> x+", "+ y, LinkedHashMap::new));
                                          map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
    }
~~~
***
 #####  To avoid duplicate keys in Collectors.toMap() using BinaryOperator and Supplier <br>OR List to Map with Key Mapper, Value Mapper, Merge Function and Map Supplier
~~~
 <T,K,U,M extends Map<K,U>> Collector<T,?,M> toMap(Function<? super T,? extends K> keyMapper,
                                                   Function<? super T,? extends U> valueMapper,
                                                   BinaryOperator<U> mergeFunction,
                                                   Supplier<M> mapSupplier)
~~~
##### Code :
~~~
 public static void main(String[] args) { 
    List<Person> list = new ArrayList<>();
    list.add(new Person(100, "Mohan"));
    list.add(new Person(100, "Sohan"));
    list.add(new Person(300, "Mahesh"));
    list.add(new Person(100, "Gopal"));
      
    Map<Integer, String> map = list.stream()
                              .collect(Collectors.toMap(Person::getId, Person::getName, (x, y) -> x + ", " + y));
                               map.forEach((x, y) -> System.out.println("Key: " + x + ", value: " + y));
  }
  ~~~
 Parameters | Description
 -----------|--------------
 <b>keyMapper</b> | A mapping function to produce the map keys for each input stream element.
<b>valueMapper</b> | A mapping function to produce the map values for each input stream element.
<b>mergeFunction</b>| A binary operator which is to resolve collisions between values associated with the same key. The inputs to this                        function are the values which belong to the same key.
<b>mapSupplier </b>|  A function which provies a new instance of the desired implementation of the Map.
