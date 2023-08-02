# Notes on SinglyLinkedList

These are the notes we used to complete the lab. 

Copy these files into the correct places as directed by the instructor.

## Steps

Need way to generate our methods before testing.
Let's make an `interface`!!

- add an interface from spec
  - add -- add an element to the list
    `public void add(T data);`
  - remove -- remove an element (specified by numeric index) from the list
    `public void remove(int index) // throws IndexOutOfBoundsException;`
  - contains -- returns true if the element is in the list, false otherwise
    `public boolean contains(T data);`
  - find -- returns the element's index if it is in the list, -1 otherwise
    `public int find(T data);`
  - size -- returns the current size of the list
    `public int size();`
  - get -- returns the element at the specified index
    `public T get(int index) //throws IndexOutOfBoundsException;`
  - copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
    `public SinglyLinkedList<T> copy();`
  - sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
    `public void sort(Comparator<T> comparator);`

- add implements (and generate concrete methods via IntelliJ)
- generate stub Constructor
- make test and fail
- implement Constructor & pass
- implement & test Node class *Your linked list must have a **node inner class** to represent each element*
  - [Google: `java simple Node class for generics`](https://docs.oracle.com/javase/tutorial/java/generics/genTypes.html)
- generate stub `bool isEmpty()`
- make test and fail
- implement isEmpty & pass
- generate stub `toString` (for debugging)
- make test and fail
- implement toString(), test and pass
- for each Method definition in order of implementation
- generate method stub, write test, fail, implement and re-test & pass
  - add -- add an element to the list (append to end)
  - size -- returns the current size of the list
  - find -- returns the element's index if it is in the list, -1 otherwise
  - contains -- returns true if the element is in the list, false otherwise
  - get -- returns the element at the specified index
  - remove -- remove an element (specified by numeric index) from the list
  - copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
  - sort -- sorts the list using your algorithm of choice. 
    - You must perform the sorting yourself (no fair using someone else's library)
    - implement `Comparable`.
    - use a `BubbleSort O(n^2)`


## toString

if the list 
- is empty print `head -> NULL`
- has one integer (some x) in it print `head -> [x] -> NULL`
- has two integers (some x, y) in it print `head -> [x] -> [y] -> NULL`

etc...

## Sorting and comparator

We want to make the new linkedlist implement `Comparable`
- add decoration to class `<T extends Comparable<T>>`
- add to `Node` decoration `<E extends Comparable<E>> implements Comparable<Node<E>>`
- add standard `compareTo`
- write tests for sorting
- implement `sort()`
- test and pass