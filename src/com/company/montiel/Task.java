package com.company.montiel;

public class Task implements Comparable<Task> {
    private String taskName;
    private String description;
    private int priority;

    public Task(String taskName, String description, int priority) {
        this.taskName = taskName;
        this.description = description;
        this.priority = priority;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Task o) {
        int compareResults = this.taskName.compareTo(o.taskName);

        return compareResults;
    }
}
