package northwindProject.demo.core.utilities.results;

public
class SuccessDataResult<T> extends DataResult{
    public SuccessDataResult(T data ,String message ){
        super (data,true );
    }

    public SuccessDataResult(T data){
        super(data,true);
    }
}
