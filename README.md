# threads

1. Multitasking
    1. Executing multiple process at a time is called Multitasking
    2. Process based Multitasking
        1. Executing multiple process at a time when each process is completely independent of the another is called
           Process based Multitasking
        2. When one system is connected to multiple processors in order to complete the task
        3. Process based MultiTasking is the best suitable for OS level and not at Program level
    3. Thread based Multitasking
        1. Executing several task simultaneously where each task is separate independent part of same program
2. Difference between Process and thread
    1. Definition
        1. Process = A program which is in executing state
        2. Thread = A small part or sub part of process
    2. Weight
        1. Process = Process is heavyweight
        2. Thread = Thread is light weight
    3. Context Switching
        1. Process = Process takes more time for context switching
        2. Thread = takes less time for context switching
    4. Communication
        1. Process = takes more time for inter process communication
        2. Thread = takes less time for inter process communication
    5. Address Space
        1. Process = Each process shares different memory
        2. Thread = Each thread shares same memory
    6. Dependency
        1. Process = Process are not dependent on each other
        2. Thread = Threads are dependent on each other
    7. Synchronization
        1. Process = Process does not require synchronization
        2. Thread = thread may require synchronization
    8. Resource Consumption
        1. Process = Process has more resource consumption
        2. Thread = Thread has less resource consumption
    9. Time of Creation
        1. Process requires more time for creation
        2. Thread takes less time for creation
    10. Time for Termination
        1. Process = Process requires more time for termination
        2. Thread = Thread requires less time for termination
3. How to create threads
    1. There are two ways to create thread
        1. Using Thread class
            1. To create thread using Thread class , we will have to make class extend Thread class
            2. Override the run method
            3. Create object of the class extending the thread class
            4. Start our thread with .start() method
            5. Task of the thread is written in the run method
        2. Using Runnable Interface
4. LifeCycle of the thread
    1. New
    2. Runnable
    3. Running
    4. Dead
    5. Non Runnable States
        1. Achieved using sleep(), waiting(), suspend();
5. Creation of thread using Thread Class
    1. Class Thread is present in the java.lang package
    2. It has start and run method
    3. Thread implements Runnable Interface and hence it overrides the run method of the Runnable Interface
    4. Steps involved in creating thread from Thread class
        1. Extend Thread class
        2. Override the run method
        3. Implement task of thread in the run method
        4. Create an object of the class extending the Thread class
        5. Start your thread using the .start method
        6. If we call start method again then it will throw me an exception
        7. We cannot invoke thread again
        8. It gives runtime time exception stating that IllegalThreadStateException
        9. If we directly call .run() method instead of .start() it will consider it as run method as a normal method
           without creating the thread
6. Creation of Thread using Runnable Interface
    1. It is present in the java.lang package
    2. It has run method
    3. Thread can be created using runnable interface
    4. Steps
        1. Implement Runnable Interface
        2. Override the run method
        3. Create object of the class implementing the Runnable Interface and create object of the thread class in the
           main method passing the reference to the Thread constructor
        4. We can now call the .start method of the thread using the object of the thread class
    5. Creating thread using Runnable Interface is the better way because
        1. A class can extend only one another class so if the class is already extends some class B it will not be able
           to extend the class of thread however with interface any no of interfaces can be implemented
        2. This also increases performance of the code
7. Methods and Constructors in Thread class
    1. Constructors
        1. Thread()
        2. Thread(Runnable)
        3. Thread(String name)
        4. Thread(Runnable target,String name)
        5. Thread(ThreadGroup tg,Runnable target)
        6. Thread(ThreadGroup th , Runnable target , String name)
        7. Thread(ThreadGroup tg , String name)
        8. Thread(ThreadGroup tg,Runnable target,String name, Long stackSize)
    2. Methods
        1. run()
        2. start()
        3. static currentThread()
            1. Provided thread reference
        4. isAlive()
        5. getName()
            1. To get name of the thread
            2. eg : Thread.currentThread().getName()
        6. setName()
            1. To set name of the thread
            2. eg : Thread.currentThread().setName("");
        7. isDaemon()
        8. setDaemon()
            1. if true this thread will be Daemon thread henceforth
        9. getPriority()
        10. setPriority(int pv)
        11. sleep()
        12. yield()
        13. join()
        14. suspend() - Deprecate from the Java
        15. resume() - Deprecated
        16. stop() - Deprecated
        17. destroy() - Deprecated
        18. interrupt()
        19. isInterrupted()
        20. interrupted()
8. Daemon Threads
    1. These threads run in background of other threads
    2. It provides service to the threads
    3. eg. Garbage Collector , finalizer
    4. Methods of Daemon
        1. public final void setDaemon(boolean b)
        2. public final boolean isDaemon()
    5. We need to make thread daemon before starting, if we declare thread as daemon after start then it will throw
       exception which is Runtime i.e. IllegalThreadStateException
    6. Thread cannot be converted to Daemon thread after it is started and this is the reason why we cannot create main
       thread as daemon thread because main thread is executed before only
    7. Daemon thread life is dependent upon the life of the thread it is processing , once the thread for which it is
       providing service is dead the thread is also dead
    8. Daemon thread inherits properties from the parent thread
    9. If one thread is daemon and there is thread from it then it also is default daemon
    10. JVM is not dependent upon Daemon thread
    11. If Daemon thread is running and there is no other thread then it will move Daemon thread to dead and terminate
        itself
    12. Priority of Daemon thread should be low because it always executes in the background
    13. But we can change priorities as per our need
    14. Unless main thread is not performing any task , Daemon thread will not run its own task
