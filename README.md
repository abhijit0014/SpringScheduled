# SpringScheduled

The *@Scheduled* annotation can be added to a method along with trigger metadata. For example, the following method would be invoked every 5 seconds with a fixed delay, meaning that the period will be measured from the completion time of each preceding invocation.
```java
@Scheduled(fixedDelay=5000)
public void doSomething() {
    // something that should execute periodically
}
```
If a fixed rate execution is desired, simply change the property name specified within the annotation. The following would be executed every 5 seconds measured between the successive start times of each invocation.
```java
@Scheduled(fixedRate=5000)
public void doSomething() {
    // something that should execute periodically
}
```
For fixed-delay and fixed-rate tasks, an initial delay may be specified indicating the number of milliseconds to wait before the first execution of the method.
```java
@Scheduled(initialDelay=1000, fixedRate=5000)
public void doSomething() {
    // something that should execute periodically
}
```
If simple periodic scheduling is not expressive enough, then a cron expression may be provided. For example, the following will only execute on weekdays.
```java
@Scheduled(cron="*/5 * * * * MON-FRI")
public void doSomething() {
    // something that should execute on weekdays only
}
```
link :: https://docs.spring.io/spring/docs/current/spring-framework-reference/html/scheduling.html
