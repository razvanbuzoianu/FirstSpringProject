package production;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Worker {

    private String profession;
    private int age;
    private List<Tool> tools;

    @Autowired private WorkerMotto workerMotto;

    public Worker(String profession, int age, WorkerMotto workerMotto) {
        this.profession = profession;
        this.age = age;
        this.workerMotto = workerMotto;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Tool> getTools() {
        return tools;
    }

    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    public WorkerMotto getWorkerMotto() {
        return workerMotto;
    }

    public void setWorkerMotto(WorkerMotto workerMotto) {
        this.workerMotto = workerMotto;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "profession = '" + profession + '\'' +
                ", age = " + age +
                ", tools = " + tools +
                ", workerMotto = " + workerMotto +
                '}';
    }
}
