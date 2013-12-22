package com.eozaki.droid.of.hearts;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Droid Of Hearts");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    int nns=0;
    int nwe=0;
    
    public void setVNS(View v){
	    if (nns<3){
	    	final LinearLayout l1=(LinearLayout) findViewById(R.id.linha1);
	    	l1.setBackgroundColor(Color.parseColor("#AAAAFF"));
	    	final Button ns=(Button) findViewById(R.id.ns1);
	    	final Button ew=(Button) findViewById(R.id.ew1);
	    	ns.setEnabled(false);
	    	ew.setEnabled(false);
	    	nns++;
	    }
    }
    public void setVEW(View v){
	    if(nwe<3){
	    	final LinearLayout l1=(LinearLayout) findViewById(R.id.linha1);
	    	l1.setBackgroundColor(Color.parseColor("#FFAAAA"));
	    	final Button ns=(Button) findViewById(R.id.ns1);
	    	final Button ew=(Button) findViewById(R.id.ew1);
	    	ns.setEnabled(false);
	    	ew.setEnabled(false);
	    	nwe++;
	    }
    }
    public void setCNS(View v){
    	if(nns<3){
	    	final LinearLayout l2=(LinearLayout) findViewById(R.id.linha2);
	    	l2.setBackgroundColor(Color.parseColor("#AAAAFF"));
	    	final Button ns=(Button) findViewById(R.id.ns2);
	    	final Button ew=(Button) findViewById(R.id.ew2);
	    	ns.setEnabled(false);
	    	ew.setEnabled(false);
	    	nns++;
    	}
    }
    public void setCEW(View v){
    	if(nwe<3){
	    	final LinearLayout l2=(LinearLayout) findViewById(R.id.linha2);
	    	l2.setBackgroundColor(Color.parseColor("#FFAAAA"));
	    	final Button ns=(Button) findViewById(R.id.ns2);
	    	final Button ew=(Button) findViewById(R.id.ew2);
	    	ns.setEnabled(false);
	    	ew.setEnabled(false);
	    	nwe++;
    	}
    }
    public void setHNS(View v){
    	if(nns<3){
	    	final LinearLayout l2=(LinearLayout) findViewById(R.id.linha3);
	    	l2.setBackgroundColor(Color.parseColor("#AAAAFF"));
	    	final Button ns=(Button) findViewById(R.id.ns3);
	    	final Button ew=(Button) findViewById(R.id.ew3);
	    	ns.setEnabled(false);
	    	ew.setEnabled(false);
	    	nns++;
    	}
    }
    public void setHEW(View v){
    	if(nwe<3){
	    	final LinearLayout l2=(LinearLayout) findViewById(R.id.linha3);
	    	l2.setBackgroundColor(Color.parseColor("#FFAAAA"));
	    	final Button ns=(Button) findViewById(R.id.ns3);
	    	final Button ew=(Button) findViewById(R.id.ew3);
	    	ns.setEnabled(false);
	    	ew.setEnabled(false);
	    	nwe++;
    	}
    }
    public void setMNS(View v){
    	if(nns<3){
	    	final LinearLayout l2=(LinearLayout) findViewById(R.id.linha4);
	    	l2.setBackgroundColor(Color.parseColor("#AAAAFF"));
	    	final Button ns=(Button) findViewById(R.id.ns4);
	    	final Button ew=(Button) findViewById(R.id.ew4);
	    	ns.setEnabled(false);
	    	ew.setEnabled(false);
	    	nns++;
    	}
    }
    public void setMEW(View v){
    	if(nwe<3){
	    	final LinearLayout l2=(LinearLayout) findViewById(R.id.linha4);
	    	l2.setBackgroundColor(Color.parseColor("#FFAAAA"));
	    	final Button ns=(Button) findViewById(R.id.ns4);
	    	final Button ew=(Button) findViewById(R.id.ew4);
	    	ns.setEnabled(false);
	    	ew.setEnabled(false);
	    	nwe++;
    	}
    }
    public void setUNS(View v){
    	if(nns<3){
	    	final LinearLayout l2=(LinearLayout) findViewById(R.id.linha5);
	    	l2.setBackgroundColor(Color.parseColor("#AAAAFF"));
	    	final Button ns=(Button) findViewById(R.id.ns5);
	    	final Button ew=(Button) findViewById(R.id.ew5);
	    	ns.setEnabled(false);
	    	ew.setEnabled(false);
	    	nns++;
    	}
    }
    public void setUEW(View v){
    	if(nwe<3){
	    	final LinearLayout l2=(LinearLayout) findViewById(R.id.linha5);
	    	l2.setBackgroundColor(Color.parseColor("#FFAAAA"));
	    	final Button ns=(Button) findViewById(R.id.ns5);
	    	final Button ew=(Button) findViewById(R.id.ew5);
	    	ns.setEnabled(false);
	    	ew.setEnabled(false);
	    	nwe++;
    	}
    }
    public void setKNS(View v){
    	if(nns<3){
	    	final LinearLayout l2=(LinearLayout) findViewById(R.id.linha6);
	    	final Button ns=(Button) findViewById(R.id.ns6);
	    	final Button ew=(Button) findViewById(R.id.ew6);
	    	ns.setEnabled(false);
	    	ew.setEnabled(false);
	    	l2.setBackgroundColor(Color.parseColor("#AAAAFF"));
	    	nns++;
    	}
    }
    public void setKEW(View v){
    	if(nwe<3){
	    	final LinearLayout l2=(LinearLayout) findViewById(R.id.linha6);
	    	l2.setBackgroundColor(Color.parseColor("#FFAAAA"));
	    	final Button ns=(Button) findViewById(R.id.ns6);
	    	final Button ew=(Button) findViewById(R.id.ew6);
	    	ns.setEnabled(false);
	    	ew.setEnabled(false);
	    	nwe++;
    	}
    }
    
    public void atualizar(View v){
    	atualiza();
    }
    
    public void atualiza(){
    	final EditText vazas=(EditText) findViewById(R.id.vazas);
    	final EditText copas=(EditText) findViewById(R.id.copas);
    	final EditText homens=(EditText) findViewById(R.id.homens);
    	final EditText mulheres=(EditText) findViewById(R.id.mulheres);
    	final EditText u2=(EditText) findViewById(R.id.u2);
    	final EditText king=(EditText) findViewById(R.id.king);
    	final EditText pns1=(EditText) findViewById(R.id.pns1);
    	final EditText pns2=(EditText) findViewById(R.id.pns2);
    	final EditText pew1=(EditText) findViewById(R.id.pew1);
    	final EditText pew2=(EditText) findViewById(R.id.pew2);
    	final TextView p=(TextView) findViewById(R.id.lblplacar);
    	int placar=0;
    	if(vazas.getText().toString().length()!=0){
    		if(Integer.parseInt(vazas.getText().toString())>13){
    			vazas.setText(Integer.toString(13));
    		}
    		placar-=(((Integer.parseInt(vazas.getText().toString()))-(13-Integer.parseInt(vazas.getText().toString())))*20);
    	}

    	if(copas.getText().toString().length()!=0){
    		if(Integer.parseInt(copas.getText().toString())>13){
    			copas.setText(Integer.toString(13));
    		}
    		placar-=(((Integer.parseInt(copas.getText().toString()))-(13-Integer.parseInt(copas.getText().toString())))*20);
    	}

    	if(homens.getText().toString().length()!=0){
    		if(Integer.parseInt(homens.getText().toString())>8){
    			homens.setText(Integer.toString(8));
    		}
    		placar-=(((Integer.parseInt(homens.getText().toString()))-(8-Integer.parseInt(homens.getText().toString())))*30);
    	}

    	if(mulheres.getText().toString().length()!=0){
    		if(Integer.parseInt(mulheres.getText().toString())>4){
    			mulheres.setText(Integer.toString(4));
    		}
    		placar-=(((Integer.parseInt(mulheres.getText().toString()))-(4-Integer.parseInt(mulheres.getText().toString())))*50);
    	}

    	if(u2.getText().toString().length()!=0){
    		if(Integer.parseInt(u2.getText().toString())>2){
    			u2.setText(Integer.toString(2));
    		}
    		placar-=(((Integer.parseInt(u2.getText().toString()))-(2-Integer.parseInt(u2.getText().toString())))*90);
    	}

    	if(king.getText().toString().length()!=0){
    		if(Integer.parseInt(king.getText().toString())>1){
    			king.setText(Integer.toString(1));
    		}
    		placar-=(((Integer.parseInt(king.getText().toString()))-(1-Integer.parseInt(king.getText().toString())))*160);
    	}

    	if(pns1.getText().toString().length()!=0){
    		if(Integer.parseInt(pns1.getText().toString())>13){
    			pns1.setText(Integer.toString(13));
    		}
    		placar+=(((Integer.parseInt(pns1.getText().toString()))-(13-Integer.parseInt(pns1.getText().toString())))*25);
    	}

    	if(pns2.getText().toString().length()!=0){
    		if(Integer.parseInt(pns2.getText().toString())>13){
    			pns2.setText(Integer.toString(13));
    		}
    		placar+=(((Integer.parseInt(pns2.getText().toString()))-(13-Integer.parseInt(pns2.getText().toString())))*25);
    	}

    	if(pew1.getText().toString().length()!=0){
    		if(Integer.parseInt(pew1.getText().toString())>13){
    			pew1.setText(Integer.toString(13));
    		}
    		placar+=(((Integer.parseInt(pew1.getText().toString()))-(13-Integer.parseInt(pew1.getText().toString())))*25);
    	}

    	if(pew2.getText().toString().length()!=0){
    		if(Integer.parseInt(pew2.getText().toString())>13){
    			pew2.setText(Integer.toString(13));
    		}
    		placar+=(((Integer.parseInt(pew2.getText().toString()))-(13-Integer.parseInt(pew2.getText().toString())))*25);
    	}
    	if(placar>=1000 || placar<=-1000){
    		Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        	v.vibrate(300);
        	Toast.makeText(MainActivity.this, "Olha a mesa!", Toast.LENGTH_SHORT).show();
    	}
    	p.setText(Integer.toString(placar));
    }
    
