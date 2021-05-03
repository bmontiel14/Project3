package com.company.montiel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<Task>list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Please Choose an option");
            System.out.println("");
            System.out.println("(1) Add a task ");
            System.out.println("(2) Remove a task ");
            System.out.println("(3) Update a task ");
            System.out.println("(4) List all tasks ");
            System.out.println("(5) List task by priority ");
            System.out.println("(0) Exit ");
            String choice = "";
            choice = input.nextLine();
            switch (choice) {

                case "1":
                    System.out.println("Add a task ");
                    addTask(list);

                    break;
                case "2":
                    System.out.println("Remove a task");
                    deleteTask(list);
                    break;
                case "3":
                    System.out.println("Update a task");
                    updateTask(list);
                    break;
                case "4":
                    System.out.println("List all tasks");
                    listAll(list);
                    break;
                case "5":
                    System.out.println("List task by priority");
                    listTaskByPrio(list);
                case "0":
                    System.exit(0);
            }
        }
        while (true);

    }
    static ArrayList<Task> addTask(ArrayList<Task> a){
        Scanner input = new Scanner(System.in);
        System.out.println("What task would you like to add?");
        String userInput = input.nextLine();
        System.out.println("please enter description of the task");
        String descName = input.nextLine();
        System.out.println("please enter priority number: 0-5.");
        int prioInt = input.nextInt();
        a.add(new Task(userInput, descName, prioInt));
        return a;

    }
    static ArrayList<Task> deleteTask(ArrayList<Task> a){
        System.out.println("What task would you like to remove?");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        input.nextLine();
        a.remove(userInput);
        return a;

    }
    static void updateTask(ArrayList<Task> a){
        Scanner input = new Scanner(System.in);
        Scanner nextInput = new Scanner(System.in);
        System.out.println("What task would you like to update?");
        int userInput = input.nextInt();
        input.nextLine();
        System.out.println("Please enter a task name");
        String taskName = input.nextLine();
        System.out.println("Please enter description of the task.");
        String descName = nextInput.nextLine();
        System.out.println("Please enter priority number 0-5.");
        int prioInt = input.nextInt();
        Task updatedTask = new Task(taskName, descName, prioInt);
        a.set(userInput, updatedTask);
    }
    static void listAll(ArrayList<Task> a){
        Collections.sort(a);
        for (Task task : a) {
            System.out.println(task.toString());
        }

    }
    static void listTaskByPrio(ArrayList<Task> a){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter priority number 0-5.");
        int prioInt = input.nextInt();
        input.nextLine();
        for(int i = 0; i < a.size(); i++){
            if(prioInt == a.get(i).getPriority()){
                System.out.println(a.get(i));
            }
        }
    }







}
