package com.blackknight;

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
                "Line Chart",
                "Map",
                "Org Chart",
                "ScatterChart",
                "Stepped Area Chart",
                "Table",
                "Timelines",
                "Treemap",
                "PieChart3d"
                };

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

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, charts);
		list1 = (ListView) findViewById(R.id.listView1);
		list1.setAdapter(adapter);

		ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, outraInformacao);
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
                    case 8://Gauge
                        Intent intent8 = new Intent();
                        intent8.setClass(MainActivity.this, Gauge.class);
                        startActivity(intent8);

                        break;

                    case 9://Geo Chart
                        Intent intent9 = new Intent();
                        intent9.setClass(MainActivity.this, GeoChart.class);
                        startActivity(intent9);


                        break;

                    case 10://Geo Map Chart
                        Intent intent10 = new Intent();
                        intent10.setClass(MainActivity.this, GeoMap.class);
                        startActivity(intent10);

                        break;

                    case 11://Line Chart
                        Intent intent11 = new Intent();
                        intent11.setClass(MainActivity.this, LineChart.class);
                        startActivity(intent11);

                        break;

                    case 12://Map
                        Intent intent12 = new Intent();
                        intent12.setClass(MainActivity.this, Map.class);
                        startActivity(intent12);

                        break;

                    case 13://Org Chart
                        Intent intent13 = new Intent();
                        intent13.setClass(MainActivity.this, OrgChart.class);
                        startActivity(intent13);

                        break;

                    case 14://Scatter Chart
                        Intent intent14 = new Intent();
                        intent14.setClass(MainActivity.this, ScatterChart.class);
                        startActivity(intent14);

                        break;

                    case 15://Stepped Area Chart‎
                        Intent intent15 = new Intent();
                        intent15.setClass(MainActivity.this, SteppedAreaChart.class);
                        startActivity(intent15);

                        break;

                    case 16://Table
                        Intent intent16 = new Intent();
                        intent16.setClass(MainActivity.this, Table.class);
                        startActivity(intent16);
                        break;

                    case 17://Timelines

                        Intent intent17 = new Intent();
                        intent17.setClass(MainActivity.this, Timelines.class);
                        startActivity(intent17);
                        break;

                    case 18://Treemap
                        Intent intent18 = new Intent();
                        intent18.setClass(MainActivity.this, Treemap.class);
                        startActivity(intent18);

                        break;

                    case 19://Pie Chart 3d‎

                        Intent intent19 = new Intent();
                        intent19.setClass(MainActivity.this, PieChart3d.class);
                        startActivity(intent19);
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
