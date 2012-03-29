package org.openhds.android.activity;

import org.openhds.android.storage.PersistentStore;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class FormListActivitity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String user = getIntent().getExtras().getString(AbstractActivity.USERNAME_PARAM);

		PersistentStore store = new PersistentStore(this);

		String[] columns = new String[] { PersistentStore.KEY_FORM_TYPE,
				PersistentStore.KEY_FORMOWNER_ID };
		int[] bindTo = new int[] { android.R.id.text1, android.R.id.text2 };
		Cursor formInstanceCursor = store.getFormsForUsername(user.toUpperCase());

		SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
				android.R.layout.simple_list_item_2, formInstanceCursor,
				columns, bindTo);
		startManagingCursor(formInstanceCursor);
		
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Intent intent = new Intent(getApplicationContext(), FormViewActivity.class);
		intent.putExtra(AbstractActivity.FORM_ID, id);
		startActivity(intent);
	}
}