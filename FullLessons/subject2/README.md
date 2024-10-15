# WEEK 2 LESSON:

###  Introduction to Primitive Data Types (* types will be used during this class)

- **boolean**: Represents logical values, either true or false.
- byte: An 8-bit signed integer, with a range from -128 to 127.
- short: A 16-bit signed integer, with a range from -32,768 to 32,767.
- **int**: A 32-bit signed integer, with a range from -2,147,483,648 to 2,147,483,647. 
- long: A 64-bit signed integer, with a range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
- float: A single-precision 32-bit floating-point number.
- **double**: A double-precision 64-bit floating-point number.
- **char**: A single 16-bit Unicode character.

### Declaring and Initializing a Variable
#### Syntax Structure
Example (Boolean): A boolean variable can hold one of two values: true or false. It's often used for representing logical conditions or states.
boolean isRaining = true;

Example (int):
An int (integer) variable stores whole numbers (no fractions or decimals). It has a range that depends on the system, but it's typically 32 bits, allowing values from roughly -2 billion to 2 billion.
int temperature = 75;

### Component:

#### dataType:
Specifies the type of data the variable will hold.
Examples: int, double, boolean, String (not a primitive type, but often used).

#### variableName:
A unique identifier you choose to represent the variable.

    **Rules**:
    - Must start with a letter, underscore (_), or dollar sign ($).
    - Can contain letters, numbers, underscores, and dollar signs.
    - Cannot be a Java keyword (like int, if, class).
    - Choose meaningful names that reflect the purpose of the variable.

#### = (Assignment Operator):
Assigns the value on the right side to the variable on the left side.
Think of it like an arrow pointing from the value to the storage location of the variable.

#### value:
The actual data you want to store in the variable.
It should be compatible with the specified type
