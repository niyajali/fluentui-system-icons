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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.CubeMultiple: ImageVector
    get() {
        if (_CubeMultiple != null) {
            return _CubeMultiple!!
        }
        _CubeMultiple = ImageVector.Builder(
            name = "Regular.CubeMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.519f, 4.251f)
                curveTo(11.478f, 3.916f, 12.522f, 3.916f, 13.481f, 4.251f)
                curveTo(13.517f, 4.263f, 13.553f, 4.275f, 13.588f, 4.287f)
                lineTo(19.503f, 6.386f)
                curveTo(19.879f, 6.519f, 20.215f, 6.722f, 20.5f, 6.977f)
                verticalLineTo(6.562f)
                curveTo(20.5f, 5.715f, 19.967f, 4.96f, 19.169f, 4.677f)
                lineTo(14.007f, 2.845f)
                curveTo(12.708f, 2.385f, 11.292f, 2.385f, 9.994f, 2.845f)
                lineTo(4.831f, 4.677f)
                curveTo(4.033f, 4.96f, 3.5f, 5.715f, 3.5f, 6.562f)
                verticalLineTo(6.977f)
                curveTo(3.785f, 6.722f, 4.121f, 6.519f, 4.497f, 6.386f)
                lineTo(10.412f, 4.287f)
                curveTo(10.447f, 4.275f, 10.483f, 4.263f, 10.519f, 4.251f)
                close()
                moveTo(6.449f, 10.111f)
                curveTo(6.588f, 9.721f, 7.017f, 9.517f, 7.407f, 9.655f)
                lineTo(12f, 11.285f)
                lineTo(16.593f, 9.655f)
                curveTo(16.983f, 9.517f, 17.412f, 9.721f, 17.551f, 10.111f)
                curveTo(17.689f, 10.502f, 17.485f, 10.93f, 17.095f, 11.069f)
                lineTo(12.75f, 12.61f)
                verticalLineTo(17.331f)
                curveTo(12.75f, 17.745f, 12.414f, 18.081f, 12f, 18.081f)
                curveTo(11.586f, 18.081f, 11.25f, 17.745f, 11.25f, 17.331f)
                verticalLineTo(12.61f)
                lineTo(6.905f, 11.069f)
                curveTo(6.515f, 10.93f, 6.311f, 10.502f, 6.449f, 10.111f)
                close()
                moveTo(10.746f, 5.23f)
                curveTo(11.557f, 4.942f, 12.443f, 4.942f, 13.254f, 5.23f)
                lineTo(19.169f, 7.328f)
                curveTo(19.967f, 7.612f, 20.5f, 8.366f, 20.5f, 9.213f)
                verticalLineTo(17.448f)
                curveTo(20.5f, 18.294f, 19.967f, 19.049f, 19.169f, 19.332f)
                lineTo(13.254f, 21.431f)
                curveTo(12.443f, 21.719f, 11.557f, 21.719f, 10.746f, 21.431f)
                lineTo(4.831f, 19.332f)
                curveTo(4.033f, 19.049f, 3.5f, 18.294f, 3.5f, 17.448f)
                verticalLineTo(9.213f)
                curveTo(3.5f, 8.366f, 4.033f, 7.612f, 4.831f, 7.328f)
                lineTo(10.746f, 5.23f)
                close()
                moveTo(12.752f, 6.643f)
                curveTo(12.266f, 6.47f, 11.734f, 6.47f, 11.248f, 6.643f)
                lineTo(5.333f, 8.742f)
                curveTo(5.133f, 8.813f, 5f, 9.002f, 5f, 9.213f)
                verticalLineTo(17.448f)
                curveTo(5f, 17.659f, 5.133f, 17.848f, 5.333f, 17.919f)
                lineTo(11.248f, 20.018f)
                curveTo(11.734f, 20.19f, 12.266f, 20.19f, 12.752f, 20.018f)
                lineTo(18.667f, 17.919f)
                curveTo(18.867f, 17.848f, 19f, 17.659f, 19f, 17.448f)
                verticalLineTo(9.213f)
                curveTo(19f, 9.002f, 18.867f, 8.813f, 18.667f, 8.742f)
                lineTo(12.752f, 6.643f)
                close()
            }
        }.build()

        return _CubeMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CubeMultiple: ImageVector? = null

@Preview
@Composable
private fun CubeMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CubeMultiple, contentDescription = null)
    }
}
