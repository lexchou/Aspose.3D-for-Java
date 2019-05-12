package examples.LinearExtrusion;

import com.aspose.threed.*;
import examples.RunExamples;

public class PerformingLinearExtrusion {
    public static void run() throws Exception {
        // ExStart:PerformingLinearExtrusion
        // Initialize the base shape to be extruded
        Shape shape = Shape.fromControlPoints(
                new Vector3(1, 1, 0),
                new Vector3(-1, 1, 0),
                new Vector3(-1, -1, 0),
                new Vector3(1, -1, 0)
        );
        // Perform Linear extrusion by passing a 2D shape as input and extend the shape in the 3rd dimension
        LinearExtrusion extrusion = new LinearExtrusion(shape, 10);
        extrusion.setSlices(100);
        extrusion.setCenter(true);
        extrusion.setTwist(360);
        extrusion.setTwistOffset(new Vector3(10, 0, 0));
        // Create a scene
        Scene scene = new Scene();
        // Create a child node by passing extrusion
        scene.getRootNode().createChildNode(extrusion);
        // Save 3D scene
        scene.save(RunExamples.getOutputFilePath("LinearExtrusion.obj"), FileFormat.WAVEFRONTOBJ);
        // ExEnd:PerformingLinearExtrusion
    }
}
