public class FabricaCanon implements  IFabricaDeCameras{


    @Override
    public ICameraCrop criarCameraCrop() {
        return new T8i();
    }
}
