public class FabricaNikon implements  IFabricaDeCameras{

    @Override
    public ICameraCrop criarCameraCrop() {
        return new D3500();
    }
}
