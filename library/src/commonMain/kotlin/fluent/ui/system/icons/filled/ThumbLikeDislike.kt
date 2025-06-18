package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.ThumbLikeDislike: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ThumbLikeDislike",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.04f, 3.177f)
            curveTo(6.305f, 2.561f, 7.104f, 1.772f, 8.22f, 2.062f)
            curveTo(8.92f, 2.243f, 9.424f, 2.663f, 9.709f, 3.239f)
            curveTo(9.957f, 3.742f, 10f, 4.29f, 10.008f, 4.706f)
            curveTo(10.017f, 5.103f, 9.953f, 5.534f, 9.871f, 5.92f)
            horizontalLineTo(10.065f)
            curveTo(11.623f, 5.92f, 12.887f, 7.352f, 12.397f, 8.911f)
            lineTo(11.248f, 12.565f)
            curveTo(10.782f, 14.047f, 9.148f, 14.815f, 7.67f, 14.381f)
            lineTo(3.158f, 13.058f)
            curveTo(2.457f, 12.853f, 1.874f, 12.35f, 1.601f, 11.671f)
            lineTo(1.163f, 10.583f)
            curveTo(0.724f, 9.493f, 1.203f, 8.297f, 2.218f, 7.738f)
            lineTo(3.76f, 6.888f)
            curveTo(3.768f, 6.883f, 3.778f, 6.875f, 3.79f, 6.865f)
            curveTo(3.841f, 6.825f, 3.933f, 6.747f, 4.053f, 6.62f)
            curveTo(4.292f, 6.369f, 4.649f, 5.92f, 5.015f, 5.192f)
            curveTo(5.193f, 4.839f, 5.342f, 4.562f, 5.474f, 4.318f)
            lineTo(5.475f, 4.316f)
            curveTo(5.687f, 3.921f, 5.852f, 3.615f, 6.04f, 3.177f)
            close()
            moveTo(17.96f, 20.823f)
            curveTo(17.695f, 21.439f, 16.896f, 22.228f, 15.78f, 21.938f)
            curveTo(15.08f, 21.757f, 14.576f, 21.337f, 14.291f, 20.761f)
            curveTo(14.043f, 20.258f, 14f, 19.71f, 13.992f, 19.294f)
            curveTo(13.983f, 18.897f, 14.047f, 18.466f, 14.129f, 18.08f)
            horizontalLineTo(13.935f)
            curveTo(12.377f, 18.08f, 11.113f, 16.648f, 11.603f, 15.089f)
            lineTo(12.752f, 11.435f)
            curveTo(13.218f, 9.953f, 14.852f, 9.185f, 16.33f, 9.619f)
            lineTo(20.842f, 10.942f)
            curveTo(21.543f, 11.147f, 22.126f, 11.65f, 22.399f, 12.329f)
            lineTo(22.837f, 13.417f)
            curveTo(23.276f, 14.507f, 22.797f, 15.703f, 21.782f, 16.262f)
            lineTo(20.24f, 17.112f)
            curveTo(20.232f, 17.117f, 20.222f, 17.125f, 20.21f, 17.135f)
            curveTo(20.159f, 17.175f, 20.067f, 17.253f, 19.947f, 17.38f)
            curveTo(19.708f, 17.631f, 19.351f, 18.08f, 18.985f, 18.808f)
            curveTo(18.807f, 19.161f, 18.658f, 19.438f, 18.526f, 19.682f)
            lineTo(18.525f, 19.684f)
            curveTo(18.313f, 20.079f, 18.148f, 20.385f, 17.96f, 20.823f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ThumbLikeDislikePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ThumbLikeDislike, contentDescription = null)
    }
}
