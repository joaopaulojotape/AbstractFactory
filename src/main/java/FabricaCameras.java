public class FabricaCameras {



    private ICameraCrop iCameraCrop;
    private D5MarkIII d5MarkIII;
    private T8i t8i;
    private D3500 d3500;


    public FabricaCameras(IFabricaDeCameras factory){
        this.setiCameraCrop(factory.criarCameraCrop());
        this.d5MarkIII(factory.criarCameraCrop());

    }

    private String d5MarkIII(ICameraCrop criarCameraCrop) {
        return this.getD5MarkIII().exibirinforCameraCrop();
    }

    public String emitir(){
        return this.iCameraCrop.emitir();
    }


    public ICameraCrop getiCameraCrop() {
        return iCameraCrop;
    }

    public void setiCameraCrop(ICameraCrop iCameraCrop) {
        this.iCameraCrop = iCameraCrop;
    }

    public D5MarkIII getD5MarkIII() {
        return d5MarkIII;
    }

    public void setD5MarkIII(D5MarkIII d5MarkIII) {
        this.d5MarkIII = d5MarkIII;
    }

    public D3500 getD3500() {
        return d3500;
    }

    public void setD3500(D3500 d3500) {
        this.d3500 = d3500;
    }

    public T8i getT8i() {
        return t8i;
    }

    public void setT8i(T8i t8i) {
        this.t8i = t8i;
    }
}
