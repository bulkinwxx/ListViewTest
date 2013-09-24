package com.sandy;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public class ListViewAdapter implements ListAdapter{
	class ImageAndText {  
        private String imageUrl;  
        private String text;  
  
        public ImageAndText(String imageUrl, String text) {  
            this.imageUrl = imageUrl;  
            this.text = text;  
        }  
        public String getImageUrl() {  
            return imageUrl;  
        }  
        public String getText() {  
            return text;  
        }  
        } 
	private Activity activity;
	private ArrayList<ImageAndText> list;
	public ListViewAdapter(Activity activity, ArrayList<ImageAndText> list){
		this.activity = activity;
		this.list = list;
	}
	
	
	
	class ViewCache{
		private View baseView;  
        private TextView textView;  
        private ImageView imageView;  
  
        public ViewCache(View baseView) {  
            this.baseView = baseView;  
        }  
  
        public TextView getTextView() {  
            if (textView == null) {  
                textView = (TextView) baseView.findViewById(R.id.text);  
            }  
            return textView;  
        }  
  
        public ImageView getImageView() {  
            if (imageView == null) {  
                imageView = (ImageView) baseView.findViewById(R.id.image);  
            }  
            return imageView;  
        }  
	}

	@Override
	public void registerDataSetObserver(DataSetObserver paramDataSetObserver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ImageAndText getItem(int paramInt) {
		if (paramInt >= list.size()){
			paramInt = list.size() - 1;
		} else if (paramInt < 0){
			paramInt = 0;
		}
		return list.get(paramInt);
	}

	@Override
	public long getItemId(int paramInt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
		View rowView = paramView;  
        ViewCache viewCache;  
        if (rowView == null) {  
            LayoutInflater inflater = activity.getLayoutInflater();  
            rowView = inflater.inflate(R.layout.listitem, null);  
            viewCache = new ViewCache(rowView);  
            rowView.setTag(viewCache);  
        } else {  
            viewCache = (ViewCache) rowView.getTag();  
        }
        
		return null;
	}

	@Override
	public int getItemViewType(int paramInt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean areAllItemsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(int paramInt) {
		// TODO Auto-generated method stub
		return false;
	}

}
