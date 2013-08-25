package com.blackknight;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;
import android.widget.TabHost.TabSpec;

public class MainActivity extends Activity {
	ListView list1;
	ListView list2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Toast.makeText(getApplicationContext(),
				"Versão Beta Black Knight", Toast.LENGTH_LONG).show();

		final String[] charts = new String[] { "Hello Chart","Annotated Time Line",
                "Area Chart",
                "Bar Chart",
                "Bubble Chart",
                "Candlestick Chart",
                "Column Chart",
                "Combo Chart",
                "Gauge",
                "Geo Chart",
                "Geo Map",
                "Image Chart",
                "Image Area Chart",
                "Image Bar Chart",
                "Image Candlestick Chart",
                "Image Line Chart",
                "Image Pie Chart",
                "Intensity Map",
                "Line Chart",
                "Motion Chart",
                "Org Chart",
                "Pie Chart",
                "Pie Chart 3D",
                "Scatter Chart",
                "Sparkline",
                "Stepped Area Chart New!",
                "Table",
                "Tree Map "};

		final String[] outraInformacao = new String[] { "Capturar Informações",

		};

		TabHost tabs = (TabHost) this.findViewById(android.R.id.tabhost);
		tabs.setup();
		TabSpec tspec1 = tabs.newTabSpec("First Tab");
		tspec1.setIndicator("Criação de Gráfico");
		tspec1.setContent(R.id.tab1);
		tabs.addTab(tspec1);

		TabSpec tspec2 = tabs.newTabSpec("Second Tab");
		tspec2.setIndicator("Coletar Dados");
		tspec2.setContent(R.id.tab2);
		tabs.addTab(tspec2);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, charts);
		list1 = (ListView) findViewById(R.id.listView1);
		list1.setAdapter(adapter);

		ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, outraInformacao);
		list2 = (ListView) findViewById(R.id.listView2);
		list2.setAdapter(adapter1);

		// React to user clicks on item
		list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView<?> parentAdapter, View view,
					int position, long id) {
                switch (position) {
                    case 0://Hello Chart
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this, HelloPizzaChartActivity.class);
                        startActivity(intent);

                        break;

                    case 1://Annotated Time Line
                        Intent intent1 = new Intent();
                        intent1.setClass(MainActivity.this, AnnotatedTimeLine.class);
                        startActivity(intent1);

                        break;
                    case 2://Area Chart
                        Intent intent2 = new Intent();
                        intent2.setClass(MainActivity.this, AreaChart.class);
                        startActivity(intent2);


                        break;
                    case 3://Bar Chart
                        Intent intent3 = new Intent();
                        intent3.setClass(MainActivity.this, BarChart.class);
                        startActivity(intent3);

                        break;
                    case 4://Bubble Chart
                        Intent intent4 = new Intent();
                        intent4.setClass(MainActivity.this, BubbleChart.class);
                        startActivity(intent4);

                        break;
                    case 5://Candle Stick Chart
                        Intent intent5 = new Intent();
                        intent5.setClass(MainActivity.this, CandleStickChart.class);
                        startActivity(intent5);

                        break;

                    case 6://Column Chart
                        Intent intent6 = new Intent();
                        intent6.setClass(MainActivity.this, ColumnChart.class);
                        startActivity(intent6);

                        break;
                    case 7://Combo Chart
                        Intent intent7 = new Intent();
                        intent7.setClass(MainActivity.this, ComboChart.class);
                        startActivity(intent7);

                        break;
                    case 8://Roteiro Nova Iguaçu

                        break;

                    case 9://Roteiro Petrópolis

                        break;

                    case 10://Roteiro Tijuca

                        break;

                    case 11://Roteiro Complementar(van) - Rocha Miranda

                        break;

                    case 12://Roteiro Complementar(van) - São Gonçalo

                        break;

                    case 13://Roteiro Complementar (van) - Iha do Governador

                        break;

                    case 15://Roteiro Adrianópolis - Barra

                        break;

                    case 16://Roteiro Adrianópolis - Cabuçu ‎

                        break;

                    case 17://Roteiro Adrianópolis - Campo Grande ‎

                        break;

                    case 18://Roteiro Adrianópolis - Caxias

                        break;

                    case 19://Roteiro Adrianópolis - Ilha

                        break;

                    case 20://Roteiro Adrianópolis - Itaipu ‎

                        break;

                    case 21://Roteiro Adrianópolis - Tijuca ‎

                        break;

                    case 22://Roteiro Adrianópolis - Zona Sul

                        break;

                    case 23://Roteiro Adrianópolis - Zona Sul

                        break;

                    case 24://Pie Chart 3D

                        Intent intent25 = new Intent();
                        intent25.setClass(MainActivity.this, PieChart3d.class);
                        startActivity(intent25);

                        break;

                    case 25:



                        break;

                }

            }
        });


		// React to user clicks on item
		list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView<?> parentAdapter, View view,
					int position, long id) {

			}

		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
