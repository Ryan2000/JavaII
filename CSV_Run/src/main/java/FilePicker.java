
import javax.swing.*;
import java.io.File;
import java.util.Optional;

public class FilePicker {
	

    public static Optional<File> pickFile(){
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            return Optional.of(fc.getSelectedFile());
        } else {
            return Optional.empty();
        }
    }
	

}
