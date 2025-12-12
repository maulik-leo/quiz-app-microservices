    INSERT INTO question (category, difficulty_level, question_title, option1, option2, option3, option4, right_answer) VALUES
    -- 8 x JAVA Questions
    ('JAVA', 'Easy', 'Which keyword is used to define a constant variable in Java?', 'const', 'final', 'static', 'var', 'final'),
    ('JAVA', 'Medium', 'Which concept is achieved by using the `extends` keyword?', 'Encapsulation', 'Polymorphism', 'Inheritance', 'Abstraction', 'Inheritance'),
    ('JAVA', 'Easy', 'Which method must be present in every Java application?', 'run()', 'main()', 'execute()', 'start()', 'main()'),
    ('JAVA', 'Medium', 'What is the default value of a reference type variable in Java?', '0', 'null', 'false', 'undefined', 'null'),
    ('JAVA', 'Hard', 'Which exception is thrown when attempting to divide by zero?', 'ArithmeticException', 'NullPointerException', 'IOException', 'IndexOutOfBoundsException', 'ArithmeticException'),
    ('JAVA', 'Medium', 'What is the term for hiding internal implementation details?', 'Polymorphism', 'Encapsulation', 'Inheritance', 'Overloading', 'Encapsulation'),
    ('JAVA', 'Hard', 'Which access modifier is the most restrictive?', 'public', 'protected', 'default (package)', 'private', 'private'),
    ('JAVA', 'Easy', 'What is the file extension for compiled Java class files?', '.java', '.jar', '.class', '.exe', '.class'),

    -- 8 x PYTHON Questions
    ('PYTHON', 'Easy', 'Which function is used to get user input in Python?', 'input()', 'get()', 'read()', 'console()', 'input()'),
    ('PYTHON', 'Medium', 'Which of these is NOT a built-in Python data type?', 'List', 'Tuple', 'Array', 'Dictionary', 'Array'),
    ('PYTHON', 'Easy', 'How do you check the type of a variable in Python?', 'getType()', 'type_of()', 'type()', 'typeof', 'type()'),
    ('PYTHON', 'Medium', 'What is the correct way to open a file for reading?', 'open("file", "r")', 'open("file", "w")', 'open("file", "a")', 'open.read("file")', 'open("file", "r")'),
    ('PYTHON', 'Hard', 'What is a generator in Python?', 'A type of decorator', 'A function that returns an iterator of results', 'A standard built-in data type', 'A special class object', 'A function that returns an iterator of results'),
    ('PYTHON', 'Medium', 'Which statement is used to skip the rest of the code inside a loop for the current iteration?', 'break', 'return', 'continue', 'pass', 'continue'),
    ('PYTHON', 'Hard', 'In Python, what does GIL stand for?', 'Global Iteration Logic', 'General Input Language', 'Global Interpreter Lock', 'Graphical Interface Library', 'Global Interpreter Lock'),
    ('PYTHON', 'Easy', 'What is the primary usage of the `pip` command?', 'Running Python files', 'Installing packages', 'Debugging code', 'Executing tests', 'Installing packages'),

    -- 8 x HTML Questions
    ('HTML', 'Easy', 'Which tag is used to make text bold?', '<strong>', '<i>', '<u>', '<p>', '<strong>'),
    ('HTML', 'Medium', 'What does the `href` attribute specify?', 'Hyperlink reference', 'Header font', 'Image height', 'Horizontal rule', 'Hyperlink reference'),
    ('HTML', 'Easy', 'Which tag is used to create a numbered list?', '<ol>', '<ul>', '<li>', '<list>', '<ol>'),
    ('HTML', 'Medium', 'The correct syntax for an email link is:', '<a href="mailto:...">', '<a email="...">', '<link email="...">', '<a mailto="...">', '<a href="mailto:...">'),
    ('HTML', 'Hard', 'Which HTML5 element is used to specify a self-contained content, like a blog post?', '<section>', '<article>', '<aside>', '<details>', '<article>'),
    ('HTML', 'Medium', 'What element defines the title for a document?', '<head>', '<title>', '<h1>', '<meta>', '<title>'),
    ('HTML', 'Easy', 'Which character is used to indicate an end tag?', '/', '!', '?', '*', '/'),
    ('HTML', 'Hard', 'Which attribute is used to group related elements in a form?', 'group', 'fieldset', 'section', 'div', 'fieldset'),

    -- 9 x CSS Questions
    ('CSS', 'Easy', 'Which CSS property defines the space between the element''s border and its content?', 'margin', 'padding', 'spacing', 'border-spacing', 'padding'),
    ('CSS', 'Medium', 'How do you make text italic?', 'font-style: italic', 'text-style: italic', 'font: italic', 'style: italic', 'font-style: italic'),
    ('CSS', 'Easy', 'Which property is used to set the text alignment?', 'text-transform', 'text-style', 'text-align', 'align', 'text-align'),
    ('CSS', 'Medium', 'The correct syntax for an internal stylesheet is:', '<style>...</style>', '<css>...</css>', '<link>...</link>', 'Internal Style', '<style>...</style>'),
    ('CSS', 'Hard', 'The "C" in CSS stands for what?', 'Creative', 'Cascading', 'Colorful', 'Computer', 'Cascading'),
    ('CSS', 'Medium', 'Which value of the `position` property removes an element from the document flow?', 'absolute', 'relative', 'static', 'fixed', 'absolute'),
    ('CSS', 'Hard', 'What is the order of CSS specificity from highest to lowest?', 'Type, Class, ID', 'ID, Class, Type', 'Class, ID, Type', 'ID, Type, Class', 'ID, Class, Type'),
    ('CSS', 'Easy', 'Which selector selects all elements?', '#', '.', '*', 'all', '*'),
    ('CSS','Easy','color','bgcolor','background-color','background','Which CSS property is used to change the background color of an element?','background-color'),
    -- 10 x JAVASCRIPT Questions
    ('JAVASCRIPT', 'Easy', 'How do you write "Hello World" in an alert box?', 'msg("Hello World");', 'alert("Hello World");', 'prompt("Hello World");', 'console.log("Hello World");', 'alert("Hello World");'),
    ('JAVASCRIPT', 'Medium', 'What is the correct way to check if two variables are equal in value and type?', 'a = b', 'a == b', 'a === b', 'a != b', 'a === b'),
    ('JAVASCRIPT', 'Easy', 'What keyword is used to exit a function and return a value?', 'exit', 'return', 'break', 'done', 'return'),
    ('JAVASCRIPT', 'Medium', 'Which built-in object is used to perform mathematical tasks?', 'Math', 'Number', 'Calculations', 'Array', 'Math'),
    ('JAVASCRIPT', 'Hard', 'What is a closure in JavaScript?', 'A loop structure', 'A combination of a function and the lexical environment within which that function was declared', 'A type of data structure', 'An event handler', 'A combination of a function and the lexical environment within which that function was declared'),
    ('JAVASCRIPT', 'Easy', 'Which scope defines a variable declared with `let`?', 'Global scope', 'Function scope', 'Block scope', 'Module scope', 'Block scope'),
    ('JAVASCRIPT', 'Medium', 'What does JSON stand for?', 'Java Standard Object Notation', 'JavaScript Object Notation', 'Joint Script Object Network', 'JQuery Object Notation', 'JavaScript Object Notation'),
    ('JAVASCRIPT', 'Hard', 'What is the purpose of the `bind()` method?', 'To change the value of a variable', 'To create a new function that has a specific `this` context', 'To link two variables', 'To execute an asynchronous function', 'To create a new function that has a specific `this` context'),
    ('JAVASCRIPT', 'Medium', 'How do you add an element to the end of an array?', 'push()', 'pop()', 'shift()', 'add()', 'push()'),
    ('JAVASCRIPT', 'Easy', 'Which symbol is used for exponentiation (power) in JavaScript?', '**', '^', 'e^', 'pow()', '**'),

    -- 8 x SQL Questions
    ('SQL', 'Easy', 'Which command is used to update existing records in a table?', 'INSERT', 'CREATE', 'UPDATE', 'MODIFY', 'UPDATE'),
    ('SQL', 'Medium', 'Which clause is used to group rows that have the same values in specified columns into summary rows?', 'WHERE', 'ORDER BY', 'GROUP BY', 'HAVING', 'GROUP BY'),
    ('SQL', 'Easy', 'Which keyword is used to sort the result-set of a query?', 'SORT BY', 'ORDER BY', 'ARRANGE BY', 'GROUP BY', 'ORDER BY'),
    ('SQL', 'Medium', 'The primary key constraint uniquely identifies each record in a database table.', 'True', 'False', 'Sometimes', 'Depends on SQL version', 'True'),
    ('SQL', 'Hard', 'Which type of JOIN returns records that have matching values in both tables?', 'LEFT JOIN', 'RIGHT JOIN', 'FULL JOIN', 'INNER JOIN', 'INNER JOIN'),
    ('SQL', 'Medium', 'Which function finds the highest value in a column?', 'SUM()', 'AVG()', 'MAX()', 'COUNT()', 'MAX()'),
    ('SQL', 'Hard', 'The process of splitting a table into two or more tables to reduce data redundancy is called?', 'Indexing', 'Normalization', 'Partitioning', 'Denormalization', 'Normalization'),
    ('SQL', 'Easy', 'What does the acronym DML stand for?', 'Data Markup Language', 'Database Management Logic', 'Data Manipulation Language', 'Data Modeling Language', 'Data Manipulation Language'),

    -- 1 x Angular Questions
    ('Angular','Medium','To handle routing and navigation.','To define the structure, data, and logic for a part of the application''s user interface.','To provide services that can be injected across the application.','To manage asynchronous operations like HTTP requests.','What is the primary purpose of a component in Angular?','To define the structure, data, and logic for a part of the application''s user interface.');