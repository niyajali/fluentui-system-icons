package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.PersonProhibited: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonProhibited",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.463f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.463f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.463f, 14.463f, 12f, 17.5f, 12f)
            close()
            moveTo(12.023f, 14f)
            curveTo(11.726f, 14.463f, 11.486f, 14.966f, 11.314f, 15.5f)
            lineTo(4.254f, 15.5f)
            curveTo(3.84f, 15.5f, 3.504f, 15.836f, 3.504f, 16.25f)
            verticalLineTo(17.157f)
            curveTo(3.504f, 17.813f, 3.79f, 18.436f, 4.287f, 18.864f)
            curveTo(5.545f, 19.945f, 7.441f, 20.501f, 10f, 20.501f)
            curveTo(10.599f, 20.501f, 11.162f, 20.471f, 11.689f, 20.41f)
            curveTo(11.937f, 20.91f, 12.251f, 21.374f, 12.618f, 21.791f)
            curveTo(11.815f, 21.931f, 10.942f, 22.001f, 10f, 22.001f)
            curveTo(7.111f, 22.001f, 4.872f, 21.345f, 3.309f, 20.001f)
            curveTo(2.481f, 19.289f, 2.004f, 18.25f, 2.004f, 17.157f)
            verticalLineTo(16.25f)
            curveTo(2.004f, 15.007f, 3.011f, 14f, 4.254f, 14f)
            lineTo(12.023f, 14f)
            close()
            moveTo(20.81f, 15.252f)
            lineTo(15.253f, 20.809f)
            curveTo(15.893f, 21.245f, 16.667f, 21.5f, 17.5f, 21.5f)
            curveTo(19.709f, 21.5f, 21.5f, 19.709f, 21.5f, 17.5f)
            curveTo(21.5f, 16.667f, 21.246f, 15.893f, 20.81f, 15.252f)
            close()
            moveTo(17.5f, 13.5f)
            curveTo(15.291f, 13.5f, 13.5f, 15.291f, 13.5f, 17.5f)
            curveTo(13.5f, 18.334f, 13.755f, 19.107f, 14.191f, 19.748f)
            lineTo(19.748f, 14.191f)
            curveTo(19.108f, 13.755f, 18.334f, 13.5f, 17.5f, 13.5f)
            close()
            moveTo(10f, 2.005f)
            curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
            curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
            curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
            curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
            close()
            moveTo(10f, 3.505f)
            curveTo(8.067f, 3.505f, 6.5f, 5.072f, 6.5f, 7.005f)
            curveTo(6.5f, 8.938f, 8.067f, 10.505f, 10f, 10.505f)
            curveTo(11.933f, 10.505f, 13.5f, 8.938f, 13.5f, 7.005f)
            curveTo(13.5f, 5.072f, 11.933f, 3.505f, 10f, 3.505f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonProhibited, contentDescription = null)
    }
}
