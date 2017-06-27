/*
    © 2017 Análisis de Programación
    Contacto: http://jlvr@sweaghe.com/blog    
*/

package com.example.ejemploadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adaptador extends BaseAdapter{
	private String[] elements;
	private LayoutInflater inflater;
	private ViewHolderitem holder;
	
	public Adaptador(Context contexto, String[] elementos){
		this.elements = elementos;
		inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	@Override
	public int getCount(){
		return this.elements.length;
	}
	
	@Override
	public Object getItem(int position){
		return position;
	}
	
	@Override
	public long getItemId(int position){
		return position;
	}
	
	static class ViewHolderitem{
		TextView elemento;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		if(convertView == null){
			holder = new ViewHolderitem();
			convertView = inflater.inflate(R.layout.elementos, parent, false);
			holder.elemento = (TextView) convertView.findViewById(R.id.elemento);
			convertView.setTag(holder);
		}else{
			holder = (ViewHolderitem) convertView.getTag();
		}
		
		holder.elemento.setText(this.elements[position]);
		
		return convertView;
	}
}
