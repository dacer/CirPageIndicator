#CirPageIndicator

A Simple Indicator for Android ViewPager.

##Demo
`CirPageIndicator`folder

## Usage
copy`CirPageIndicator.java`to your project.

```xml
<view
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  class="com.dacer.cirpageindicator.CirPageIndicator"
  android:id="@+id/indicator"/>
```

```java
ViewPager pager = (ViewPager)findViewById(R.id.view_pager);
pager.setAdapter(new IntroPagerAdapter(getSupportFragmentManager()));
CirPageIndicator indicator = (CirPageIndicator)findViewById(R.id.indicator);
indicator.setViewPager(pager);
```


## License

* MIT License

## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/github/android/pulls).

Any contributions, large or small, major features, bug fixes, additional
language translations, unit/integration tests are welcomed