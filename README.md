# SwipeList
add swipe to recyclerView items. you can add text button or icon button in your swipe list. made by voj
this library work on Api 17 or higher

# How Use? 
first you must add library in your Gradle

  Step1.Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.mhmdVoj:SwipeList:0.1'
	}
  then in activity that want use in list : 
  ```
  new SwipeListHelper(context,recyclerView,buttonWidth){
            @Override
            public void instantiateMyButton(RecyclerView.ViewHolder viewHolder, List<ButtonSwipe> buffer) {
                ButtonSwipe buttonSwipe = new ButtonSwipe(MainActivity.this,
                        "TextButton",
                        isIconEnable=0,
                        TextSize = 30,
                        BacgroundColor = Color.parseColor("#f05454"),
                        new MyButtonClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
                            }
                        }
                );
                buffer.add(buttonSwipe);
            }
        };     
```    
    
    
if want have a icon button more : 

```
new SwipeListHelper(this,rcl_main,200){
            @Override
            public void instantiateMyButton(RecyclerView.ViewHolder viewHolder, List<ButtonSwipe> buffer) {
                ButtonSwipe buttonSwipe = new ButtonSwipe(MainActivity.this,
                        "Remove",
                        0,
                        40,
                        Color.parseColor("#f05454"),
                        new MyButtonClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(MainActivity.this, "Remove", Toast.LENGTH_SHORT).show();
                            }
                        }
                );
                ButtonSwipe buttonSwipeIcon = new ButtonSwipe(MainActivity.this,
                        "Favorite",
                        R.drawable.ic_baseline_favorite_24,
                        40,
                        Color.parseColor("#5aa469"),
                        new MyButtonClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(MainActivity.this, "Favorite", Toast.LENGTH_SHORT).show();
                            }
                        }
                );

                buffer.add(buttonSwipe);
                buffer.add(buttonSwipeIcon);
            }
        };
```

custumize text color in button : 

```
                buttonSwipe.setTextColor(Color.GREEN);
```

# Lisence
This library is licensed under the The MIT License (MIT).
