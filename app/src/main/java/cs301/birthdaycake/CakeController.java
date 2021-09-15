package cs301.birthdaycake;

public class CakeController {
    private CakeView CakeViewObj;
    private CakeModel CakeModelObj;
    public CakeController(CakeView obj)
    {
        CakeViewObj = obj;
        CakeModelObj = obj.getCakes();
    }
}
