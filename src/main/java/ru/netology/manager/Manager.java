package ru.netology.manager;

import ru.netology.domain.Issue;
import ru.netology.repository.Repository;

import java.util.*;
import java.util.Comparator;

public class Manager {
    private Repository repository;

    public Manager(Repository repository) {
        this.repository = repository;
    }

    public void issueAdd(Issue item){
        repository.add(item);
    }   // Добавить одну задачу

    public void issueAddAll(List<Issue> items) {
        repository.addAll(items);
    }    // Добавить несколько задач

    public List<Issue> getOpenIssue(){
        return repository.findOpen();
    }  // Отобразить открытые задачи

    public List<Issue> getClosedIssue(){
        return repository.findClosed();
    }   // Отобразить закрытые задачи

    public void getAll(){
        Comparator issueComparator = new Comparator();
        List<Issue> result = new ArrayList<>();
        result.addAll(repository.getAll());
        Collections.sort(result);
        for (int i=0; i < result.size() ; i++) {
            System.out.println(result.get(i));
        }

    }


}
