package ca.uottawa.cookapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shawnco on 11/23/16.
 */

public class AddRecipeActivity extends AppCompatActivity {
    public Button saveButton;
    String[] ingredients = new String[100];
    String[] type = new String[100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_recipe_layout);
        setTitle("Add Recipe");
        setVisible(true);



    }
    public void onClickAddType(View view){
        EditText ingr;
        ingr = (EditText) findViewById(R.id.addTypeText);
        int i = 0;
        while (type[i] != null){
            i++;
        }
        type[i] = (ingr.getText().toString());


    }
    public void addIngredient(View view) {
        EditText ingr;
        ingr = (EditText) findViewById(R.id.addIngredienttext);
        int i = 0;
        while (ingredients[i] != null){
            i++;
    }
        ingredients[i] = (ingr.getText().toString());

    }

    public void save(View view){
        EditText title;
        title =(EditText)findViewById(R.id.editName);
        EditText desc;
        desc=(EditText)findViewById(R.id.editDescription);

    Recipe newRecipe= new Recipe(RecipeManager.recipeList.size()+1,null,title.getText().toString(), ingredients,type, desc.getText().toString());
        RecipeManager.recipeList.add(newRecipe);
        this.finish();

    }

}
