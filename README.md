# Spring Boot File Upload

This is the backend to any front end really, but I specifically made it to work with

https://github.com/traviskentbeste/dragndrop-fileupload-angular

# Usage

Simple RestController that listens for a submit to the /upload endpoint and expects 'files' as a multi-part submission.
It doesn't do anything with the files other than print them out on in the debug output.

It also takes care of the cors issue you'd face sending requests to a different port on the same localhost server.
