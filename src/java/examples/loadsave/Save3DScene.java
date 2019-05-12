package examples.loadsave;

import com.aspose.threed.*;
import com.aspose.threed.utils.MemoryStream;
import examples.RunExamples;

public class Save3DScene {

        public static void run() throws Exception {
            // ExStart:Save3DScene

            // Load a 3D document into Aspose.3D
            Scene scene = new Scene();

            // Open an existing 3D scene
            scene.open(RunExamples.getDataFilePath("document.fbx"));

            // Save Scene to a stream
            try (MemoryStream dstStream = new MemoryStream()) {
                scene.save(dstStream, FileFormat.FBX7500ASCII);
            }
            // Save Scene to a local path
            scene.save(RunExamples.getOutputFilePath( "output_out.fbx"), FileFormat.FBX7500ASCII);
            // ExEnd:Save3DScene

            System.out.println("\nConverted 3D document to stream successfully.");
        }
}
