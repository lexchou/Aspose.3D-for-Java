package examples.polygons;

import com.aspose.threed.FileFormat;
import com.aspose.threed.PolygonModifier;
import com.aspose.threed.Scene;
import examples.RunExamples;

import java.io.IOException;

public class ConvertPolygonsToTriangles {

        public static void run() throws Exception {
            // ExStart:ConvertPolygonsToTriangles
            // Load an existing 3D file
            Scene scene = new Scene(RunExamples.getDataFilePath("document.fbx"));
            // Triangulate a scene
            PolygonModifier.triangulate(scene);
            // Save 3D scene
            scene.save(RunExamples.getOutputFilePath("triangulated_out.fbx"), FileFormat.FBX7400ASCII);
            // ExEnd:ConvertPolygonsToTriangles
        }
}
