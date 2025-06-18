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

public val FluentUi.Regular.DocumentMultipleProhibited: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentMultipleProhibited",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.503f, 4.627f)
            lineTo(5.5f, 6.75f)
            verticalLineTo(11.076f)
            curveTo(4.977f, 11.157f, 4.474f, 11.3f, 4f, 11.498f)
            verticalLineTo(6.75f)
            curveTo(4f, 5.769f, 4.627f, 4.935f, 5.503f, 4.627f)
            close()
            moveTo(17.747f, 19.504f)
            horizontalLineTo(12.685f)
            curveTo(12.84f, 19.026f, 12.941f, 18.524f, 12.981f, 18.004f)
            horizontalLineTo(17.747f)
            curveTo(18.161f, 18.004f, 18.497f, 17.668f, 18.497f, 17.254f)
            lineTo(18.496f, 9.003f)
            lineTo(15.25f, 9.004f)
            curveTo(14.059f, 9.004f, 13.084f, 8.079f, 13.005f, 6.908f)
            lineTo(13f, 6.754f)
            lineTo(12.999f, 3.5f)
            horizontalLineTo(8.752f)
            curveTo(8.338f, 3.5f, 8.002f, 3.836f, 8.002f, 4.25f)
            verticalLineTo(11.175f)
            curveTo(7.521f, 11.061f, 7.019f, 11f, 6.502f, 11f)
            verticalLineTo(4.25f)
            curveTo(6.502f, 3.007f, 7.51f, 2f, 8.752f, 2f)
            horizontalLineTo(13.128f)
            curveTo(13.725f, 2f, 14.298f, 2.237f, 14.72f, 2.659f)
            lineTo(19.338f, 7.281f)
            curveTo(19.76f, 7.702f, 19.997f, 8.275f, 19.997f, 8.871f)
            verticalLineTo(17.254f)
            curveTo(19.997f, 18.497f, 18.99f, 19.504f, 17.747f, 19.504f)
            close()
            moveTo(14.499f, 4.561f)
            lineTo(14.5f, 6.754f)
            curveTo(14.5f, 7.134f, 14.782f, 7.447f, 15.148f, 7.497f)
            lineTo(15.25f, 7.504f)
            lineTo(17.44f, 7.503f)
            lineTo(14.499f, 4.561f)
            close()
            moveTo(11.186f, 22.004f)
            curveTo(11.613f, 21.56f, 11.978f, 21.055f, 12.266f, 20.504f)
            lineTo(17.366f, 20.504f)
            curveTo(17.057f, 21.378f, 16.224f, 22.004f, 15.244f, 22.004f)
            horizontalLineTo(11.186f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
            curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
            curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
            close()
            moveTo(2.5f, 17.5f)
            curveTo(2.5f, 18.333f, 2.755f, 19.108f, 3.191f, 19.748f)
            lineTo(8.748f, 14.191f)
            curveTo(8.108f, 13.755f, 7.334f, 13.5f, 6.5f, 13.5f)
            curveTo(4.291f, 13.5f, 2.5f, 15.291f, 2.5f, 17.5f)
            close()
            moveTo(6.5f, 21.5f)
            curveTo(8.709f, 21.5f, 10.5f, 19.709f, 10.5f, 17.5f)
            curveTo(10.5f, 16.667f, 10.245f, 15.892f, 9.809f, 15.252f)
            lineTo(4.252f, 20.809f)
            curveTo(4.892f, 21.245f, 5.666f, 21.5f, 6.5f, 21.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentMultipleProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentMultipleProhibited, contentDescription = null)
    }
}
