package examples.objects;

import com.aspose.threed.*;
import examples.RunExamples;

import java.io.IOException;

public class SplitAllMeshesofScenebyMaterial {

        public static void run() throws Exception {
            // ExStart:SplitAllMeshesofScenebyMaterial
            // Load a 3D file
            Scene scene = new Scene(RunExamples.getDataFilePath("test.fbx"));
            // Split all meshes
            PolygonModifier.splitMesh(scene, SplitMeshPolicy.CLONE_DATA);

            // Save file
            String MyDir = RunExamples.getOutputFilePath("test-splitted.fbx");
            scene.save(MyDir, FileFormat.FBX7500ASCII);

            // ExEnd:SplitAllMeshesofScenebyMaterial
            System.out.println("\nSpliting all meshes of a scene per material successfully.\nFile saved at " + MyDir);
        }
}
