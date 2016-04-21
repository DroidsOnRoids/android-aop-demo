package droidsonroids.pl.aopdemo;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import static android.opengl.GLES20.GL_COMPILE_STATUS;
import static android.opengl.GLES20.GL_FALSE;
import static android.opengl.GLES20.GL_FRAMEBUFFER_COMPLETE;
import static android.opengl.GLES20.GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT;
import static android.opengl.GLES20.GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS;
import static android.opengl.GLES20.GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT;
import static android.opengl.GLES20.GL_FRAMEBUFFER_UNSUPPORTED;
import static android.opengl.GLES20.GL_LINK_STATUS;
import static android.opengl.GLES20.glCheckFramebufferStatus;
import static android.opengl.GLES20.glGetProgramInfoLog;
import static android.opengl.GLES20.glGetProgramiv;
import static android.opengl.GLES20.glGetShaderInfoLog;
import static android.opengl.GLES20.glGetShaderiv;

@SuppressWarnings("EmptyMethod")
@Aspect
public class DempAspect {

	private static final String TAG = DempAspect.class.getSimpleName();

	@Pointcut("execution(* *.onCreate(..))")
	public void onCreateExecution() {
	}

	@After("onCreateExecution()")
	public void weaveOnCreateExecution() throws Throwable {
		Log.e(TAG, "onCreate executed");
	}

}