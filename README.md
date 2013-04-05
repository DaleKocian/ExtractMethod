Motivation
=============
Extract Method is one of the most common refactorings I do. I look at a method that is too long or look at code that
needs a comment to understand its purpose. I then turn that fragment of code into its own method.

I prefer short, well-named methods for several reasons. First, it increases the chances that other methods can use a
method when the method is finely grained. Second, it allows the higher-level methods to read more like a series of
comments. Overriding also is easier when the methods are finely grained.

It does take a little getting used to if you are used to seeing larger methods. And small methods really work only when
you have good names, so you need to pay attention to naming. People sometimes ask me what length I look for in a method.
To me length is not the issue. The key is the semantic distance between the method name and the method body. If
extracting improves clarity, do it, even if the name is longer than the code you have extracted.

Mechanics
=============
Create a new method, and name it after the intention of the method (name it by what it does, not by how it does it).

Copy the extracted code from the source method into the new target method.

Scan the extracted code for references to any variables that are local in scope to the source method. These are local
variables and parameters to the method.

See whether any temporary variables are used only within this extracted code. If so, declare them in the target method
as temporary variables.

Look to see whether any of these local-scope variables are modified by the extracted code. If one variable is modified,
see whether you can treat the extracted code as a query and assign the result to the variable concerned. If this is
awkward, or if there is more than one such variable, you can’t extract the method as it stands. You may need to use
Split Temporary Variable and try again. You can eliminate temporary variables with Replace Temp with Query (see the
discussion in the examples).

Pass into the target method as parameters local-scope variables that are read from the extracted code.

Compile when you have dealt with all the locally-scoped variables.

Replace the extracted code in the source method with a call to the target method.

Compile and test.