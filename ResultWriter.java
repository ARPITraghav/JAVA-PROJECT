import java.io.FileWriter;
import java.io.IOException;

class ResultWriter {

    void saveResult(String name, int score) {

        try {

            FileWriter writer = new FileWriter("quiz_results.txt", true);

            writer.write("Name: " + name + " Score: " + score + "\n");

            writer.close();

            System.out.println("Result saved successfully!");

        } catch (IOException e) {

            System.out.println("Error saving result.");
        }
    }
}