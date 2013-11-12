package com.mario.scvhandbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CharacterSelectActivity extends Activity implements OnItemClickListener{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ListView characters = (ListView)findViewById(R.id.listViewCharacterList);
		
		characters.setAdapter(new ArrayAdapter<String>(
				this,
				R.layout.character_item,
				getResources().getStringArray(R.array.characters)));
		characters.setOnItemClickListener(this);
	}

	public void onItemClick(AdapterView<?> parent, View item, int index, long id) {
		Intent newIntent = new Intent(this, ViewCharacterMovesActivity.class);
		switch(index) {

		case 0:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Aeon");
			break;
		case 1:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Algol");
			break;
		case 2:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Alpha Patroklos");
			break;
		case 3:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Astaroth");
			break;
		case 4:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Cervantes");
			break;
		case 5:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Dampierre");
			break;
		case 6:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Devil Jin");
			break;
		case 7:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Ezio Auditore");
			break;
		case 8:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Hilde");
			break;
		case 9:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Ivy");
			break;
		case 10:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Leixia");
			break;
		case 11:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Maxi");
			break;
		case 12:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Mitsurugi");
			break;
		case 13:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Natsu");
			break;
		case 14:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Nightmare");
			break;
		case 15:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Patroklos");
			break;
		case 16:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Pyrrha");
			break;
		case 17:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Pyrrha Omega");
			break;
		case 18:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Raphael");
			break;
		case 19:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Siegfried");
			break;
		case 20:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Tira");
			break;
		case 21:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Viola");
			break;
		case 22:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Voldo");
			break;
		case 23:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Xiba");
			break;
		case 24:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "Yoshimitsu");
			break;
		case 25:
			newIntent.putExtra("com.mario.scvhandbook.SelectedCharName", "ZWEI");
			break;
		}
		
		startActivity(newIntent);
	}
}