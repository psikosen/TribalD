package com.mygdx.game.android;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector3;


public class AndroidLauncher extends  Game implements InputProcessor {


/**
 * Created by Rook on 5/30/2015.
 */



        Texture img;
        TiledMap tiledMap;
        OrthographicCamera camera;
        TiledMapRenderer tiledMapRenderer;
        Sprite sprite;
        Texture texture;
        SpriteBatch sb;
        MapLayer objectLayer;

        TextureRegion textureRegion;

        public void create () {
            float w = Gdx.graphics.getWidth();
            float h = Gdx.graphics.getHeight();

            camera = new OrthographicCamera();
            camera.setToOrtho(false, w, h);
            camera.update();
            tiledMap = new TmxMapLoader().load("MyCrappyMap.tmx");
            tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
            Gdx.input.setInputProcessor(this);

            sb = new SpriteBatch();
            texture = new Texture(Gdx.files.internal("Man.png"));
            sprite = new Sprite(texture);

        }

        public void render () {
            Gdx.gl.glClearColor(1, 0, 0, 1);
            Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
            camera.update();
            tiledMapRenderer.setView(camera);
            tiledMapRenderer.render();
            sb.begin();
            sprite.draw(sb);
            sb.end();

        }

        @Override
        public boolean keyDown(int keycode) {


            return false;
        }
        @Override
        public boolean touchDown(int screenX, int screenY, int pointer, int button) {
            Vector3 clickCoordinates = new Vector3(screenX,screenY,0);
            Vector3 position = camera.unproject(clickCoordinates);
            sprite.setPosition(position.x, position.y);
            return true;
        }

        @Override
        public boolean keyUp(int keycode) {
            if(keycode == Input.Keys.LEFT)
                camera.translate(-32,0);
            if(keycode == Input.Keys.RIGHT)
                camera.translate(32,0);
            if(keycode == Input.Keys.UP)
                camera.translate(0,-32);
            if(keycode == Input.Keys.DOWN)
                camera.translate(0,32);
            if(keycode == Input.Keys.NUM_1)
                tiledMap.getLayers().get(0).setVisible(!tiledMap.getLayers().get(0).isVisible());
            if(keycode == Input.Keys.NUM_2)
                tiledMap.getLayers().get(1).setVisible(!tiledMap.getLayers().get(1).isVisible());
            return false;
        }

        @Override
        public boolean keyTyped(char character) {

            return false;
        }

/*
    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }
*/

        @Override
        public boolean touchUp(int screenX, int screenY, int pointer, int button) {
            return false;
        }

        @Override
        public boolean touchDragged(int screenX, int screenY, int pointer) {
            return false;
        }

        @Override
        public boolean mouseMoved(int screenX, int screenY) {
            return false;
        }

        @Override
        public boolean scrolled(int amount) {
            return false;
        }
    }
