package cat.dam.andy.examenuf1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //TextViews Esquerra
    ImageView img_esquerra_r1c1;
    ImageView img_esquerra_r1c2;
    ImageView img_esquerra_r2c1;
    ImageView img_esquerra_r2c2;

    //TextViews Dreta
    ImageView img_dreta_r1c1;
    ImageView img_dreta_r1c2;
    ImageView img_dreta_r2c1;
    ImageView img_dreta_r2c2;

    //ImageButton
    ImageButton greater;
    ImageButton less;
    ImageButton equal;

    //TextView
    TextView tv_punts;

    //Buttons
    Button btn_sortir;

    //Object Class
    static Random rand = new Random();


    //Variables
    public static int puntsUsuari = 0;
    static int nTaulaEsquerra = 0;
    static int nTaulaDreta = 0;


    static ArrayList<Animal> animals = new ArrayList<Animal>();

    /**
     * Funcio que servira per inserir valors dins del ArrayList
     */
    public void Inserir_Animals(){

        Bitmap bmImg0 = BitmapFactory.decodeResource(getResources(),R.drawable.i00);
        animals.add(0, new Animal(bmImg0, 0));
        Bitmap bmImg1 = BitmapFactory.decodeResource(getResources(),R.drawable.i01);
        animals.add(1, new Animal(bmImg1, 1));
        Bitmap bmImg2 = BitmapFactory.decodeResource(getResources(),R.drawable.i02);
        animals.add(2, new Animal(bmImg2, 2));
        Bitmap bmImg3 = BitmapFactory.decodeResource(getResources(),R.drawable.i03);
        animals.add(3, new Animal(bmImg3, 3));
        Bitmap bmImg4 = BitmapFactory.decodeResource(getResources(),R.drawable.i04);
        animals.add(4, new Animal(bmImg4, 4));
        Bitmap bmImg5 = BitmapFactory.decodeResource(getResources(),R.drawable.i05);
        animals.add(5, new Animal(bmImg5, 5));
        Bitmap bmImg6 = BitmapFactory.decodeResource(getResources(),R.drawable.i06);
        animals.add(6, new Animal(bmImg6, 6));
        Bitmap bmImg7 = BitmapFactory.decodeResource(getResources(),R.drawable.i07);
        animals.add(7, new Animal(bmImg7, 7));
        Bitmap bmImg8 = BitmapFactory.decodeResource(getResources(),R.drawable.i08);
        animals.add(8, new Animal(bmImg8, 8));
        Bitmap bmImg9 = BitmapFactory.decodeResource(getResources(),R.drawable.i09);
        animals.add(9, new Animal(bmImg9, 9));
        Bitmap bmImg10 = BitmapFactory.decodeResource(getResources(),R.drawable.i10);
        animals.add(10, new Animal(bmImg10, 10));


    }

    /**
     * Funcio que ens servira per inserir una imatge amb un valor a cada ImageView de la taula esquerra
     * @param img_esquerra_r1c1
     * @param img_esquerra_r1c2
     * @param img_esquerra_r2c1
     * @param img_esquerra_r2c2
     */
    public void InserirTaulaEsquerra(ImageView img_esquerra_r1c1,ImageView img_esquerra_r1c2,ImageView img_esquerra_r2c1,ImageView img_esquerra_r2c2){

        int punts = 0;

        int numRand,casella1,casella2,casella3,casella4;

        numRand = rand.nextInt(10);

        //ImageView img_esquerra_r1c1
        casella1 = numRand;

        img_esquerra_r1c1.setImageBitmap(animals.get(casella1).getImatge());
        punts += animals.get(casella1).getPuntuacio();

        //ImageView img_esquerra_r1c2
        numRand = rand.nextInt(10);
        casella2 = numRand;
        img_esquerra_r1c2.setImageBitmap(animals.get(casella2).getImatge());
        punts += animals.get(casella2).getPuntuacio();


        //ImageView img_esquerra_r2c1
        numRand = rand.nextInt(10);
        casella3 = numRand;
        img_esquerra_r2c1.setImageBitmap(animals.get(casella3).getImatge());
        punts += animals.get(casella3).getPuntuacio();


        //ImageView img_esquerra_r2c2
        numRand = rand.nextInt(10);
        casella4 = numRand;
        img_esquerra_r2c2.setImageBitmap(animals.get(casella4).getImatge());
        punts += animals.get(casella4).getPuntuacio();

        System.out.println("Taula esquerra: " + punts);

        nTaulaEsquerra = punts;
    }

    /**
     * Funcio que ens servira per inserir una imatge amb un valor a cada ImageView de la taula dreta
     * @param img_dreta_r1c1
     * @param img_dreta_r1c2
     * @param img_dreta_r2c1
     * @param img_dreta_r2c2
     */
    public void InserirTaulaDreta(ImageView img_dreta_r1c1,ImageView img_dreta_r1c2,ImageView img_dreta_r2c1,ImageView img_dreta_r2c2){
        int punts = 0;

        int numRand,casella1,casella2,casella3,casella4;

        numRand = rand.nextInt(10);

        //ImageView img_dreta_r1c1
        casella1 = numRand;
        img_dreta_r1c1.setImageBitmap(animals.get(casella1).getImatge());
        punts += animals.get(casella1).getPuntuacio();

        //ImageView img_dreta_r1c2
        numRand = rand.nextInt(10);
        casella2 = numRand;
        img_dreta_r1c2.setImageBitmap(animals.get(casella2).getImatge());
        punts += animals.get(casella2).getPuntuacio();


        //ImageView img_dreta_r2c1
        numRand = rand.nextInt(10);
        casella3 = numRand;
        img_dreta_r2c1.setImageBitmap(animals.get(casella3).getImatge());
        punts += animals.get(casella3).getPuntuacio();


        //ImageView img_dreta_r2c2
        numRand = rand.nextInt(10);
        casella4 = numRand;
        img_dreta_r2c2.setImageBitmap(animals.get(casella4).getImatge());
        punts += animals.get(casella4).getPuntuacio();

        nTaulaDreta = punts;

        System.out.println("Taula dreta: " + punts);
    }

    /**
     * Funcio per calcular el resultat mes la decissio del usuari
     * @param eleccioUser - eleccio del usuari en valor integer
     * @return boolean - true or false depenguent si el usuari ha encertat o no
     */
    public void Resultat(int eleccioUser){

        boolean encertat = false;

        int conclusio = 0;

        //Condicional per saber el resultat entre quina taula te mes animals o si son iguals
        if(nTaulaEsquerra > nTaulaDreta){
            conclusio = 1;
        }
        else if(nTaulaEsquerra < nTaulaDreta){
            conclusio = 3;
        }
        else{
            conclusio = 2;
        }

        //Condicional per saber si la resposta escullida per el usuari es encertada o no
        if(eleccioUser == conclusio){
            encertat = true;
        }
        else{
            encertat = false;
        }

        Usuari_punts(encertat);

    }

    /**
     * Funcio per modificar el puntuatge del usuari
     * @param encertat boolea que representa si el usuari ha encertat o no
     */
    public void Usuari_punts(boolean encertat){

        String punts = tv_punts.getText().toString();
        int puntsConversio = Integer.parseInt(punts); //Aconseguim els punts del usuari mostrats per pantalla i fem la conversio a int per poder treballar amb el numero

        puntsUsuari = puntsConversio; //Guardem els punts que te el usuari dins de la variable que es troba en static

        //Condicional per sumar o restar el puntuatge del usuari
        if(encertat){
            puntsConversio++;
            tv_punts.setText(Integer.toString(puntsConversio));
        }else{
            puntsConversio = 0;
            tv_punts.setText(Integer.toString(puntsConversio));
        }

    }

    /**
     * Funcio que executara totes les funcions necessaries per tal de simular una sessio de joc
     */
    public void SessioJoc(){

        InserirTaulaEsquerra(img_esquerra_r1c1,img_esquerra_r1c2,img_esquerra_r2c1,img_esquerra_r2c2);
        InserirTaulaDreta(img_dreta_r1c1,img_dreta_r1c2,img_dreta_r2c1,img_dreta_r2c2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_esquerra_r1c1 = (ImageView) findViewById(R.id.img_esquerra_r1c1);
        img_esquerra_r1c2 = (ImageView) findViewById(R.id.img_esquerra_r1c2);
        img_esquerra_r2c1 = (ImageView) findViewById(R.id.img_esquerra_r2c1);
        img_esquerra_r2c2 = (ImageView) findViewById(R.id.img_esquerra_r2c2);
        img_dreta_r1c1 = (ImageView) findViewById(R.id.img_dreta_r1c1);
        img_dreta_r1c2 = (ImageView) findViewById(R.id.img_dreta_r1c2);
        img_dreta_r2c1 = (ImageView) findViewById(R.id.img_dreta_r2c1);
        img_dreta_r2c2 = (ImageView) findViewById(R.id.img_dreta_r2c2);
        greater = (ImageButton) findViewById(R.id.greater);
        equal = (ImageButton) findViewById(R.id.equal);
        less = (ImageButton) findViewById(R.id.less);
        tv_punts = (TextView) findViewById(R.id.tv_punts);
        btn_sortir = (Button) findViewById(R.id.btn_sortir);

        Inserir_Animals();
        SessioJoc();


        greater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = 1;
                Resultat(numero);
                SessioJoc();
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = 2;
                Resultat(numero);
                SessioJoc();
            }
        });

        less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = 3;
                Resultat(numero);
                SessioJoc();
            }
        });

        btn_sortir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Credits.class));
                finish();
            }
        });

    }

}