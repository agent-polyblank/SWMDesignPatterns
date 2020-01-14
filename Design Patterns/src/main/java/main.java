import com.kingsam.designPatterns.MVCArchitecture.StudentController;
import com.kingsam.designPatterns.MVCArchitecture.StudentView;
import com.kingsam.designPatterns.MVCArchitecture.student;
import com.kingsam.designPatterns.creational.abstractFactory.FactoryProducer;
import com.kingsam.designPatterns.creational.abstractFactory.abstractFactory;
import com.kingsam.designPatterns.creational.abstractFactory.abstractShape;
import com.kingsam.designPatterns.creational.factory.dogFactory;
import com.kingsam.designPatterns.creational.factory.dogInterface;
import com.kingsam.designPatterns.creational.singleton.Singleton;
import com.kingsam.designPatterns.structural.adapter.BirdAdapter;
import com.kingsam.designPatterns.structural.adapter.PlasticToyDuck;
import com.kingsam.designPatterns.structural.adapter.sparrow;
import com.kingsam.designPatterns.structural.adapter.toyDuck;


public class main {

    public static void main(String[] args) {

        //singletons
        Singleton singletonInstance = Singleton.getInstance();
        singletonInstance.getValue();

        //factories
        dogFactory dogFactory = new dogFactory();
        dogInterface dog1 = com.kingsam.designPatterns.creational.factory.dogFactory.getDog("In awe at the size of this lad");
        dog1.bark();

        dogInterface dog2 = com.kingsam.designPatterns.creational.factory.dogFactory.getDog("Smol");
        dog2.bark();

        //abstract factories
        FactoryProducer factoryForFactories = new FactoryProducer();
        abstractFactory rounded = FactoryProducer.getFactory(true);
        abstractFactory notRounded = FactoryProducer.getFactory(false);


        abstractShape roundedSquare = rounded.getShape("square");
        roundedSquare.drawShape();

        abstractShape unRoundedSquare = notRounded.getShape("square");
        unRoundedSquare.drawShape();


        sparrow sparrowInstance = new sparrow();
        //will chirp
        sparrowInstance.makeNoise();

        PlasticToyDuck toyDuckInstance = new PlasticToyDuck();
        //will squeak
        toyDuckInstance.squeak();

        //will chirp like a bird but be of class toyDuck
        toyDuck birdAdapter = new BirdAdapter(sparrowInstance);
        birdAdapter.squeak();

        //modelView controller
        /*MVC Pattern stands for Model-View-Controller Pattern. This pattern is used to separate application's concerns.
        Model - Model represents an object carrying data. It can also have logic to update controller if its data changes.
                View - View represents the visualization of the data that model contains.
                Controller - Controller acts on both model and view. It controls the data flow into model object and updates the view whenever data changes.
                It keeps view and model separate. - advantage separation of interests
        Implementation
        We are going to create a Student object acting as a model.
        StudentView will be a view class which can print student details on console.
        StudentController is the controller class responsible to store data in Student object and update view StudentView accordingly.

        MVCPatternDemo, our demo class, will use StudentController to demonstrate use of MVC pattern.*/

        //create a model i.e. create a student to display
        student model = retriveStudentFromDatabase();
        //create a student view
        StudentView view = new StudentView();
        //create a controller which interacts with the model and view
        StudentController controller = new StudentController(model, view);

        //call the controller function update view which in turn calls the print method in view.
        controller.updateView();

        controller.setStudentName("dave");

        controller.updateView();
    }

    private static student retriveStudentFromDatabase() {
        student student = new student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }


}
