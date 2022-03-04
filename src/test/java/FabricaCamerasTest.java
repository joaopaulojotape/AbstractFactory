import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


    class FabricaCamerasTest {
        @Test
        void TestD5() {
            IFabricaDeCameras factory = new FabricaCanon();
            FabricaCameras fabricaCameras = new FabricaCameras(factory);
            assertEquals("modelo Full Frame D5", fabricaCameras.getD5MarkIII());
        }

        @Test
        void TestT81() {
            IFabricaDeCameras factory = new FabricaCanon();
            FabricaCameras fabricaCameras = new FabricaCameras(factory);
            assertEquals("modelo T8i", fabricaCameras.getT8i());
        }
        @Test
        void TestD3500() {
            IFabricaDeCameras factory = new FabricaCanon();
            FabricaCameras fabricaCameras = new FabricaCameras(factory);
            assertEquals("modelo D3500", fabricaCameras.getD3500());
        }

    }

