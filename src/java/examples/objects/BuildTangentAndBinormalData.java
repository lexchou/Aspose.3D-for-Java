package examples.objects;

import com.aspose.threed.FileFormat;
import com.aspose.threed.PolygonModifier;
import com.aspose.threed.Scene;
import examples.RunExamples;

import java.io.IOException;

public class BuildTangentAndBinormalData {

        public static void run() throws Exception {
            // ExStart:BuildTangentAndBinormalData

            // Load an existing 3D file
            Scene scene = new Scene( RunExamples.getDataFilePath("document.fbx"));
            // Triangulate a scene
            PolygonModifier.buildTangentBinormal(scene);
            // Save 3D scene
            scene.save(RunExamples.getOutputFilePath("BuildTangentAndBinormalData_out.fbx"), FileFormat.FBX7400ASCII);
            // ExEnd:BuildTangentAndBinormalData
        }
}
