
import java.awt.Desktop;
import java.io.File;

public class DeepakTask {

	public static void main(String[] args) throws Exception {
		File file= new File("C:\\Users\\pradkumar\\Pictures\\Screenshots\\image.png");
		Desktop desk = Desktop.getDesktop();
		desk.open(file);
		
	}

}

