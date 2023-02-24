package org.example;
//
// Object-Oriented Programming
// Continuous Assessment - CA4
// February 2023 (Practical Lab Exam)
//
// Enter your STUDENT Name here:  xxxxxxxxxxxxx
//

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("OOP CA4 - Lab Test on Collections - Feb 2023");
        MainApp app = new MainApp();
        app.start();
    }

    public void start() {
        question1(); // Stack                 (10 marks)
//        question2(); // LinkedList, Iterator  (10 marks)
//        question3(); // Map                   (15 marks)
//        question4(); // PriorityQueue         (15 marks)
//        question5(); // ArrayList, Set        (25 marks)
//        question6(); // LinkedList, Set       (25 marks)
    }

    // Question 1  ///////////////////////////////////////////////////////////////////////////////////////
    //
    //TODO
    // A robot travelling through a square-grid maze must record the direction of
    // each step taken in order that it can retrace its steps.
    // The robot records the steps taken as follows:
    // "N" for North, "S" for South, "E" for East, and "W" for West
    // Assume that the robot starts travelling North and follows the path
    // N,N,E,N,E,S,S,E,N,N,W,N  (given in the array shown below)
    // Use an ArrayDeque as a STACK to do the following:
    // a. Record the given sequence of moves from the start in a Stack.
    // b. Output the sequence of directions required to return to the start
    //    Using the data above. The first few moves in the return sequence
    //    are S,E,S,S,W,.........
    // (The sequence must be reversed and each direction must be reversed!)

    public void question1() {
        System.out.println("\nQuestion 1.");

        String[] steps = {"N","N","E","N","E","S","S","E","N","N","W","N"};
        System.out.print("Forward steps: ");
        for(String s : steps)
            System.out.print(s +", ");

        //////  Enter solution to Q1 here.


    }

    // Question 2  //////////////////////////////////////////////////////////////////////////////////////
    //
    //TODO  Q2
    // citrusFruit contains the names of citrus fruits
    // marketFruit contains the names of all fruit available at a supermarket
    // a. Using a List Iterator, write code to remove all citrus fruit from the market fruit list
    // b. Output the resulting marketFruit list
    //
    // Do not change the starter code given to you below.

    public void question2() {
        System.out.println("\nQuestion 2.");

        LinkedList<String> citrusFruit = new LinkedList<>();
        citrusFruit.add("Orange");
        citrusFruit.add("Lemon");
        citrusFruit.add("Lime");

        LinkedList<String> marketFruit = new LinkedList<>();
        marketFruit.add("Apple");
        marketFruit.add("Orange");
        marketFruit.add("Lemon");
        marketFruit.add("Banana");
        marketFruit.add("Lime");

        ///// Enter solution to Q2 here.
    }

    // Question 3./////////////////////////////////////////////////////////////
    //
    //TODO
    // The FBI wants to 'tap' into internet data and monitor data originating
    // from particular IP Addresses. As IP addresses are harvested in real time,
    // the system needs to rapidly look up an IP address to find if it belongs to
    // a PersonOfInterest who has already been logged/recorded in a 'blackList' of people.
    // A system to provide this functionality has defined a PersonOfInterest class that
    // contains fields: IpAddress, name, list of comments.
    // a. Write a function "populateBlacklist" that accepts a Map as a parameter
    //    and populates the blacklist Map with two PersonOfInterest entries,
    //    that have two comments for each entry.
    //    e.g. ( "10.108.128.175, "Pablo Escobar" , ["hate speech","suspicious finances"] )
    // b. Write code to accept an IP Address and look up the blacklist to find out if
    //    an IP Address is on the blackList, or not.  If it is, then print all details.
    // c. Write the code to add one new PersonOfInterest to the blacklist, and two
    //    comments about them.
    // d. Output the updated blacklist map contents.
    // Lookup and insertion speeds must give a time-complexity performance of O(1) .

    public void question3() {
        System.out.println("\nQuestion 3.");

        Map<String,PersonOfInterest> blacklistMap = new HashMap<>();
        populateBlacklist( blacklistMap );  // you must implement this method

        //// Enter solution to Q3b,c,d here.

    }

    public void populateBlacklist( Map<String, PersonOfInterest> map ) {
        /// enter code here to populate map (Q3.a)

    }


    // Question 4  //////////////////////////////////////////////////////////////////////////////////////
    //
    //TODO
    // The FBI wish to store information about Persons of Interest in a PriorityQueue
    // so that they can output persons in order of Threat Level. (High before Average)
    // Write code to achieve the following:
    // a. create a PriorityQueue called pQ, that will store PersonOfInterest objects.
    // b. Call the method "populatePriorityQueue() to populate the PriorityQueue of
    //    PersonOfInterest objects.  Items must be in priority of threatLevel. (High or Average)
    // c. Output the details of each PersonOfInterest object in order of threatLevel.
    //    (High or Average), by removing them from the PriorityQueue.
    //
    public void question4() {
        System.out.println("\nQuestion 4.");

        // Enter solution to 4.a, b, c here


    }
    //Q.4
    public void populatePriorityQueue( Queue<PersonOfInterest> pq ) {
        PersonOfInterest poi = new PersonOfInterest("333.333.333.333","Bernie Madoff","Average");
        poi.addComment("large borrowings");
        poi.addComment("irregular finances");
        pq.add(poi);
        poi = new PersonOfInterest("111.111.111.111","Pabloe Escobar","Average");
        poi.addComment("drug cartel associations");
        poi.addComment("suspicious financial transactions");
        pq.add(poi);
        poi = new PersonOfInterest("222.222.222.222","Jean-Bernard Lasnaud","High");
        poi.addComment("arms dealing");
        poi.addComment("large bank transactions");
        pq.add(poi);
    }

    // Question 5  //////////////////////////////////////////////////////////////////////////////////////
    //
    //TODO
    // The ArrayList called "institutes" is populated with details of three institutes.
    // Each institute contains a set of courses that are offered by that institute.
    // Write code to achieve the following features:
    // a. In an efficient manner, display all Institutes in alphabetical order and
    //    for each course, display that institute's courses in alphabetical order.
    // b. Display the Set of courses that are available in all institutes
    // c. Display the courses that are unique to DkIT (i.e. offered only in DkIT)
    //
    public void question5() {
        System.out.println("\nQuestion 5.");

        ArrayList<Institute> institutes = new ArrayList<>();
        populateInstitutes( institutes );

        // Enter solution for Q5 a,b,c  here

    }
    // populates the "institutes" ArrayList with 3 entries for Q.5
    //
    public void populateInstitutes( ArrayList<Institute> list ){
        Institute temp = new Institute( "TCD");
        temp.addCourse("Geology");
        temp.addCourse("Computing");
        temp.addCourse("Arts");
        temp.addCourse("Engineering");
        list.add( temp );
        temp = new Institute( "Maynooth");
        temp.addCourse("Computing");
        temp.addCourse("Architecture");
        temp.addCourse("Geology");
        list.add( temp );
        temp = new Institute( "DkIT");
        temp.addCourse("Science");
        temp.addCourse("Computing");
        temp.addCourse("Engineering");
        temp.addCourse("Gmmes Development");
        list.add( temp );
    }

    //  Question 6 /////////////////////////////////////////////////////////////////////////////
    //
    //TODO Given the following code (which you must not change)
    // a. Write the method findMatchingNumbersInEachLine()
    // b. Output the results that the method returns
    // The method accepts an ArrayList of arrays containing my lotto lines ( 4 lines here), and
    // a Set containing the current drawn numbers. The method should check each line against the
    // drawn numbers and return a list of the matching numbers for each line.
    // line 1: 11,24
    // line 2: no matches ... etc.

    public void question6() {
        System.out.println("\nQuestion 6.");

        ArrayList<int[]> myLines = new ArrayList<>();
        myLines.add(new int[] {2,11,20,24,29,35});
        myLines.add(new int[] {7,17,25,29,44,46});
        myLines.add(new int[] {1,11,19,24,30,40});
        myLines.add(new int[] {3,10,19,24,29,30});

        Set<Integer> drawnNumbers = new HashSet<>(Set.of(11,24,1,19,40,30));
        System.out.println("Drawn numbers: " + drawnNumbers);

        ArrayList<LinkedList<Integer>> resultsList = findMatchingNumbersInEachLine(myLines,drawnNumbers);

        ///////// Enter solution to Q6.b
    }

    // method for Q6
    public ArrayList<LinkedList<Integer>>  findMatchingNumbersInEachLine(
            ArrayList<int[]> myLines,
            Set<Integer> drawnNumbers ) {

            // Enter solution to Q6.a here
        return null;  // modify the return value
    }
}




