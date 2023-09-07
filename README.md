# Distinct
The Android app provided is a simple application that allows users to input two strings and then compares these strings to find and display the characters that are different between them. Here's an explanation of how the app works:

User Interface (UI):

The app's UI consists of a single activity called MainActivity.
The UI layout is defined in the activity_main.xml file and includes the following components:
Two EditText widgets: These allow the user to input two strings.
A Button widget: When clicked, it triggers the comparison between the two strings.
A TextView widget: This is used to display the result of the comparison.
Functionality:

When the app is launched, the onCreate method is called, setting up the UI components.
The editText1, editText2, resultTextView, and compareButton variables are initialized to refer to the corresponding UI elements.
Comparison Logic:

The main logic for comparing the input strings is implemented in the findDifferentCharacters method.
This method takes two string arguments, str1 and str2, and performs the following steps:
Converts both input strings to lowercase using the toLowerCase() method. This ensures that the comparison is case-insensitive.
Initializes two Set<Character> objects, uniqueChars1 and uniqueChars2, to store the unique characters from each string.
Iterates through each character in str1 and str2, adding each character to the respective Set to filter out duplicate characters.
Compares the two sets to find the different characters between them.
Constructs a result string that displays the different characters in each string and returns it.

Button Click Listener:

The compareButton(Calculate) is given an OnClickListener, which means that when the button is clicked, the code inside the onClick method is executed.
Inside the onClick method:
The text from editText1 and editText2 is retrieved and converted to lowercase.
The findDifferentCharacters method is called with the two lowercase strings as arguments.
The result obtained from findDifferentCharacters is displayed in the resultTextView.
Output Display:

The app displays the different characters in the first string and the second string separately in the resultTextView. It appends these results to the TextView.
Case Insensitivity:

The app is designed to treat lowercase and uppercase characters as the same when finding different characters. This behavior is achieved by converting both input strings to lowercase before comparison.
Overall, the app provides a straightforward way for users to compare two strings and identify the characters that are different between them, while ignoring case differences. Users can input their strings, click the "Compare" button, and view the results in the app's interface.
