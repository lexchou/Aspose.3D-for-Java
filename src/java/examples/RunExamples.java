package examples;

import examples.animation.*;
import examples.geometry.*;
import examples.loadsave.*;
import examples.modeling.*;
import examples.objects.*;
import examples.polygons.*;
import examples.scene.*;

import java.io.File;
import java.nio.file.Paths;


public class RunExamples {

    public static void main(String[] args) throws Exception {
        System.out.println("Open runExamples.cs. \nIn Main() method uncomment the example that you want to run.");
        System.out.println("=====================================================");
        // Uncomment the one you want to try out

        // =====================================================
        // =====================================================
        // Loading and Saving
        // =====================================================
        // =====================================================

//         CreateEmpty3DDocument.run();
//         ReadExistingScene.run();
//         DetectFormat.run();
//         SaveOptions.SavingDependenciesInMemoryFileSystem();
//         LoadOptions.run();
//         SaveOptions.run();
//         Non_PBRtoPBRMaterial.run();

        // =====================================================
        // =====================================================
        // Animation
        // =====================================================
        // =====================================================

//         PropertyToDocument.run();
//         SetupTargetAndCamera.run();

        // =====================================================
        // =====================================================
        // 3DScene
        // =====================================================
        // =====================================================

//         Save3DMeshesInCustomBinaryFormat.run();
//         InformationToScene.run();


        // =====================================================
        // =====================================================
        // Geometry and Hierarchy
        // =====================================================

//         CubeScene.run();
//         MaterialToCube.run();
//         TransformationToNodeByQuaternion.run();
//         TransformationToNodeByEulerAngles.run();
//         TransformationToNodeByTransformationMatrix.run();
//         NodeHierarchy.run();
//         MeshGeometryData.run();
//         SetupNormalsOnCube.run();
//         TriangulateMesh.run();
//         ConcatenateQuaternions.run();
//         ApplyPBRMaterialToBox.run();

        //// =====================================================
        //// =====================================================
        //// 3D Modeling
        //// =====================================================
        //// =====================================================

//         Primitive3DModels.run();

        // =====================================================
        // =====================================================
        // Working with Objects
        // =====================================================
        // =====================================================

//         SplitMeshbyMaterial.run();
//         ConvertSpherePrimitivetoMesh.run();
//         ConvertBoxPrimitivetoMesh.run();
//         ConvertPlanePrimitivetoMesh.run();
//         ConvertCylinderPrimitivetoMesh.run();
//         ConvertTorusPrimitivetoMesh.run();
//         ConvertBoxMeshtoTriangleMeshCustomMemoryLayout.run();
//         GenerateDataForMeshes.run();
//         BuildTangentAndBinormalData.run();
//         Encode3DMeshinGoogleDraco.run();



        // =====================================================
        // =====================================================
        // Polygons
        // =====================================================
        // =====================================================
//         ConvertPolygonsToTriangles.run();

        // Stop before exiting
        System.out.println("\n\nProgram Finished. Press any key to exit....");
        System.in.read();
    }

    public static String getDataDir() {
        return (new File("Data")).getAbsolutePath() + "/";
    }

    public static String getOutputFilePath(String s) {
        return s.replace(".", "_out.");
    }
}