### Java-8-Code Samples using  Lambda, Streams, Functional Interfaces etc.


###### To avoid duplicate keys in Collectors.toMap() using Supplier and assign it to new Map implementation like LinkedHashMap
<T,K,U> Collector<T,?,Map<K,U>> toMap(
                                  Function<? super T,? extends K> keyMapper,
                                  Function<? super T,? extends U> valueMapper,
                                  BinaryOperator<U> mergeFunction)
                                  

```
public static void main(String[] args) {
      List<Person> list = new ArrayList<>();
      list.add(new Person(100, "Mohan"));
      list.add(new Person(100, "Sohan"));
      list.add(new Person(300, "Mahesh"));
      
      LinkedHashMap<Integer, String> map =
          list.stream()
          .collect(Collectors.toMap(Person::getId, Person::getName, 
          (x, y) -> x+", "+ y, LinkedHashMap::new));
      
          map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
    }
    ``` 
    
 <hr/>
 ###### To avoid duplicate keys in Collectors.toMap() using BinaryOperator
 <T,K,U,M extends Map<K,U>> Collector<T,?,M> toMap(
                                  Function<? super T,? extends K> keyMapper,
                                  Function<? super T,? extends U> valueMapper,
                                  BinaryOperator<U> mergeFunction,
                                  Supplier<M> mapSupplier)
 ```
 public static void main(String[] args) { 
 
    List<Person> list = new ArrayList<>();
    list.add(new Person(100, "Mohan"));
    list.add(new Person(100, "Sohan"));
    list.add(new Person(300, "Mahesh"));
    list.add(new Person(100, "Gopal"));
      
    Map<Integer, String> map = list
                  .stream()
                  .collect(Collectors.toMap(Person::getId, Person::getName, (x, y) -> x + ", " + y));
                   map.forEach((x, y) -> System.out.println("Key: " + x + ", value: " + y));
  }
  
  ```
  <hr/>
 
###### Parameters

keyMapper: A mapping function to produce the map keys for each input stream element. 
valueMapper: A mapping function to produce the map values for each input stream element. 
mergeFunction: A binary operator which is to resolve collisions between values associated with the same key. The inputs to this function are the values which belong to the same key. 
mapSupplier: A function which provides a new instance of the desired implementation of the Map. 
  
  
 