9. Thread Priorities
    1. When a thread is created a priority is set for it , as per which a processor is allocated
    2. Each thread has its own priority
    3. If 2 threads has same priority it depends upon JVM to assign processors
    4. We can also assign priorities to thread as per our wish
    5. Priorities are represented in the form of Integer value
    6. Integer value ranges from 1 to 10
    7. 1 is MIN_PRIORITY
    8. 5 is NORM_PRIORITY
    9. 10 is MAX_PRIORITY
    10. Below are not the priorities
        1. 0
        2. Less than 1
        3. Greater than 10
        4. MINIMUM_PRIORITY
        5. LOW_PRIORITY
        6. MEDIUM_PRIORITY
        7. MAX_PRIORITY
        8. HIGH_PRIORITY
        9. NORMAL_PRIORITY
    11. Methods to set Priorities
        1. public final void setPriority(int value)
        2. public final void getPriority()
    12. If we do not provide name for the thread ,JVM gives its own name
    13. Nature
        1. Priorities are inherited from the parent thread
        2. Default main thread Priority is 5
    14. If Priority value is not in between 1 and 10 then it will throw exception IllegalArgumentException
    15. Priorities depend on the platform and windows does not support priorities
10. Sleep Method in java
    1. Thread has 2 sleep methods which means sleep method is overloaded
    2. public static native void sleep(long mili) throws InterruptedException
        1. Native methods are methods whose implementation is provided by some language
    3. public static void sleep(long mili , int nano ) throws InterruptedException
        1. Implementation of this is provided by the class itself
        2. Puts thread to sleep for some duration plus some nanoseconds
    4. As both methods are static we can directly call them using Thread class
    5. Sleep will stop/pause execution of the thread for the duration provided
    6. Once duration is completed the thread will start again
    7. As sleep throws InterruptedException we will have to put it in try catch block while using it
    8. It will auto start executing once the duration is completed
    9. We cannot provide negative value in the sleep method because it will not give compile time error , but it gives
       runtime error as IllegalArgumentException
    10. Also, we cannot provide negative value in nanoseconds because it gives Runtime Exception as nanoseconds timeout
        value out of range
    11. If there is a thread in sleep mode , the CPU gets assigned to some other thread if the other threads are
        executing, hence there is no guarantee if it will start again after the duration mentioned , it completely
        depends upon the thread scheduler
    12. While the thread is executing it will not release locks or monitors that it had acquired before sleeping
    13. if we directly call run method without start then new thread will not be created and main method will only keep
        going to sleep
11. yield()
    1. which stops the current executing thread and give a chance to other threads for execution
    2. In Java5 yield method internally used to class sleep
    3. After Java5 it gives hint to thread scheduler that it can stop the execution it has no problem , now it depends
       upon thread scheduler if it wants to understand the hint or not
    4. Hence, we cannot decide a specific outcome
    5. public static native void yield()
    6. public static void yield()
    7. output may vary
    8. Yield does not throw any exception
12. join()
    1. If a thread wants to wait for another thread to complete its task and once done will join the thread then we
       should make use of join
    2. Methods in join
       1. public final void join() throws InterruptedException
       2. public final synchronized void join(long ms) throws InterruptedException
       3. public final synchronized void join(long ms , int ns) throws InterruptedException
    3. join method should be called with reference of the thread for which we want to wait for execution to complete
    4. if the thread is not executed within the time it will start its own execution
13. Difference between sleep , yield , join
    1. Purpose
       1. Sleep : If any thread does not want to perform any operation for certain period of time then we can use sleep
       2. Yield : It stops current executing thread and provides other thread opportunity to execute
       3. Join : If a thread want to wait for another to complete its task then we make use of join
    2. Examples
       1. Sleep : Timer
       2. Yield : Shopping Billing
       3. Join : License Exam
    3. Invocation
       1. Sleep : it automatically invokes after given time period or if interrupted
       2. Yield : Automatically invoked by threadScheduler
       3. join : If a thread completes the task it is automatically invoked
    4. Methods
       1. Sleep
          1. public static native void sleep(long ms)
          2. public static void sleep(long ms , int ns)
       2. Yield 
          1. yield()
       3. Join
          1. join()
          2. join(long ms)
          3. join(long ms , int ns)
    5. Is method overloaded
       1. Sleep : yes
       2. Yield : no
       3. Join : yes
    6. Exception thrown
       1. Sleep : InterruptedException
       2. Yield : No
       3. Join : Interrupted Exception
    7. Static
       1. Sleep : Yes
       2. Yield : Yes
       3. Join : No
    8. Native
       1. Sleep : Yes
       2. Yield : Yes
       3. Join : No

    

 
