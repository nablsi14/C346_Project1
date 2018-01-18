# C346: Project 1
### Project 1 for CSCI-C346 at IU Southeast

The purpose of this project was to use create a simple Linked List in order to practice creating unit tests, and using Git.
For each method in the ```MyLinkedList``` class, I tried to create at least one test that covered:
* General/expected use
  * Various size inputs
* Illegal/unexpected use

However, for some methods, such as ```set```, ```setNext``` and ```append```, testing for illegal cases wasn't necessary because the only times when such cases would occur is when the object is uninitalized or a parameter of the wrong type is passed in, both of which are errors at compile time.

Because of this, some methods, such as ```append```,  instead focus on making sure the method works with various sized inputs, on lists of various sizes. In these cases I tryied to cover the different types of states that the list and the input could be in when the method is called.
