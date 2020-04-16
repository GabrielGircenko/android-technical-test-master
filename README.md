## Android Engineer - Tech Test

### Introduction

We would like you to demonstrate your knowledge of Android development by creating a simple app to show an interactive list of hospitals in the UK. The app should be able to:
1. Download the hospital data that can be found at the following URL: `http://media.nhschoices.nhs.uk/data/foi/Hospital.csv`. (In the event the file has moved or is inaccessible, a local copy is provided with this test, but only use that file if the online version is inaccessible when you begin writing your solution. No synchronisation is required; simple load the file once from the remote URL - or the local file, if necessary - and continue on to the next step).
1. Parse the data into a usable form
1. Display a list of these hospitals to the user
1. Allow this list to be filtered by a field of your choice (for example to let the user view only NHS hospitals)
1. Show further details of a hospital when selected by the user

### Implementation

Each line of the CSV file linked above is in the form of delimited values, with the following columns (also found in the header):
OrganisationID	OrganisationCode	OrganisationType	SubType	Sector	OrganisationStatus	IsPimsManaged	OrganisationName	Address1	Address2	Address3	City	County	Postcode	Latitude	Longitude	ParentODSCode	ParentName	Phone	Email	Website	Fax

We are interested to see how you:
* Interact with the remote data source
* Pass data between different parts of the app
* Present the hospital data to the user
* Architect and structure your application

The visual appearance of the app is not a priority, but you are encouraged to use standard practices for reasonably good UX (responsive app, no long computations on the UI thread, simple navigation, etc). Don't worry about edge-case error handling or complex design patterns.

It would be good to examples of unit tests and/or instrumentation tests, but don't worry about anything beyond this.

Keep it simple! You are free to use third-party libraries and frameworks, but bear in mind we'd also like to see you display your base knowledge of Android. You can use either Java or Kotlin.

Note: We estimate this task should take no more than a couple of hours. If it is taking you significantly longer than this, tidy up what you have and then submit it. This is not supposed to be a task to test your endurance and your work and thoughts will provide a valuable discussion point in any interview.

### Requirements

Submit your completed solution either either as a git repository (using a public repo service such as Github or Bitbucket), or as a zip file (making sure you include the .git directory). Commit early and often rather than in a single large commit; trial and error is acceptable and even encouraged as it really helps us capture your thinking.

Your solution should contain instructions sufficient to allow a technical user to run your app (ideally a README.md including, e.g. instructions to build and run the app using Android Studio).