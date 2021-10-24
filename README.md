# lightfeather-challenge
## Running the container
Similar to the spring-template instructions...

`cd lightfeather-challenge/spring-template`

`sudo docker build --tag=spring-template:latest .`

`sudo docker run -d --name spring-template -p8080:8080 spring-template:latest`

## Closing the container (After testing!)
`sudo docker rm -f spring-template`

## Testing
### Get list of supervisors
In a web browser, go to: `http://localhost:8080/supervisors`
### "Subscribe" for notifications
In a web browser, go to: `http://localhost:8080/register?supervisorName=` and put the supervisor name of your choice after the = sign.

## Fun Facts
1. The JSON is in an S3 bucket.
2. The subscribe query string does not validate the input.
3. I have not done Spring boot before this challenge. This is also my first time using Docker in Linux, and building docker containers ever.
4. To improve the subscription service, I would have made an HTML form that POSTs the request. Time constraints prevented this -- either I relearn AJAX and parts of the Java http package, or learn how to do it in Spring. I started down the second path, but I wouldn't finish on time.
5. Of course, I would have also validated the subscription to an existing Supervisor!
6. Last fun fact, when parsing JSON to a Java object, I learned about the [Java Platform Module System changes for Java >=9](https://stackoverflow.com/questions/41265266/how-to-solve-inaccessibleobjectexception-unable-to-make-member-accessible-m). Thank you for making that a non-issue in the Docker container!