public void confirmaLimpa(View v){
		new AlertDialog.Builder(this)
	    .setIcon(android.R.drawable.ic_dialog_alert)
	    .setTitle("Limpando o placar")
	    .setMessage("Voce tem certeza de que deseja limpar o placar?")
	    .setPositiveButton("Aye, Captain!", new DialogInterface.OnClickListener()
	{
	    @Override
	    public void onClick(DialogInterface dialog, int which) {
	    	final EditText vazas=(EditText) findViewById(R.id.vazas);
	    	final EditText copas=(EditText) findViewById(R.id.copas);
	    	final EditText homens=(EditText) findViewById(R.id.homens);
	    	final EditText mulheres=(EditText) findViewById(R.id.mulheres);
	    	final EditText u2=(EditText) findViewById(R.id.u2);
	    	final EditText king=(EditText) findViewById(R.id.king);
	    	final EditText pns1=(EditText) findViewById(R.id.pns1);
	    	final EditText pns2=(EditText) findViewById(R.id.pns2);
	    	final EditText pew1=(EditText) findViewById(R.id.pew1);
	    	final EditText pew2=(EditText) findViewById(R.id.pew2);
	    	final LinearLayout l1=(LinearLayout) findViewById(R.id.linha1);
	    	final LinearLayout l2=(LinearLayout) findViewById(R.id.linha2);
	    	final LinearLayout l3=(LinearLayout) findViewById(R.id.linha3);
	    	final LinearLayout l4=(LinearLayout) findViewById(R.id.linha4);
	    	final LinearLayout l5=(LinearLayout) findViewById(R.id.linha5);
	    	final LinearLayout l6=(LinearLayout) findViewById(R.id.linha6);
	    	final Button b1=(Button) findViewById(R.id.ns1);
	    	final Button b2=(Button) findViewById(R.id.ns2);
	    	final Button b3=(Button) findViewById(R.id.ns3);
	    	final Button b4=(Button) findViewById(R.id.ns4);
	    	final Button b5=(Button) findViewById(R.id.ns5);
	    	final Button b6=(Button) findViewById(R.id.ns6);
	    	final Button b7=(Button) findViewById(R.id.ew1);
	    	final Button b8=(Button) findViewById(R.id.ew2);
	    	final Button b9=(Button) findViewById(R.id.ew3);
	    	final Button b10=(Button) findViewById(R.id.ew4);
	    	final Button b11=(Button) findViewById(R.id.ew5);
	    	final Button b12=(Button) findViewById(R.id.ew6);
	    		    	
	    	l1.setBackgroundColor(Color.parseColor("#FFFFFF"));
	    	l2.setBackgroundColor(Color.parseColor("#FFFFFF"));
	    	l3.setBackgroundColor(Color.parseColor("#FFFFFF"));
	    	l4.setBackgroundColor(Color.parseColor("#FFFFFF"));
	    	l5.setBackgroundColor(Color.parseColor("#FFFFFF"));
	    	l6.setBackgroundColor(Color.parseColor("#FFFFFF"));
	    	b1.setEnabled(true);
	    	b2.setEnabled(true);
	    	b3.setEnabled(true);
	    	b4.setEnabled(true);
	    	b5.setEnabled(true);
	    	b6.setEnabled(true);
	    	b7.setEnabled(true);
	    	b8.setEnabled(true);
	    	b9.setEnabled(true);
	    	b10.setEnabled(true);
	    	b11.setEnabled(true);
	    	b12.setEnabled(true);
	    	nns=0;
	    	nwe=0;
	    	vazas.setText("");
	    	copas.setText("");
	    	homens.setText("");
	    	mulheres.setText("");
	    	u2.setText("");
	    	king.setText("");
	    	pns1.setText("");
	    	pns2.setText("");
	    	pew1.setText("");
	    	pew2.setText("");	    	

	    	atualiza();	       	
	    }
	
	})
	.setNegativeButton("Nay!", null)
	.show();
}
    
}