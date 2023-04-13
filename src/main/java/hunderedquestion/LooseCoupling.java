package hunderedquestion;

public class LooseCoupling implements BoobleSort{
    @Override
    public void sort() {

    }

  private   BoobleSort boobleSort;
    public LooseCoupling(BoobleSort sort){
        this.boobleSort=sort;
    }

}
