package etc.Z3etc.generic.basic2;

//멀티 제네릭(key, value)
public class Box<K, V> {

    private K key;
    private V value;

    public Box(K key, V value) {//생성자 생성
        this.key = key;
        this.value = value;
    }

    public void put(K key, V value){ //요거 ?? @@ 메서드
        this.key = key;
        this.value = value;
    }

    public V get(K key){//메서드
        return this.value;
    }


    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }




}
