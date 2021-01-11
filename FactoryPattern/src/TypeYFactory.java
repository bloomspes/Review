public class TypeYFactory extends YFactory {

    @Override
    public Youtube createYoutube(String type) {
        Youtube youtube = null;

        switch (type){
            case("노마드코더"):
                youtube = new NomadCoder();
                break;

            case("동빈나"):
                youtube = new DongbinNa();
                break;

            case("조코딩"):
                youtube = new JoCoding();
                break;

                default:
                    youtube = new KyleSchool();
        }

        return youtube;
    }
} 
