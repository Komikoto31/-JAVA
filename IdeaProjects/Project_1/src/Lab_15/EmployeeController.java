package Lab_15;
public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setEmployeeSalary(double salary) {
        model.setSalary(salary);
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getSalary());
    }
}